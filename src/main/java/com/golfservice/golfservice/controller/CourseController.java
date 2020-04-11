package com.golfservice.golfservice.controller;

import com.golfservice.golfservice.controller.interfaces.CourseControllerInterface;
import com.golfservice.golfservice.dto.CourseDTO;
import com.golfservice.golfservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/course"})
public class CourseController implements CourseControllerInterface {

    @Autowired
    private CourseService courseService;


    @RequestMapping("/getAll")
    public List<CourseDTO> getCourse() {
        return courseService.getAllCourses();
    }

    @RequestMapping({"/{courseId}"})
    public CourseDTO getCourse(@PathVariable("courseId") int courseId) {
        return courseService.getCoursesById(courseId);
    }
}
