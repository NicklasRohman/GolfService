package com.golfservice.golfservice.repository;

import com.golfservice.golfservice.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {

    @Query(value = "update golfprogram.player p set p.player_name = ? where p.player_id = ?",
            nativeQuery = true)
    void updateUserSetStatusForNameNative(String playerName, Integer playerId);
}
