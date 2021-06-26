package com.sparta.week01.prac;

public class Course {
    // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러나죠!

    // 맴버변수라고 함
    private String title;
    private String tutor;
    private int days;

    // 기본 생성자
    public Course() {

    }

    // 생성자
    public Course(String title, String tutor, int days) {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    // setter 설명
    // main에서 값을 바꿀수 있도록 하는 허들 장치가 Setter
    // 이때 반환값이 없으므로 void를 선언
    public void setTitle(String title){
        this.title = title;
    }

    public void setTutor(String tutor){
        this.tutor = tutor;
    }

    public void setDays(int days){
        this.days = days;
    }

    // Getter
    public String getTitle(){
        return this.title;
    }

    public String getTutor(){
        return this.tutor;
    }

    public int getDays(){
        return this.days;
    }
}