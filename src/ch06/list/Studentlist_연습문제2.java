package ch06.list;

import ch05.Student;

import java.util.*;

public class Studentlist_연습문제2 {
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<Student>();
        stu.add(new Student("John",14,15));
        stu.add(new Student("Sarah",2,10));
        stu.add(new Student("Alice",3,12));
        stu.add(new Student("Lisa",14,14));
        stu.add(new Student("Daniel",3,13));

        for (Student student : stu) {
            System.out.println(student.getName());
        }
        System.out.println(stu.size());

        /*for (Student student : stu) {
            String name = student.getName();
            if (name.equals("John")){
                System.out.println(student.getAge());
            }
        }*/

        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);
            String name = student.getName();
            if (name.equals("John")){
                System.out.println(i);
            }
        }

        for (Student student : stu) {
            int grade = student.getGrade();
            if (grade >= 10) {
                System.out.println(student.getName());
            }

        }
        List<Integer> numbers = new ArrayList<>();
        for (Student student : stu) {
            numbers.add(student.getAge());
            Collections.sort(numbers);
        }
        System.out.println("나이 정렬 : "+ numbers);

        List<Integer> grade = new ArrayList<>();
        for (Student student : stu) {
            grade.add(student.getGrade());
            Collections.sort(grade);
        }
        System.out.println("학년 정렬 : "+ grade);

        for (Student student : stu) {
            String name = student.getName();
            if(name.equals("Alice")){
                student.setAge(5);
                System.out.println(student.getName()+" "+student.getAge()+"살, "+student.getGrade()+"학년");
            }
        }

        List<Integer> minstu = new ArrayList<>();
        for (Student student : stu) {
            if (student.getGrade() <= 12){
                minstu.add(student.getGrade());
            }
        }
        System.out.println("새로운 정렬 : "+minstu);


        double sum = 0;
        for (Student student : stu) {
            sum += student.getAge();
        }
        double average = sum / stu.size();
        System.out.println(average);

        // 컬렉션s.sort(lstStudent, Comparator.comparing(클래스명::필드(getter));
        Collections.sort(stu, Comparator.comparingInt(Student::getAge));
        for (Student student : stu) {
            System.out.println(student.getAge());
        }
        Collections.sort(stu, Comparator.comparingInt(Student::getGrade));
        for (Student student : stu) {
            System.out.println(student.getGrade());
        }
        Collections.sort(stu, Comparator.comparing(Student::getName));
        for (Student student : stu){
            System.out.println(student.getName());
        }

        /*List<Student> sortStudents = new ArrayList<>(students.values());
        sortStudents.sort(Comparator.comparing(Student::getName)); //Student.getName을 참조해서 반복하는 것. // Collections.sort(lstStudent, Comparator.comparing(Student::getName))
        for (Student student : sortStudents) {
            System.out.println(student.getName());
        }*/
//        Collections.sort(tmpLstStudent, Comparator.comparing(Student::getName));




        int studentCount = 1;
        List<Integer> c = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < stu.size(); i++) {
            count.add(stu.get(i).getGrade());
        }
        System.out.println(count);
        for (int j = 0; j < count.size(); j++) {
            for (int i = 0; i < count.size(); i++) {
                if (i == j) {
                    break;
                } else if (count.get(i) == count.get(j)) {
                    studentCount ++;
                    c.add(studentCount);
                    System.out.println(stu.get(i).getName() + "과 " + stu.get(j).getName() + "이 " + count.get(i) + "학년으로 같습니다.");
                    break;
                }
                studentCount = 1;
            }

        }
        System.out.println(c);


        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<Student>();
        int in = 3;
        while (in > 0){
            System.out.println("추가할 학생의 이름을 입력하세요: ");
            String studentName = scanner.nextLine();
            System.out.println("추가할 학생의 나이를 입력하세요: ");
            int studentAge = scanner.nextInt();
            System.out.println("추가할 학생의 학년을 입력하세요: ");
            int studentGrade = scanner.nextInt();
            students.add(new Student(studentName,studentGrade,studentAge));
            System.out.println("입력이 완료되었습니다.");
            in--;
            scanner.nextLine(); // 개행 문자 제거
        }
        System.out.println("프로그램이 종료되었습니다.");


    }
}
