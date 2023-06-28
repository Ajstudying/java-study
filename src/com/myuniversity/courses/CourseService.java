package com.myuniversity.courses;

import ch05.accessModifier.Animal;
import com.myuniversity.students.Student;

import java.util.Scanner;
//학과 과목과 관련된 기능을 제공해주는 클래스
public class CourseService {
    //서비스를 실행할 수 있는 run 메서드
    //run 메서드를 Main.main 메서드에서 실행하면 됨.

    private Scanner scanner;
    private Course[] courseList; //생성된 과목 배열
    private int numCourse;  //성성된 과목수


    public CourseService(int MaxSize){
        this.scanner = new Scanner(System.in);
        this.numCourse = 0;
        this.courseList = new Course[MaxSize];
    }


    public Course findCourseName (String courseName){
        for (int i = 0; i < numCourse; i++) {
            String n = courseList[i].getCourseName();
            if (n.equals(courseName)){
                return courseList[i];
            }
        }return null;
    }
    public void creatCourse(String courseName, int MaxStudent){
        Course c = new Course(courseName, MaxStudent);
        this.courseList[numCourse] = c;
        numCourse++;
        System.out.println(courseName+"과목이 생성되었습니다.");
    }
    public void assignCourse(String courseName, String studentName){
        Course c = findCourseName(courseName);
        if( c == null){
            System.out.println("과목의 이름을 다시 입력해주세요.");
        }else{
            c.joinStudent(new Student(studentName));

        }
    }

    public void printStudentByCourseName(String courseName){
        Course c = findCourseName(courseName);
        if( c == null) {
            System.out.println("과목의 이름을 다시 입력해주세요.");
        }else {
            int numbers = c.getNumOfStudents();
            if (numbers == 0) {
                System.out.println("해당 과목을 듣는 학생이 없습니다.");
            } else {
                System.out.println(courseName + "의 총 학생 수는 " + numbers);
            }
        }

    }


    public void printStudentByStudentName(String courseName){
        Course c = findCourseName(courseName);
        if( c == null) {
            System.out.println("과목의 이름을 다시 입력해주세요.");
        }else {
            int numbers = c.getNumOfStudents();
            if (numbers == 0) {
                System.out.println("해당 과목을 듣는 학생이 없습니다.");
            } else {
                    Student[] a = c.getStudents();
                    System.out.println(courseName+"에 참여한 학생은");
                    for (int j = 0; j < a.length; j++) {
                        if(a[j]==null){
                            break;
                        }else{
                            System.out.print(a[j].getName()+" ");
                        }
                    }
            }
        }

    }




    public void run() {
        while (true){
            System.out.println("\n=== 학생 관리 프로그램 ===");
            System.out.println("1. 과목을 생성합니다.");
            System.out.println("2. 과목에 학생을 추가합니다.");
            System.out.println("3. 과목에 참여한 학생수를 조회합니다.");
            System.out.println("4. 과목에 참여한 학생 이름을 조회합니다.");
            System.out.println("0. 종료");
            System.out.print("원하는 기능을 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            if (choice == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice){
                case 1:
                    System.out.print("과목 이름을 넣어주세요: ");
                    String courseName = scanner.nextLine();
                    System.out.print("해당 과목의 최대 학생수를 입력하세요: ");
                    int MaxStudent = scanner.nextInt();
                    scanner.nextLine(); // 개행 문자 제거
                    creatCourse(courseName, MaxStudent);
                    break;
                case 2:
                    System.out.print("학생을 추가할 과목의 이름을 넣어주세요: ");
                    courseName = scanner.nextLine();
                    System.out.print("해당 과목에 추가할 학생의 이름을 넣어주세요: ");
                    String studentName = scanner.nextLine();
                    assignCourse(courseName,studentName);
                    break;
                case 3:
                    System.out.print("조회할 과목을 넣어주세요: ");
                    courseName = scanner.nextLine();
                    printStudentByCourseName(courseName);
                    break;
                case 4:
                    System.out.print("조회할 과목을 넣어주세요: ");
                    courseName = scanner.nextLine();
                    printStudentByStudentName(courseName);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;

            }

        }
    }

    Animal animal = new Animal();

    public void test(){
        //protected 메서드는 다른 패키지에서 사용을 못함.
        //animal.eat();
    }
    //과목 생성 기능(creatCourse

    //과목에 학생 추가 기능(assignCorse

    //과목에 참여한 학생 출력 기능(printStudentsByCourseName
}
