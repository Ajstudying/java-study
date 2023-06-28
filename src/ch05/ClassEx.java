package ch05;

import java.util.ArrayList;
import java.util.List;

public class ClassEx {
    public static void main(String[] args) {
        // Student 클래스 객체를 생성하고 메서드를 실행
        Student student1 = new Student("John",10,15);
        student1.printStudentInfo();

        Student student2 = new Student();
        student2.setAge(16);
        student2.setName("Lisa");
        student2.setGrade(11);

        student2.printStudentInfo();

        student2.promoteGrade(11);
        student2.printStudentInfo();
        student2.getAge();





    }
}
