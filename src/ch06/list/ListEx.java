package ch06.list;

import com.myuniversity.students.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {

        List<String> fruit = new ArrayList<String>();
        fruit.add(0,"Apple");
        fruit.add(1,"Banana");
        fruit.add(2,"Cherry");

        System.out.println(fruit.get(1));

        fruit.remove("Banana");
        fruit.add(1,"Strawberry");
        fruit.add(1, "Orange");

        //내부적으로 구버전 자바이면 merge-sort, 현재버전 자바이면 tim-sort
        fruit.sort(null);
        Collections.sort(fruit); // 위와 아래의 기능이 같다.

        for(String elm : fruit){
            System.out.println(elm);
        }
        System.out.println("-----");

        Collections.reverse(fruit); // 역순

        for(String elm : fruit){
            System.out.println(elm);
        }



//        for (String name : fruit){
//            System.out.print(name+", ");
//        }
//        System.out.println(fruit.size());

        /*String max = fruit.get(0);
        for (int i = 0; i < fruit.size(); i++) {
            if (fruit.get(i).length() > max.length()){
                max = fruit.get(i);
            }
        }
        System.out.println(max);


        String min = fruit.get(0);
        for (int i = 0; i < fruit.size(); i++) {
            if (fruit.get(i).length() < min.length()){
                min = fruit.get(i);
            }
        }
        System.out.println(min);

        for (int i = 0; i < fruit.size(); i++) {
            System.out.println(fruit.get(i).toUpperCase());
        }*/

        String change = "";
        for (int j = 1 ; j < fruit.size(); j++){
            for (int i = 0 ; i < fruit.size() ; i++) {
                if (i == fruit.size()-1){
                    change = fruit.get(i);
                    fruit.set(i,fruit.get(i-1));
                    fruit.set(i-1,change);
                    break;
                }else if(i < fruit.size()-1){
                    change = fruit.get(i);
                    fruit.set(i,fruit.get(i+1));
                    fruit.set(i+1,change);
                    }

                }
        }
        for (String name : fruit){
            System.out.println(name);
        }




        boolean result = false;
        for (String name : fruit) {
            if (name.equals("Cherry")) {
                result = true;
            }else {
                result = false;
            }
        }System.out.println(result);

//        fruit.remove(fruit.size()-1);

        List<String> changeFruit = new ArrayList<String>();
        for (int i = fruit.size()-1; i >= 0; i--) {
            changeFruit.add(fruit.get(i));
        }
        for (String name : changeFruit){
            System.out.println(name);
        }

        List<Student> tmpLstStudent = new ArrayList<Student>();
        tmpLstStudent.add(new Student("John"));
        tmpLstStudent.add(new Student("Sarah"));
        tmpLstStudent.add(new Student("Alice"));
        tmpLstStudent.add(new Student("Lisa"));
        tmpLstStudent.add(new Student("Daniel"));

        // Comparable로 구현
        Collections.sort(tmpLstStudent);
        for (Student s : tmpLstStudent){
            System.out.println(s.getName());
        }

        // @: at mark
        // kdkcom@naver.com 네이버에 kdkcom이 있다~~ 같은 의미
        // 클래스명:: 필드명(getter) 쌍콜론이 at 과 같은 의미
        // 해당 클래스의 필드로 뭔가를 하겠다.
        //컬렉션s.sort(tmpLstStudent, Comparator.comparing(클래스명::
        Collections.sort(tmpLstStudent, Comparator.comparing(Student::getName));

        for (Student s : tmpLstStudent){
            System.out.println(s.getName());
        }


    }
}