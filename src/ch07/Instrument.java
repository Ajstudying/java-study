package ch07;

public class Instrument {
    public void play() {
        System.out.println("악기를 연주합니다.");
    }
}
class Guitar extends Instrument {
    @Override
    public void play(){
        super.play();
        System.out.println("디리딩딩딩");
    }
}

class Piano extends Instrument {
    @Override
    public void play() {
        super.play();
        System.out.println("도레미파솔라시도");
    }
}