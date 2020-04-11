package com.golfservice.golfservice.service;

import com.golfservice.golfservice.dto.PlayerDTO;
import com.golfservice.golfservice.service.interfaces.InterfacePlayerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService implements InterfacePlayerService {

    List<PlayerDTO> listOfPlayers = new ArrayList<>();

    public PlayerService() {
        listOfPlayers.add(new PlayerDTO(1,"Nicklas Rohman"));
        listOfPlayers.add(new PlayerDTO(2,"Jan Rohman"));
    }


    @Override
    public List<PlayerDTO> getAllPlayers() {
        return listOfPlayers;
    }

    @Override
    public PlayerDTO getPlayer(int playerId) {

        for (PlayerDTO pl : listOfPlayers) {
            if (pl.getPlayerId() == playerId) {
                return pl;
            }
        }

        return null;
    }

    @Override
    public void addPlayer(PlayerDTO player) {
        listOfPlayers.add(player);
    }

    @Override
    public void updatePlayer(PlayerDTO player) {
        for (PlayerDTO pl : listOfPlayers) {
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
