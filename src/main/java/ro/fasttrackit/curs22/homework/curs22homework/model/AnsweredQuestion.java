package ro.fasttrackit.curs22.homework.curs22homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AnsweredQuestion {

    @Id
    @GeneratedValue
    private int answerId;
    private String answer;

    public AnsweredQuestion() {

    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
