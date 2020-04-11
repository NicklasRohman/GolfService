package com.golfservice.golfservice.service;

import com.golfservice.golfservice.dto.CourseDTO;
import com.golfservice.golfservice.service.interfaces.InterfaceCourseService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements InterfaceCourseService {


    List<CourseDTO> listOfCourses;

    private void fakeDB() {
        listOfCourses = new ArrayList<>();
        listOfCourses.add(new CourseDTO("Läckö GK", 1));
        listOfCourses.add(new CourseDTO("Lidköpings GK", 2));
    }


    @Override
    public List<CourseDTO> findAll() {
        fakeDB();
        return listOfCourses;
    }

    @Override
    public List<CourseDTO> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CourseDTO> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CourseDTO> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(CourseDTO entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends CourseDTO> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CourseDTO> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CourseDTO> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CourseDTO> findById(Integer courseId) {
        fakeDB();
        for (CourseDTO co : listOfCourses) {
            if (co.getCourseId() == courseId) {
                return Optional.of(co);
            }
        }

        return null;
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends CourseDTO> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<CourseDTO> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CourseDTO getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends CourseDTO> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CourseDTO> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CourseDTO> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CourseDTO> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CourseDTO> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CourseDTO> boolean exists(Example<S> example) {
        return false;
    }
}
