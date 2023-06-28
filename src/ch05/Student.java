package ch05;

public class Student {
    // 문제 1: 학생의 이름(name)과 학년(grade)을 필드로 가지는 student 클래스를 작성하십시오.
    private String name;

    private int grade;

    private int age;

    //메서드
    //CRUD(create read update delete)
    // 매개변수(parameter)
    // 반환값이 없기 때문에 void를 씀
    // *순서(알고리즘)
    //1. public(99.99%)
    //2. 요구사항에 맞게 메서드(기능)이름을 쓴다.(camel-case)
    //3. 입력값을 받냐/ 안 받냐
    //      -> 입력을 받는다(매개변수 선언)
    //          -> 매개변수 선언 -> 매개변수의 이름부터 delegate(위임하다, 대리구매하다)
    //                          -> 매개변수의 자료형
    //4. 구현(implementation)할 코드를 작성
    //5. 반환값이 있어요? : 메서드를 실행(호출)하고 나서 튀어나오는 값이 있는지 없는지
    //      -> 없음 -> 반환타입을 메서드명 앞에 적어줌(void)
    public Student(String name, int grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    //학생 정보의 이름을 가져오는 메서드
    public String getName(){
        return this.name;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void printStudentInfo() {
        System.out.println("학생 이름은: "+name);
        System.out.println("학생의 학년은: "+grade);
        System.out.println("학생의 나이는: "+age);
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){return this.age;}

    public void promoteGrade(int x){
        this.grade = this.grade+x;
        System.out.println("학년이 높아졌습니다."+grade+"학년");
    }

    public Student() {

    }

}