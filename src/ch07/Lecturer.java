package ch07;

public class Lecturer extends Person {

    private int carrerTerm;

    public Lecturer(String name, int age, int carrerTerm){
        super(name, age);
        this.carrerTerm = carrerTerm;
    }

    @Override
    public void introduce() {
        System.out.println("저의 강의 경력은 "+ this.carrerTerm + "년 입니다.");
    }

    public void teach() {
        System.out.println(name + "이(가) 강의를 시작합니다.");
    }


}
