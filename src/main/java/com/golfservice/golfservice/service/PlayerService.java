package com.golfservice.golfservice.service;

import com.golfservice.golfservice.entity.PlayerEntity;
import com.golfservice.golfservice.repository.PlayerRepository;
import com.golfservice.golfservice.service.interfaces.InterfacePlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import static com.golfservice.golfservice.GolfserviceApplication.LOGGER;

@Service
public class PlayerService implements InterfacePlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public List<PlayerEntity> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Optional<PlayerEntity> getPlayer(int playerId) {
        return playerRepository.findById(playerId);
    }

    @Override
    public void addPlayer(String player) {

        playerRepository.save(new PlayerEntity(player));
    }

    @Override
    public void updatePlayer(String player) {
        List<PlayerEntity> playerEntities = playerRepository.findAll();

        for (PlayerEntity p : playerEntities) {
            if (p.getPlayerName().equalsIgnoreCase(player)) {
                playerRepository.save(p);
            }
        }
    }

    @Override
    public void deletePlayer(int playerId) {
        try {
            playerRepository.deleteById(playerId);
        } catch (Exception e) {
            System.out.println("No player with id " + playerId);
            LOGGER.info("No player with id {}, {}", playerId, e.getStackTrace());
        }

    }
}
