package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.dto.CourseDTO;

import java.util.List;

public interface CourseServiceInterface {

    List<CourseDTO> getAllCourses();

    CourseDTO getCoursesById(int courseId);

}
