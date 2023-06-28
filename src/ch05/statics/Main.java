package ch05.statics;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        // c.count == 1
        System.out.println(c.getCount());
        // c.count == 2
        Counter c2 = new Counter();
        // c2.count == 1 (실제 결과 3 static 때문에 변수가 공유됨
        System.out.println(c2.getCount());
        // c2.count == 2 (실제 결과 4
    }
}
