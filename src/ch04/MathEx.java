package ch04;

public class MathEx {
    public static void main(String[] args) {
        Math m = new Math();

        m.makeLst(5);
        m.makeLst(9);
        m.makeLst(24);
        m.makeLst(13);
        m.makeLst(3);
        m.makeLst(21);

        int max = m.max(m);
        System.out.println(max);
        int min = m.min(m);
        System.out.println(min);


    }
}
