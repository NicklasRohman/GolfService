package com.golfservice.golfservice.service;

import com.golfservice.golfservice.entity.PlayerEntity;
import com.golfservice.golfservice.repository.PlayerRepository;
import com.golfservice.golfservice.service.interfaces.InterfacePlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService implements InterfacePlayerService {

    @Autowired
    PlayerRepository playerRepository;

    List<PlayerEntity> listOfPlayers = new ArrayList<>();

    public PlayerService() {
        listOfPlayers.add(new PlayerEntity(1, "Nicklas Rohman"));
        listOfPlayers.add(new PlayerEntity(2, "Jan Rohman"));
    }

    @Override
    public List<PlayerEntity> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public PlayerEntity getPlayer(int playerId) {

        for (PlayerEntity pl : listOfPlayers) {
            if (pl.getPlayerId() == playerId) {
                return pl;
            }
        }

        return null;
    }

    @Override
    public void addPlayer(PlayerEntity player) {
        listOfPlayers.add(player);
    }

    @Override
    public void updatePlayer(PlayerEntity player) {
        for (PlayerEntity pl : listOfPlayers) {
            if (pl.getPlayerId() == player.getPlayerId()) {
                pl.setPlayerName(player.getPlayerName());
            }
        }

    }

    @Override
    public void deletePlayer(int playerId) {
        listOfPlayers.removeIf(co -> co.getPlayerId() == playerId);
    }

}
