package com.golfservice.golfservice.service;

import com.golfservice.golfservice.dto.CourseDTO;
import com.golfservice.golfservice.service.interfaces.InterfaceCourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements InterfaceCourseService {

    List<CourseDTO> listOfCourses = new ArrayList<>();

    public CourseService() {
        listOfCourses.add(new CourseDTO("Läckö GK", 1));
        listOfCourses.add(new CourseDTO("Lidköpings GK", 2));
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        return listOfCourses;
    }

    @Override
    public CourseDTO getCourse(int courseId) {

        for (CourseDTO co : listOfCourses) {
            if (co.getCourseId() == courseId) {
                return co;
            }
        }

        return null;
    }

    @Override
    public void addCourse(CourseDTO course) {
        listOfCourses.add(course);
    }

    @Override
    public void updateCourse(CourseDTO course) {
        for (CourseDTO co : listOfCourses) {
            if (co.getCourseId() == course.getCourseId()) {
                co.setCourseName(course.getCourseName());
            }
        }
    }

    @Override
    public void deleteCourse(int courseId) {
        listOfCourses.removeIf(co -> co.getCourseId() == courseId);
    }

}
