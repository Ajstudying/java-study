package ch06.map;

import java.util.*;

public class StudentEx {

    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();

        students.put("e-01-001", new Student("Alice",14));
        students.put("e-01-002", new Student("Berry",15));
        students.put("e-01-003", new Student("David",18));
        students.put("e-01-004", new Student("Bill",12));
        students.put("e-01-005", new Student("Cherry",13));



        // 특정 학번의 학생을 검색하는 코드
        for(String key : students.keySet()){
            if (key.equals("e-01-004")){
            System.out.println("학번: "+ key + ", 학생명: "+students.get(key).getName());
            }
        }


        students.remove("e-01-004");

        for(String key : students.keySet()){
            System.out.println("학번: "+ key + ", 학생명: "+students.get(key).getName());

        }
        double sum = 0;
        for (Student s : students.values()){
            sum += s.getAge();
        }
        double result = sum / students.size();
        System.out.println("학생 나이의 평균은 "+result);

        int age = students.get("e-01-001").getAge();
        for (Student s : students.values()){
            if(s.getAge() > age){
                age = s.getAge();
            }
        }System.out.println(age);


        Map<String, Student> sortedStudents = new TreeMap<>();
        for (String key : students.keySet()){
            sortedStudents.put(students.get(key).getName(), students.get(key));
        }
        for (String s : sortedStudents.keySet()){
            System.out.println("학생명: "+s+", 학생의 나이 : "+sortedStudents.get(s).getAge());
        }



        for (Student s : students.values()){
            if (s.getName().contains("r")){
                System.out.println(s.getName());
            }
        }


        for (String s : students.keySet()){
            String mm = students.get(s).getName();
            if (mm.equals("Bob")){
                System.out.println(students.get(s).getName()+"학생의 나이는 "+students.get(s).getAge()+", 학번은 "+s+" 입니다.");
                break;
            }
        }

        List<Student> sortStudents = new ArrayList<>(students.values());
        sortStudents.sort(Comparator.comparing(Student::getName)); //Student.getName을 참조해서 반복하는 것. // Collections.sort(stu, Comparator.comparing(Student::getName))
        for (Student student : sortStudents) {
            System.out.println(student.getName());
        }

        /*// 컬렉션s.sort(stu, Comparator.comparing(클래스명::필드(getter));
        Collections.sort(stu, Comparator.comparingInt(Student::getAge));
        for (Student student : stu) {
            System.out.println(student.getAge());
        }*/




    }
}
