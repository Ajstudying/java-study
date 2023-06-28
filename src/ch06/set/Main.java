package ch06.set;

import com.myuniversity.students.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("양수열");
        Student s2 = new Student("박재욱");
        Student s3 = s1; // 같은 주소를 보자.
        Student s4 = new Student("박재욱");

        //hashCode, 같은 참조만 같은 값
        System.out.println("s1: "+s1.hashCode()); //hashCode, 문자열에 대한 숫자값? 정도
        System.out.println("s2: "+s2.hashCode());
        System.out.println("s3: "+s3.hashCode());
        System.out.println("s4: "+s4.hashCode());

        //equals, 기본적으로 같은 참조면 true이나, 바꿀 수 있다. ctrl+equals 눌러서 나오는 코드를 가져와서 수정 후 사용 가능.
        System.out.println(s1.equals(s3));

        //객체 추가
        Set<String> sets = new HashSet<>();
        sets.add("apple");
        sets.add("banana");
        sets.add("cherry");
        sets.add("durian");
        sets.add("elderberry");

        // 객체 탐색/조회
        for (String s : sets){
            System.out.println(s);
        }

        //contains
        //해당값이 있냐, 없냐
        System.out.println(sets.contains("cherry"));

        //삭제
        sets.remove("cherry");

        List<String> lst = new ArrayList<>();
        lst.add("apple");
        lst.add("banana");
        lst.add("cherry");
        lst.add("banana");
        lst.add("durian");
        lst.add("elderberry");
        lst.add("durian");

        System.out.println("---------------------");
        for (String s : lst){
            System.out.println(s);
        }
        System.out.println("---------------------");

        //컬렉션(리스트) -> set 으로 초기화 생성
        Set<String> set2 = new HashSet<>(lst);
        for (String s : set2){
            System.out.println(s);
        }
        //중복제거, TreeSet으로 하면 중복제거에 정렬까지
        Set<String> set3 = new TreeSet<>(lst);
        for (String s : set3){
            System.out.println(s);
        }
        String s = "abcdefgabcd";
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()){
            list.add(c);
        }
        for (char c : list){
            System.out.println(c);
        }
        Arrays.asList(s.toCharArray());

        Set<Character> chars = new HashSet<>();



    }
}
