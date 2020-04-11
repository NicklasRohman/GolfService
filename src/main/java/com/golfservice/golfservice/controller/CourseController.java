package com.golfservice.golfservice.controller;

import com.golfservice.golfservice.controller.interfaces.InterfaceCourseController;
import com.golfservice.golfservice.dto.CourseDTO;
import com.golfservice.golfservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/course"})
public class CourseController implements InterfaceCourseController {

    @Autowired
    private CourseService courseService;

   @RequestMapping("/getAllCourses")
    public List<CourseDTO> getCourse() {
        return courseService.getAllCourses();
    }

    @RequestMapping({"/{courseId}"})
    public CourseDTO getCourse(@PathVariable("courseId") int courseId) {
        return courseService.getCourse(courseId);
    }

}
