package com.golfservice.golfservice.service;

import com.golfservice.golfservice.entity.CourseEntity;
import com.golfservice.golfservice.service.interfaces.InterfaceCourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements InterfaceCourseService {

    List<CourseEntity> listOfCourses = new ArrayList<>();

    public CourseService() {
        listOfCourses.add(new CourseEntity("Läckö GK", 1));
        listOfCourses.add(new CourseEntity("Lidköpings GK", 2));
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        return listOfCourses;
    }

    @Override
    public CourseEntity getCourse(int courseId) {

        for (CourseEntity co : listOfCourses) {
            if (co.getCourseId() == courseId) {
                return co;
            }
        }

        return null;
    }

    @Override
    public void addCourse(CourseEntity course) {
        listOfCourses.add(course);
    }

    @Override
    public void updateCourse(CourseEntity course) {
        for (CourseEntity co : listOfCourses) {
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
