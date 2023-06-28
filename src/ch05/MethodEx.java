package ch05;

public class MethodEx {
    public static void main(String[] args) {
        // Utils 클래스 객체를 생성하고 메서드를 실행
        Utils util = new Utils();

        int a = 10;
        int b = 5;
        /*util.sum(a,b);
        util.findMax(a,b);
        util.sumArray(arr);
        util.findLongestString(str);
        util.arraysInt(arr);*/

        int[] arr = {1,2,3,4,5};
        String[] str = {"Python", "Java", "C", "Ruby"};

        int result = util.sum(a,b);

        System.out.println("두 수의 합계는: "+result);
        System.out.println(util.findMax(a,b));
        System.out.println(util.sumArray(arr));
        System.out.println(util.findLongestString(str));
        System.out.println(util.arraysInt(arr));


    }
}
