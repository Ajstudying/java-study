//src/com/myuniversity/students/student.java
package com.myuniversity.students;

//회사(com), 비영리조직(org)
//1차
//com.--- 영리조직
//org.--- 비영리조직

//2차
//회사명, 조직명
// com.naver, com.wooahan
// org.tjon, org.apache

//3차
//제품명, 서비스명, 도메인명(비즈니스 범위명)
//com.naver.search, com.naver.blog, com.naver.news

//그 하위
//com.naver.news.sports.baseball

// comparable 인터페이스를 구현한다.
//implements 를 구현
// 자바 객체를 특정 필드로 정렬하는 방법(chatgpt)
// java sort by specific field

public class Student implements Comparable<Student>{
    private  String name;

    public Student(String name) {this.name = name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Collections.sort(리스트)
    // 객체별로 compareTo 메서드를 실행
    @Override
    public int compareTo(Student o){
        return this.name.compareTo((o.name));
    } //Comparable을 이렇게 구현해줘야만 정렬 사용을 할 수 있다.
    // 위에 Comparable<> 이 괄호 안에 있는 타입만 compareTo에서 객체로 받을 수 있음. 두개의 타입이 같아야 함.



}
