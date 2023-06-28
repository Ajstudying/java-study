package ch01;

public class StringsEx {
    public static void main(String[] args) {
        String name;
        name = "홍길동";
        String name2 = "홍길동";
        String name3 = null;
        String name4 = " ";
        System.out.println("name2 = " + name2);
        System.out.println("name3 = " + name3);
        System.out.println("name4 = " + name4);

        String greet = "안녕하세요, \n저는, \"홍길동\"입니다.";
        String greet2 = "\t 반갑습니다.";
        System.out.println(greet);
        System.out.println(greet2);

        String address = "동대문구 장안동";
        String age = new String ("41세");
        String career = "개발경력은 11년 입니다. 주요 분야는 클라우드, 블록체인, 프론트엔드 입니다.";
        String info = name + " " + age + "\t주소는 " + address + "입니다."
                        + "\n" +"\"" + career + "\""
                        + "\n 이상 저의 정보입니다.";
        System.out.println(info);
    }
}
