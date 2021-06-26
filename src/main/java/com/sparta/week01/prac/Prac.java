package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {


    public static void main(String[] args) {
        String title = "웹개발의 봄, Spring";
        String tutor = "권설민";
        int days = 35;


        Course course = new Course(title, tutor, days);
        course.setTitle(title);
        course.setTutor(tutor);
        course.setDays(days);

        // private은 조회를 할때도 막 조회를 하지 못한다.
        // 메소드를 사용해서 조회해야하는데 이때 필요한게 Getter이다.
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

    }
}