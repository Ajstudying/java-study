package ch07;

public class PersonManager {
    public void work(Person p) {
        if (p instanceof Student) {
            ((Student) p).study();  // (Student) this this(해당 객체를)를 Student로 형변환
        } else if (p instanceof Lecturer) {
            ((Lecturer) p).teach();
        }
    }
}
