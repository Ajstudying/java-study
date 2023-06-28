package ch06.map;

public class StudentPractice {
    private String name;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public StudentPractice(String name, double score) {
        this.name = name;
        this.score = score;
    }
}
