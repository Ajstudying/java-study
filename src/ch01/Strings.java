package ch01;

public class Strings { // 클래스 이름이 참조변수 타입 이름과 같으면 안됨
    public static void main(String[] args) {
        // string (문자열) - 문자의 배열
        String greeting = "Hello, World";

        // 자바에서 문자열(String)은 기본 자료형이 아니고 참조형이다.
        // 해당 타입 -> 이동 -> 선언 또는 사용 위치

        // 문자열 초기화 방법
        String firstName = new String("John");
        String lastName = "Doe";

        // 문자열 결합(concat)
        // 변수를 참조해서 사용할 때는 대소문자 구분(case-sensitive)
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // 제어문자(escape characters, escape sequence)
        // 문자열 처리의 특수문자, 줄바꿈, 탭 \,\n,\t(4칸)
//        String message = "\"이렇게\"";
        String message = """
                이렇게
                하는 
                여러줄""";
        System.out.println(message);
        String back = "Hello\\World"; //백슬래시 출력
        System.out.println(back);

    }
}
