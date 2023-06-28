package ch11;

public class Main2 {
    public static void main(String[] args) {
        try{
            test1();
            System.out.println("(4)");
        } catch (Exception e) {
            System.out.println("(5)");
        }



        try{
            divide(10,0);
        } catch (ArithmeticException e){
            System.out.println("산술 연산의 오류가 발생하였습니다." + e.getMessage());
        } finally {
            //정상 처리 상황과 예외처리 상황 모두 실행되는 코드 블록
            System.out.println("연산이 실행되었습니다.");
        }
    }
    //main에서 써야 하는 메서드는 static 써줘야 함.
    //메서드 throws 예외 종류
    public static int divide (int a, int b) throws ArithmeticException { //throws 뒤에 , 쓰고 여러가지를 쓸 수 있다.
        int result = 0;
        result = a / b;
        return result;
    }
    public static void test1() throws Exception {
        try {
            test2();
            System.out.println("(1)");
        }catch (NullPointerException e){
            System.out.println("(2)");
        }finally {
            System.out.println("(3)");
        }
    }
    public static void test2() {
        throw new NullPointerException();
    }
}
