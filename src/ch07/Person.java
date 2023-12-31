package ch07;


// 인간 정보
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 개인정보 출력
    public void introduce() {
        System.out.println("안녕하세요, 제 이름은 " + name + "이고, 나이는 "+ age +"살 입니다.");
    }

    public void work() {
        if (this instanceof Student) {
            ((Student) this).study();  // (Student) this this(해당 객체를)를 Student로 형변환
        } else if (this instanceof Lecturer) {
            ((Lecturer) this).teach();
        }
    }

}
