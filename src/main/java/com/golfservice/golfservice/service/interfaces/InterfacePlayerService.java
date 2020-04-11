package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.dto.PlayerDTO;

import java.util.List;

public interface InterfacePlayerService {

    List<PlayerDTO> getAllPlayers();

    PlayerDTO getPlayer(int playerId);

    void addPlayer(PlayerDTO player);

    void updatePlayer(PlayerDTO player);

    void deletePlayer(int playerId);
}
