package ch05.statics;

public class Counter {
    // static 필드
    // 클래스의 모든 객체의 값이 공유된다.
    private static int count = 0;
    public Counter(){ // 생성할 때도 카운터 증가
        count++;            //정적 변수 값 증가
    }

    //static메서드

    public static int getCount(){
        return count++;     //정적 변수 반환
    }
}
