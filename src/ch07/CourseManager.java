package ch07;

import java.util.List;
import java.util.ArrayList;

public class CourseManager <T extends Course> extends Course {
    private List<Course> courseList;

    public CourseManager() {
        super();
        this.courseList = new ArrayList<>();
    }

    public void addCourse(T course){
        if (course instanceof OnlineCourse) {
            courseList.add((Course) course);
        }else if(course instanceof LectureCourse){
            courseList.add((Course) course);
        }else{courseList.add((Course) course);}
    }

    public void printCourses(){
        for (Course course : courseList){
            if(course instanceof OnlineCourse){
                OnlineCourse c = (OnlineCourse) course;
                System.out.println("과목의 이름: " + c.getCourseName() + ", 과목 코드: " + c.getCourseCode() + ", 강사의 이름: " + c.getInstructor()+", 플랫폼: "+c.getPlatform());
            }else if(course instanceof LectureCourse){
                LectureCourse l = (LectureCourse) course;
                System.out.println("과목의 이름: " + l.getCourseName() + ", 과목 코드: " + l.getCourseCode() + ", 강사의 이름: " + l.getInstructor()+", 강의실: "+l.getRoom()+", 강의시간: "+l.getTime());
            }else{
                System.out.println("과목의 이름: " + course.getCourseName() + ", 과목 코드: " + course.getCourseCode() + ", 강사의 이름: " + course.getInstructor());
            }
        }
    }


    public List<Course> getCourse(String instructor) {
        List<Course> c = new ArrayList<>();
        for (Course course : courseList){
            if(course instanceof OnlineCourse){
                if(course.getInstructor().equals(instructor)){
                        c.add(course);
                }
            }else if(course instanceof LectureCourse){
                if(course.getInstructor().equals(instructor)){
                    c.add(course);
                }
            }else {
                if(course.getInstructor().equals(instructor)){
                        c.add(course);
                }
            }
        }return c;
    }

    public void instuctorCourseName(String instructor) {
        List<Course> l = getCourse(instructor);
        if(l.isEmpty()){
            System.out.println("해당 강사의 강의는 없습니다.");
        }else{
            for(Course course : getCourse(instructor)){
                System.out.println(course.getInstructor()+"강사의 강의 과목은 : " + course.getCourseName());
            }
        }
    }



    /*public void getLectureCouseName(String instructor) {
        List <LectureCourse> l = getLectureCourse(instructor);

        if (l.size() != 0){
            for (LectureCourse lec : l){
            System.out.println(lec.getInstructor()+"강사의 대학 강의 : "+ lec.getCourseName());
            }
        }else{
            System.out.println("해당 강사의 대학 강의는 없습니다.");
        }
    }*/






}
