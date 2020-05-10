package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.entity.CourseEntity;

import java.util.List;

public interface InterfaceCourseService {

    List<CourseEntity> getAllCourses();

    CourseEntity getCourse(int courseId);

    void addCourse(CourseEntity course);

    void updateCourse(CourseEntity course);

    void deleteCourse(int courseId);

}
