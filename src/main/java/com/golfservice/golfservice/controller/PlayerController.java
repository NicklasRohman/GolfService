package com.golfservice.golfservice.controller;

import com.golfservice.golfservice.controller.interfaces.InterfacePlayerController;
import com.golfservice.golfservice.entity.PlayerEntity;
import com.golfservice.golfservice.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/player"})
public class PlayerController implements InterfacePlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping("/getAllPlayers")
    public List<PlayerEntity> getPlayers() {
        return playerService.getAllPlayers();
    }

    @RequestMapping({"/{playerId}"})
    public PlayerEntity getPlayer(@PathVariable("playerId") int playerId) {
        return playerService.getPlayer(playerId);
    }

}
