package ch05.statics;

public class Main2 {
    public static void main(String[] args) {
        int result1 = Counter.getCount();   //static인 경우에 생성자 없이 바로 가능함.
        System.out.println(result1);

        int result2 = Counter.getCount();
        System.out.println(result2);

    }
}
