package com.golfservice.golfservice.repository;

import com.golfservice.golfservice.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {

}
