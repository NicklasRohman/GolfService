package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.dto.CourseDTO;

import java.util.List;

public interface InterfaceCourseService {

    List<CourseDTO> getAllCourses();

    CourseDTO getCourse(int courseId);

    void addCourse(CourseDTO course);

    void updateCourse(CourseDTO course);

    void deleteCourse(int courseId);

}
