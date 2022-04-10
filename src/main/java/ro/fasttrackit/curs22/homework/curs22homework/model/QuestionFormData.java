package ro.fasttrackit.curs22.homework.curs22homework.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionFormData {

    List<Question> questions;

    public QuestionFormData(){
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
