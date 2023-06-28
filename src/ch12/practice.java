package ch12;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < Math.random() * 10; i++) {
            lst.add(i);
        }
        for (int i = 0; i < Math.random() * 10; i++) {
            lst.add(i);
        }
        System.out.println(Arrays.deepToString(lst.toArray()));
        //중복된 숫자를 찾는 코드
        Set<Integer> set = new HashSet<>();
        Set<Integer> s = new HashSet<>();
        for(int num : lst){
            if(!s.add(num)){
                set.add(num);
            }
        }
        System.out.println(set);
        System.out.println(s);

        List<Integer> lst1 = new LinkedList<>();









    }
}
