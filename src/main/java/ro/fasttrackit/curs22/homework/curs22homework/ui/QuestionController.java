package ro.fasttrackit.curs22.homework.curs22homework.ui;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.curs22.homework.curs22homework.model.AnsweredQuestion;
import ro.fasttrackit.curs22.homework.curs22homework.model.Question;
import ro.fasttrackit.curs22.homework.curs22homework.service.QuestionService;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Controller
public class QuestionController {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("questions")
    public String viewHomePage(Model model){
        return findPaginated(1, model);
    }

    @GetMapping("/final/{id}")
    String getQuestionPage(@PathVariable(value = "id") int id, Model model){
        Question questions = service.getQuestionById(id);
        model.addAttribute("questions", questions);
        return "questions";
    }

    @PostMapping("/result/{id}")
    String submit(@PathVariable(value = "id") @ModelAttribute("questions") AnsweredQuestion answeredQuestion, int id, Model model){
        Question question = service.getQuestionById(id);
        boolean result = service.checkAnswer(answeredQuestion);
        model.addAttribute("questions", question);
        model.addAttribute("result", result);
        return ("/result");
    }

    @GetMapping("/showNewQuestionForm")
    public String showNewQuestionForm(Model model) {
        Question question = new Question();
        model.addAttribute("questions", question);
        return "newQuestion";
    }

    @PostMapping("/saveQuestion")
    public String saveQuestion(@ModelAttribute("questions") Question question) {
        service.saveQuestion(question);
        return "redirect:/questions";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
        Question question = service.getQuestionById(id);
        model.addAttribute("questions", question);
        return "updateQuestion";
    }

    @GetMapping("/deleteQuestion/{id}")
    public String deleteQuestion(@PathVariable(value = "id") int id) {
        this.service.deleteQuestionById(id);
        return "redirect:/questions";
    }

    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,Model model) {
        int pageSize = 5;
        Page<Question> page = service.findPaginated(pageNo, pageSize);
        List<Question> questionsList = page.getContent();
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("questionsList", questionsList);
        return "list";
    }
}
