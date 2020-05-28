package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.entity.PlayerEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface InterfacePlayerService {
    List<PlayerEntity> getAllPlayers();

    ResponseEntity<PlayerEntity> getPlayer(int playerId);

    ResponseEntity<HttpStatus> addPlayer(String player);

    void updatePlayer(int playerId, String playerName);

    void deletePlayer(int playerId);
}
