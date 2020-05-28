package com.golfservice.golfservice.service;

import com.golfservice.golfservice.entity.PlayerEntity;
import com.golfservice.golfservice.repository.PlayerRepository;
import com.golfservice.golfservice.service.interfaces.InterfacePlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<PlayerEntity> getPlayer(int playerId) {

        Optional<PlayerEntity> thePlayer = playerRepository.findById(playerId);

        if (thePlayer.isPresent()) {
            PlayerEntity player = new PlayerEntity();
            player.setPlayerName(thePlayer.get().getPlayerName());
            player.setAvgGreenHits(thePlayer.get().getAvgGreenHits());
            player.setAvgPutts(thePlayer.get().getAvgPutts());
            player.setPlayerId(thePlayer.get().getPlayerId());

            return new ResponseEntity<>(player, new HttpHeaders(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @Override
    public ResponseEntity<HttpStatus> addPlayer(String playerName) {

        List<PlayerEntity> playerExist = getAllPlayers();

        for (PlayerEntity p : playerExist) {
            if (p.getPlayerName().equalsIgnoreCase(playerName)) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public void updatePlayer(int playerId, String playerName) {

        try {
            playerRepository.updateUserSetStatusForNameNative(playerName, playerId);
        } catch (Exception e) {
            LOGGER.error("Error did not update player with the id {}, {}", playerId, e.getStackTrace());
        }
    }

    @Override
    public void deletePlayer(int playerId) {
        try {
            playerRepository.deleteById(playerId);
        } catch (Exception e) {
            LOGGER.info("No player with id {}, {}", playerId, e.getStackTrace());
        }

    }
}
