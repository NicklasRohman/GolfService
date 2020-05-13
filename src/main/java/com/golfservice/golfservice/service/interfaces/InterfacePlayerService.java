package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.entity.PlayerEntity;

import java.util.List;

public interface InterfacePlayerService {
    List<PlayerEntity> getAllPlayers();

    PlayerEntity getPlayer(int playerId);

    void addPlayer(PlayerEntity player);

    void updatePlayer(PlayerEntity player);

    void deletePlayer(int playerId);
}
