package com.golfservice.golfservice.service;

import com.golfservice.golfservice.dto.PlayerDTO;
import com.golfservice.golfservice.service.interfaces.InterfacePlayerService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService implements InterfacePlayerService {




    @Override
    public List<PlayerDTO> findAll() {
        return null;
    }

    @Override
    public List<PlayerDTO> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PlayerDTO> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PlayerDTO> findAllById(Iterable<Integer> integers) {
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
    public void delete(PlayerDTO entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends PlayerDTO> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PlayerDTO> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PlayerDTO> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PlayerDTO> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends PlayerDTO> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<PlayerDTO> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PlayerDTO getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends PlayerDTO> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PlayerDTO> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PlayerDTO> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PlayerDTO> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PlayerDTO> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PlayerDTO> boolean exists(Example<S> example) {
        return false;
    }
}
