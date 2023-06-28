package ch08;

import ch08.InterfaceBundle.Gradable;
import ch08.InterfaceBundle.Studyable;

public class Student implements Studyable, Gradable {
    private int score;
    private String name;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void calculateGrade() {
        if (this.score >= 90){
            System.out.println(name + "학생의 점수는 A입니다.");
        } else if (this.score >= 80){
            System.out.println(name + "학생의 점수는 B입니다.");
        } else if (this.score >= 70){
            System.out.println(name + "학생의 점수는 C입니다.");
        } else if (this.score >= 60) {
            System.out.println(name + "학생의 점수는 D입니다.");
        } else {
            System.out.println(name + "학생의 점수는 F입니다.");
        }
    }

    public void study() {
        System.out.println(name + "학생이 공부합니다.");
    }
}
