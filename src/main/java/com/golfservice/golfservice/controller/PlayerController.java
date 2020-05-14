package com.golfservice.golfservice.controller;

import com.golfservice.golfservice.controller.interfaces.InterfacePlayerController;
import com.golfservice.golfservice.entity.PlayerEntity;
import com.golfservice.golfservice.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/player"})
public class PlayerController implements InterfacePlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/getPlayers")
    public List<PlayerEntity> getPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping({"/{playerId}"})
    public Optional<PlayerEntity> getPlayer(@PathVariable("playerId") int playerId) {
        return playerService.getPlayer(playerId);
    }

    @DeleteMapping("/deletePlayer/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId) {
        playerService.deletePlayer(playerId);
    }
}

