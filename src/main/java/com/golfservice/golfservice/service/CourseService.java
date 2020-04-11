package com.golfservice.golfservice.service;

import com.golfservice.golfservice.dto.CourseDTO;
import com.golfservice.golfservice.service.interfaces.CourseServiceInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements CourseServiceInterface {


    List<CourseDTO> listOfCourses;

    private void fakeDB() {
        listOfCourses = new ArrayList<>();
        listOfCourses.add(new CourseDTO("Läckö GK", 1));
        listOfCourses.add(new CourseDTO("Lidköpings GK", 2));
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        fakeDB();
        return listOfCourses;
    }

    @Override
    public CourseDTO getCoursesById(int courseId) {
        fakeDB();
        for (CourseDTO co : listOfCourses) {
            if (co.getCourseId() == courseId) {
                return co;
            }
        }

        return null;
    }
}
