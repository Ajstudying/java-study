package ch07;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("고대근", 39);
        p.introduce();

        Student s = new Student("학생", 39,"01000");
        s.introduce();

        System.out.println();
        //업캐스팅
        //Student 객체를 Person 타입으로 변환(부모 타입으로 변환)
        //자식 객체를 부모객체에 대입
        Person p2 = s;
        // 부모 객체의 자식 객체에서 재정의된 매서드 호출
        // 자식 객체의 메서드가 호출
        p2.work();  // Student의 study()가 돌아감.
        p2.introduce(); // Student의 introduce가 호출되었음.
        // 자식 객체의 추가한 매서드/필드는 접근 불가
//        p2.study() -> 호출 불가
        Person p3 = new Lecturer("강의자",39,11);
        p3.work();  // Lecturer의 teach()가 돌아감
        // 부모 객체를 자식 객체에 대입,
        // 명시적 형변환
        // 그냥 형변환 하면 에러발생 가능성이 존재함.
        // 부모객체변수 instanceof 자식 클래스 타입
        // Student -> Person, 본래 Person인지, Lecturer -> Person 인지
        if (p2 instanceof  Student){ //형변환 전에 instanceof(연산자)를 꼭 미리 사용해야 에러가 안남. 위의 타입 확인!!
            Student s2 = (Student) p2;
            s2.study();
        }

        if (p3 instanceof Student) {
            Student s3 = (Student) p3;
            s3.study();
        }

        System.out.println("-----employee----");

        FullTimeEmployee full = new FullTimeEmployee(30000000);
        PartTimeEmployee part = new PartTimeEmployee(100000,80);
        full.calculateSalary();
        part.calculateSalary();

        System.out.println("----fruit-----");

        Apple apple = new Apple();
        Banana banana = new Banana();
        apple.getcolor();
        banana.getcolor();

        System.out.println("---- instrument-----");

        Guitar guitar = new Guitar();
        guitar.play();
        Piano piano = new Piano();
        piano.play();

        System.out.println("---- CourseManagement-----");

        CourseManager course = new CourseManager();
        Course course1 = new OnlineCourse("자바스크립트(온라인)","05-006","삐삐","유튜브");
        Course course2 = new LectureCourse("타이스크립트(대학강의)","05-006","고대근",408,90);
        course.addCourse(new Course("자바","01-001", "a"));
        course.addCourse(new Course("파이썬","01-002","abc"));
        course.addCourse(new Course("자바스크립트", "01-003", "나나"));
        course.addCourse(new Course("타이스크립트", "01-004", "고대근"));
        course.addCourse(new OnlineCourse("고급 자바(온라인)","02-003","a", "네이버"));
        course.addCourse(new OnlineCourse("react(온라인)","02-004","나나", "다음"));
        course.addCourse(new OnlineCourse("react(온라인)","02-005","고대근", "슬랙"));
        course.addCourse(new LectureCourse("자바(대학강의)","03-005","나나",103,60));
        course.addCourse(new LectureCourse("고디바(대학강의)","03-006","b",104,60));

        course.addCourse(course1);
        course.addCourse(course2);

        OnlineCourse oc = new OnlineCourse("파이썬(온라인)","05-007","c","유튜브");
        LectureCourse lc = new LectureCourse("파이썬(대학강의)","03-007","c",107,90);

        course.addCourse(oc);
        course.addCourse(lc);


        course.printCourses();

        course.instuctorCourseName("고대근");


        course.instuctorCourseName("a");

        course.instuctorCourseName("ㅋㅋ");
        course.instuctorCourseName("나나");

        course.instuctorCourseName("c");




    }
}
