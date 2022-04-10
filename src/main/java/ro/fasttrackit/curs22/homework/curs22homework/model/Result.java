package ro.fasttrackit.curs22.homework.curs22homework.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component
@Entity
public class Result {

    @Id
    @GeneratedValue
    private int id;
    private int totalCorrect=0;
    private int totalWrong=0;

    public Result(){
    }

    public Result(int totalCorrect, int totalWrong){
        this.totalCorrect = totalCorrect;
        this.totalWrong = totalWrong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalCorrect() {
        return totalCorrect;
    }

    public void setTotalCorrect(int totalCorrect) {
        this.totalCorrect = totalCorrect;
    }

    public int getTotalWrong() {
        return totalWrong;
    }

    public void setTotalWrong(int totalWrong) {
        this.totalWrong = totalWrong;
    }
}
