package ch05.singleton;

public class Main {
    public static void main(String[] args) {
        //Singleton s1 = new Singleton(); // 생성자가 private로 막혀서 생성 안됨.

        //static으로 쓸 때와 다른점은
        // 우리가 필요한 시점에서 생성할 수 있음.
        //getInstance() 메서드로 생성
//        Operator s1 = Operator.getInstance(); // 이 때 객체 생성
//        s1.hashCode();
//        Operator s2 = Operator.getInstance(); // 이전 생성된 것을 반환
//        Singleton s3 = Singleton.getInstance(); // 이전 생성된 것을 반환
        /*System.out.println(s1); // ch05.singleton.Singleton@(682a0b20)<- 객체의 유일성을 나타내는 코드
        System.out.println(s2); // ch05.singleton.Singleton@682a0b20
        System.out.println(s3); // ch05.singleton.Singleton@682a0b20*/

        /*int[] arr = {1,2,3,4,5};
        s1.multiply(arr);
        s2.multiply(arr);*/

        // 여기서도 Operator 쓰고 있음
        Test1 t1 = new Test1();
        t1.test();

        // 여기서도 Operator 쓰고 있는데
        Test2 t2 = new Test2();
        t2.test();

        //객체는 1회만 생성되었음.


    }
}
