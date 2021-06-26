package com.sparta.week01.prac;

public class Tutor {

    // 멤버변수 두개 선언
    // 추상적으로 Tutor안에 name과 bio가 있겠구나 생각하면 됨
    private String name;
    private int bio;

    // 기본 생성자
    public Tutor() {

    }

    // 생성자
    public Tutor(String name, int bio) {
        this.name = name;
        this.bio = bio;
    }

    // 값의 변경을 할 수 있도록 하기 위해 Setter를 설정
    public void setName(String name) {
        this.name = name;
    }

    public void setbio(int bio) {
        this.bio = bio;
    }

    // 조회도 가능하도록 하기 위해 Getter를 설정

    public String getName() {
        return this.name = name;
    }

    public int getBio() {
        return this.bio = bio;
    }
}
