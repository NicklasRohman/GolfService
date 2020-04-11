package com.golfservice.golfservice.dto;

import lombok.Data;

@Data
public class CourseDTO {

    private String courseName;
    private int courseId;
    private int hole1;
    private int hole2;
    private int hole3;
    private int hole4;
    private int hole5;
    private int hole6;
    private int hole7;
    private int hole8;
    private int hole9;
    private int hole10;
    private int hole11;
    private int hole12;
    private int hole13;
    private int hole14;
    private int hole15;
    private int hole16;
    private int hole17;
    private int hole18;
    private int courseParFirst9;
    private int courseParLast9;
    private int coursePar;

    public CourseDTO(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public CourseDTO() {
        this.courseParFirst9 = this.hole1 + this.hole2 + this.hole3 + this.hole4 + this.hole5 + this.hole6 + this.hole7 + this.hole8 + this.hole9;
        this.courseParLast9 = this.hole10 + this.hole11 + this.hole12 + this.hole13 + this.hole14 + this.hole15 + this.hole16 + this.hole17 + this.hole18;
        this.coursePar = this.courseParFirst9 + this.courseParLast9;
    }
}
