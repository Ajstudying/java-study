package ch05;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        user1.setName("John Doe");
        user1.setAge(18);
        user1.setEmail("abc123@naver.com");

        System.out.println(user1.getName());
        System.out.println(user1.getAge());
        System.out.println(user1.getEmail());
        user1.printInfoUser();
        user1.increaseAge();
        user1.changeEmail("def456@daum.net");
        System.out.println("---");
        user1.printInfoUser();

        user2.validAge(159);
        user2.setUserSubscriptionDate("2023년 6월 14일");
        String subscriptionDate = user2.getUserSubscriptionDate();
        System.out.println(subscriptionDate);

        boolean validEmail = user2.emailValidator("1234@hanmail.net");
        System.out.println(validEmail);

        int stringLong = user1.getLength("바다");
        System.out.println(stringLong);

        String str = user1.concatenate("강", "바다");

        System.out.println(str);

        double ave = user1.calculateAverage(8,9);
        System.out.println(ave);

        System.out.println(user1.factorial(4));






    }
}
