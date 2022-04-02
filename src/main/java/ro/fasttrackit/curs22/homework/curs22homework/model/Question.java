package ro.fasttrackit.curs22.homework.curs22homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {

    @Id
    @GeneratedValue
    private int id;
    private String quest;
    private String opt1;
    private String opt2;
    private String opt3;
    private boolean valid1;
    private boolean valid2;
    private boolean valid3;
    private String choose;
    private String correctAnswer;

    public Question() {
    }

    public Question(String quest, String opt1, String opt2, String opt3, boolean valid1, boolean valid2, boolean valid3, String choose, String correctAnswer) {
        this.quest = quest;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.valid1 = valid1;
        this.valid2 = valid2;
        this.valid3 = valid3;
        this.choose = choose;
        this.correctAnswer = correctAnswer;
    }

    public boolean isValid1() {
        return valid1;
    }

    public void setValid1(boolean valid1) {
        this.valid1 = valid1;
    }

    public boolean isValid2() {
        return valid2;
    }

    public void setValid2(boolean valid2) {
        this.valid2 = valid2;
    }

    public boolean isValid3() {
        return valid3;
    }

    public void setValid3(boolean valid3) {
        this.valid3 = valid3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}


