package ch02;

public class Practice {
    public static void main(String[] args) {
        /*System.out.printf("%5s", "*");
        System.out.printf("*%n");
        System.out.printf("%5s", "**");
        System.out.printf("**%n");
        System.out.printf("%5s", "***");
        System.out.printf("***%n");
        System.out.printf("%5s", "****");
        System.out.printf("****%n");
        System.out.printf("%5s", "*****");
        System.out.printf("*****%n");
        System.out.printf("%5s", "****");
        System.out.printf("****%n");*/

        int count = 0;
        while (true) {
            int dice = (int) (Math.random() * 10) +1;
            System.out.println(dice);
            count++;
            if (dice == 6){
                break;
            }
        }
        System.out.println("주사위 굴린 횟수는 : " + count +"회");





    }
}
