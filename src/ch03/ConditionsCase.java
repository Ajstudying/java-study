package ch03;

public class ConditionsCase {
    public static void main(String[] args) {
        // switch 문
        // 1주일에서 몇번째 요일인가.
        int dayOfWeek = 3;
        /*switch(변수) {
        }
        switch문의 변수의 값에 따라서 case 뒤에 값과 일치하는 구문을 실행*/
        switch (dayOfWeek) {
            case 1 :
                System.out.println("월요일입니다.");
                break;
            case 2 :
                System.out.println("화요일입니다.");
                break;
            case 3 :
                System.out.println("수요일입니다.");
                break;
            case 4 :
                System.out.println("목요일입니다.");
                break;
            default: // 일치하는 case 문을 찾지 못하면 default에 있는 코드를 실행한다.
                System.out.println("금요일, 토요일, 일요일입니다.");

        }

    }
}
