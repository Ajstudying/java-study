package ch06.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<자료형> 변수명 = new ArrayList<자료형>();
        //자료형에 따라서 다르게 작동하기 위해서 추가적인 매개변수 <자료형>을 넣는다.
        //자료형을 매개변수로 받는 것을 제네릭/제너릭/쥐네릭(generic)
        //매개변수의 자료형은 기본(원시) 자료형(primitive type)은 안됨
        //int/long... X,  Integer, Long 클래스 타입을 넣어줘야 한다.
        List<String> list = new ArrayList<String>();       // 기본적으로 ArrayList를 쓰도록 한다.
//        List<String> list = new LinkedList<String>();  // 맨 앞에 List는 그대로 하고 생성자 쪽만 Array나 Linked로 변경한다.
        List<Integer> listInt = new ArrayList<Integer>();

        // 객체 추가
        // 리스트변수.add(객체)
        list.add("남소나");
        list.add("명승정");

        for (String name : list){
            System.out.println(name);
        }
        // 특정 위치의 값을 변경
        //리스트 변수, set(인덱스, 객체)
        list.set(0,"남소나");
        list.set(1,"박기철");
        for(String name : list){
            System.out.println(name);
        }

        //리스트 변수.size() - 요소의 개수
        System.out.println(list.size());

        list.add("김성우");
        list.add("김소현");
        for (String name : list){
            System.out.println(name);
        }
        System.out.println("---------");
        // 1번 요소를 삭제
        list.remove(1);
        //뒤에 있는 것을 전부 당겨옴. 중간에 구멍(null)이 안생김.
        for(String name : list){
            System.out.println(name);
        }

        // 2번에 객체 삽입
        list.add(2, new String ("이현미"));
        for (String name : list){
            System.out.println(name);
        }
        //이렇게 중간에 요소를 삭제하거나, 추가하게 되면
        //뒤쪽 요소를 당겨오거나 밀어야 되는 overhead(추가적인 연산) 발생
        // 이런 케이스가 잦다면, ArrayList -> LinkedList
        //                   요소추가,      전체 탐색,      요소삭제/ 삽입
        // ArrayList          빠름            빠름           느림(많이)
        // LinkedList         느림            느림            빠름

        List<String> lstStr = new ArrayList<String>
                (List.of("banana","apple","kiwi"));

        lstStr.add("pineapple");
        for (String str : lstStr){
            System.out.println(str);
        }
    }
}
