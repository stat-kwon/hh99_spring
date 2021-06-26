package com.sparta.week01.prac;

public class Prac_tutor_class {


    public static void main(String[] args) {
        String myName = "권설민";
        int myBio = 12;

        Tutor myTutor = new Tutor(myName, myBio);

        System.out.println(myTutor.getName());
        System.out.println(myTutor.getBio());

        // 인자를 받아서 변경하므로 Setter에 파라미터가 필요한 것을 알 수 있음
        myTutor.setbio(21);

        System.out.println(myTutor.getName());
        System.out.println(myTutor.getBio());
    }
}

