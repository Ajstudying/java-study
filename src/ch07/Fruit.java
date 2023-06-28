package ch07;

public class Fruit {
    public void getcolor() {
        System.out.println("해당 과일의 색깔은");
    }

}

class Apple extends Fruit {
    @Override
    public void getcolor() {
        super.getcolor();
        System.out.println("빨간색 입니다.");
    }
}

class Banana extends Fruit {
    @Override
    public void getcolor() {
        super.getcolor();
        System.out.println("노란색 입니다.");
    }
}