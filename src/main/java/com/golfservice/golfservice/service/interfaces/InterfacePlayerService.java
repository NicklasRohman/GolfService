package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.entity.PlayerEntity;

import java.util.List;
import java.util.Optional;

public interface InterfacePlayerService {
    List<PlayerEntity> getAllPlayers();

    Optional<PlayerEntity> getPlayer(int playerId);

    void addPlayer(String player);

    void updatePlayer(int playerId, String playerName);

    void deletePlayer(int playerId);
}
