package ch08;

import ch08.InterfaceBundle.*;
import ch08.InterfaceBundle.Runnable;

public class Main {
    public static void main(String[] args) {
        // 인터페이스 객체 생성이 불가하다.
        // 이렇게 아래와 같이 생성되고 해당 클래스에서 구현 후 객체 사용 후 다른 데서 안 쓰는 경우도 있다.
        /*Shape s1 = new Shape() {
            @Override
            public double calculateArea() {
                return 0;
            }

            @Override
            public double calculatePerimeter() {
                return 0;
            }
        }*/
        //구현체로만 객체 생성이 가능하다.
//        Shape s = new Circle(5);
        //회사 경영진이 야, 원으로 하니까 후져, 사각형으로 바꿔했을 때 이렇게 클래스만 새로 생성해서 넣으면 되니까.
        //인터페이스를 쓰는 이유 1번째 갈아끼기 쉽다.
        Shape s = new Rectangle(10,10);
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());

        //회사 경영진이 야, 원으로 하니까 후져, 사각형으로 바꿔.
        s = new Rectangle(10,10);
        Swimmable f = new Fish();
        f.swim();
        Runnable r = new Rabbit();
        r.run();
        Singable b = new Bird();
        b.sing();
        Playable d = new Dog();
        d.play();
        Walkable h = new Human();
        Runnable h1 = new Human();
        h1.run();
        h.walk();
        Studyable st = new Student("김철수", 82);
        st.study();
        Gradable g = new Student("김영희",88);
        g.calculateGrade();
        Bankable account = new Account("12345",10000,500);
        account.withdraw(1000);
        account.deposit(100000);
        Loanable l = new Account("123", 15000,1000);
        l.calculateInterest();
        Taxable t = new Account("12",20000,20);
        t.calculateTax();

    }
}
