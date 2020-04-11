package com.golfservice.golfservice.dto;

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

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getHole1() {
        return this.hole1;
    }

    public void setHole1(int hole1) {
        this.hole1 = hole1;
    }

    public int getHole2() {
        return this.hole2;
    }

    public void setHole2(int hole2) {
        this.hole2 = hole2;
    }

    public int getHole3() {
        return this.hole3;
    }

    public void setHole3(int hole3) {
        this.hole3 = hole3;
    }

    public int getHole4() {
        return this.hole4;
    }

    public void setHole4(int hole4) {
        this.hole4 = hole4;
    }

    public int getHole5() {
        return this.hole5;
    }

    public void setHole5(int hole5) {
        this.hole5 = hole5;
    }

    public int getHole6() {
        return this.hole6;
    }

    public void setHole6(int hole6) {
        this.hole6 = hole6;
    }

    public int getHole7() {
        return this.hole7;
    }

    public void setHole7(int hole7) {
        this.hole7 = hole7;
    }

    public int getHole8() {
        return this.hole8;
    }

    public void setHole8(int hole8) {
        this.hole8 = hole8;
    }

    public int getHole9() {
        return this.hole9;
    }

    public void setHole9(int hole9) {
        this.hole9 = hole9;
    }

    public int getHole10() {
        return this.hole10;
    }

    public void setHole10(int hole10) {
        this.hole10 = hole10;
    }

    public int getHole11() {
        return this.hole11;
    }

    public void setHole11(int hole11) {
        this.hole11 = hole11;
    }

    public int getHole12() {
        return this.hole12;
    }

    public void setHole12(int hole12) {
        this.hole12 = hole12;
    }

    public int getHole13() {
        return this.hole13;
    }

    public void setHole13(int hole13) {
        this.hole13 = hole13;
    }

    public int getHole14() {
        return this.hole14;
    }

    public void setHole14(int hole14) {
        this.hole14 = hole14;
    }

    public int getHole15() {
        return this.hole15;
    }

    public void setHole15(int hole15) {
        this.hole15 = hole15;
    }

    public int getHole16() {
        return this.hole16;
    }

    public void setHole16(int hole16) {
        this.hole16 = hole16;
    }

    public int getHole17() {
        return this.hole17;
    }

    public void setHole17(int hole17) {
        this.hole17 = hole17;
    }

    public int getHole18() {
        return this.hole18;
    }

    public void setHole18(int hole18) {
        this.hole18 = hole18;
    }

    public int getCourseParFirst9() {
        return this.courseParFirst9;
    }

    public void setCourseParFirst9(int courseParFirst9) {
        this.courseParFirst9 = courseParFirst9;
    }

    public int getCourseParLast9() {
        return this.courseParLast9;
    }

    public void setCourseParLast9(int courseParLast9) {
        this.courseParLast9 = courseParLast9;
    }

    public int getCoursePar() {
        return this.coursePar;
    }

    public void setCoursePar(int coursePar) {
        this.coursePar = coursePar;
    }

}
