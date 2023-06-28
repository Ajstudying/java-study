package ch09;

import ch07.Course;
import ch08.Account;
import com.myuniversity.students.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // <String>: 매개변수를 타입(클래스)으로 넣었습니다.
        //List : 인터페이스, ArrayList: 구현클래스
        //매개변수를 타입으로 넣을 수 있게 하는 것이 제네릭(제너릭, 쥐네릭). generic

        List<String> list = new ArrayList<>();
//        list.add(1); // 에러발생, generic으로 String을 넣었기 때문에, Integer는 안됨.
        //1. 타입을 컴파일 타임(코드 짜는 중)에 체크할 수 있다.

        //List, ArrayList는 String, Integer, Double......
        // 기능을 타입(클래스)별로 만들지 않아도 됨.
        //2. 코드를 타입 매개변수 가지고 쉽게 재사용 가능함.
        List<Integer> lstNum = new ArrayList<>();

        //오버로딩ㅇ을 이용한 방법
        /*Util util = new Util();
        // 오버로딩: add(Integer a, Integer b)
        //add(String a, String b)

        //제네릭
        Util<타입> util = new Util();
        public T add(T a, T b);*/
        /*Util<Integer> //정수에 처리를 해주는 기능을 제공
        Util.add(3,4)
        Util<String> //문자열에 처리를 해주는 기능을 제공
        Util.add("aaa","bbb")*/

        // 제네릭을 쓸 수 있는 상황: 연산이나 로직이 똑같다.
        /*메서드명을 같은 걸 쓰고, 매개변수 개수도 같다
            타입만 다르다.*/

        /*public class CollectionUtil<T> {
            public void printList(List<T> list){for문 출력}
        }*/

        //모든 클래스 타입 가능한 스택 자료 구조 사용
        GenericStack<String> stack = new GenericStack<>();
        GenericStack<Student> StackStudents = new GenericStack<>();
        GenericStack<Course> stackCourse = new GenericStack<>();
        GenericStack<Account> stackAccount = new GenericStack<>();

        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);

        CollectionUtil<Integer> util = new CollectionUtil<>();
        int target = 1;   // 몇개가 있는지 찾을 특정 요소
        int occurrenceCount = util.countOccurrences(numbers, target);
        System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);

        List<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("apple");
        strList.add("cherry");
        strList.add("durian");
        strList.add("melon");

        String tar = "apple";   // 몇개가 있는지 찾을 특정 요소
        int occurrence = occurrent(strList, tar);
        System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);

        Cache<Student> c = new Cache<>();
        c.setData(new Student("고대근"));
        Student s = c.getData();

        Cache<Account> a = new Cache<>();
        a.setData(new Account("00001", 10,1000));
        Account acc = a.getData();


    }
    public static <T> int occurrent (List<T> lst, T target){
        int count = 0;
        for(T i : lst){
            if(i.equals(target)){
                count++;
            }
        }return count;
    }



}
