package ch07;

public class Course {
    private String courseName;  //과목 이름
    private String courseCode;  //과목 코드
    private  String instructor; //강사 이름

    public Course(String courseName, String courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }
    public Course(){}

    public String getCourseName() {
        return  this.courseName;
    }
    public String getCourseCode() {
        return  this.courseCode;
    }
    public String getInstructor() {
        return this.instructor;
    }

}

class OnlineCourse extends Course {

    private String platform;

    public OnlineCourse(String courseName, String courseCode, String instructor, String platform) {
        super(courseName, courseCode, instructor);
        this.platform = platform;
    }

    public String getPlatform() {
        return this.platform;
    }

}

class LectureCourse extends Course {
    private int room;
    private int time;

    public LectureCourse(String courseName, String courseCode, String instructor, int room, int time) {
        super(courseName, courseCode, instructor);
        this.room = room;
        this.time = time;
    }
    public int getRoom() {
        return this.room;
    }
    public int getTime() {
        return this.time;
    }
}
