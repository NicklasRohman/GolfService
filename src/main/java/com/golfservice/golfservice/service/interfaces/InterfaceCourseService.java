package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.dto.CourseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceCourseService extends JpaRepository<CourseDTO, Integer> {

}
