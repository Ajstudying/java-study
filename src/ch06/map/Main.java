package ch06.map;

import com.myuniversity.students.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // 해시맵: 정렬과 상관없는 것을 사용한다. 추가할 때 정렬X, 성능이 좀 더 좋음
        Map<String, Student> students = new HashMap<>();
        //정렬을 하려면 TreeMap으로 해야 한다.
        // 트리맵 : 정렬이 필요한 것을 사용한다. 추가할 때 이진트리로 정렬, 성능이 떨어지지만 키값으로 정렬해준다.
        //Map<String, Student> students = new TreeMap<>();

        //객체 추가
        // 키(key, 유일값) : 학번
        // 값(value) : 학생 정보
        // 맵변수.put(엔트리(K,V))
        students.put("e-01-00001",new Student("강애진"));
        students.put("e-01-00002",new Student("김소현"));
        students.put("e-01-00003",new Student("김성우"));
        students.put("e-01-00004",new Student("조정빈"));

        // 객체 검색/조회
        // 맵변수.keySet() -> key 목록을 반환함(키는 중복이 안됨)
        // Set: 집합, 원소의 중복이 없는 자료 구조.
        //일반적으로 Map, 연관배열, dictionary, key-value pair
        // 자료구조는 정렬해서 저장하지 않음

        for(String key : students.keySet()){
            System.out.println(key);
            // 맵변수.get(키값) -> 값 객체
            System.out.println("학번: "+ key + ", 학생명: "+students.get(key).getName());
        }
        //맵변수.values() - > 값 목록을 반환함
        for(Student s : students.values()){
            System.out.println(s.getName());
        }

        //키값 존재여부 확인
        boolean result = students.containsKey(("e-01-00005"));

        System.out.println("----------");

//        Map<String, Student> sortedStudents = new TreeMap<>(students);
// 이렇게 따로 변수 선언 보다 for문에 직접적으로 넣어서 for문 안에서 일회성으로 사용하고 없애는게 나음!

        for(String key : new TreeMap<>(students).keySet()){
            System.out.println(key);
            // 맵변수.get(키값) -> 값 객체
            System.out.println("학번: "+ key + ", 학생명: "+students.get(key).getName());
        }

        //객체의 값 수정
        // 맵변수.get(키값) : 키값으로 조회 후 뭔가를 처리할 수 있음
        Student s = students.get("e-01-00002");
        s.setName("e-02-00002");
        //setter 등으로 값 수정

        //객체 삭제
        //맵변수.remove(키값) : 특정 키값의 엔트리(key-value쌍)를 삭제
        students.remove("e-01-00003");
        students.clear();

    }
}
