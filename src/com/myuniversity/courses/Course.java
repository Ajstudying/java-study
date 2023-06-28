package com.myuniversity.courses;

//다른 패키지에 있는 클래스를 가져다 쓰는 방법
// import 패키지명.... 클래스명;
// import 패키지명...*; //해당 패키지 모든 클래스(별로 추천하지 않음)


import com.myuniversity.students.GraduateStudent;
import com.myuniversity.students.Student;
import com.myuniversity.students.UndergraduateStudent;
//이렇게 따로 쓰는게 어떤 걸 쓰는지 명확하게 알 수 있기 때문에 보통 이렇게 사용!
// import com.myuniversity.students.*; 위의 모든 걸 사용할 때 이걸로 함!!

public class Course {
    private String courseName;
    private Student[] students;

    //final 변수
    //상수(constant): 초기화만 가능하고, 변경 불가능한 값
//    private int maxStudent = 20;    // 과목에 몇명의 학생이 참여 가능한지
    // 상수는 대문자 snake-case 많이 사용한다. (관례, convention)
    private final int MAX_STUDENT = 20;    // 과목에 몇명의 학생이 참여 가능한지
    private int numOfStudents = 0;  //현재 과목에 몇명의 학생이 있는지
    private GraduateStudent[] graduateStudents;

    private UndergraduateStudent[] undergraduateStudents;

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }

    public GraduateStudent[] getGraduateStudents() {
        return graduateStudents;
    }

    public Course(String courseName, int maxStudent){
        this.courseName = courseName;
//        this.MaxStudent = maxStudent;
        this.students = new Student[maxStudent];
//        this.numOfStudents = 0; 위에서 초기화 안하면 여기에 한꺼번에
    }


    // 해당 코스에 학생 참가
    public void joinStudent(Student student){
        this.students[numOfStudents] = student;
        this.numOfStudents++;
        System.out.println("--"+student.getName()+"학생이 추가되었습니다. --");
    }



}
