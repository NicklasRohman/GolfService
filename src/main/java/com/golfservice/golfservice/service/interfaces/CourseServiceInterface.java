package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.dto.CourseDTO;

import java.util.List;

public interface CourseServiceInterface {

    public List<CourseDTO> getAllCourses();

    public CourseDTO getCoursesById(int courseId);

}
