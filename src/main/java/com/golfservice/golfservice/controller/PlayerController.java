package com.golfservice.golfservice.controller;

import com.golfservice.golfservice.controller.interfaces.InterfacePlayerController;
import com.golfservice.golfservice.entity.PlayerEntity;
import com.golfservice.golfservice.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<PlayerEntity> getPlayer(@PathVariable("playerId") int playerId) {
        return playerService.getPlayer(playerId);
    }

    @PostMapping("/addPlayer")
    public ResponseEntity<HttpStatus> addPlayer(@RequestParam String playerName) {
        return playerService.addPlayer(playerName);
    }

    @PutMapping("/updatePlayer")
    public ResponseEntity<HttpStatus> updatePlayer(@RequestParam("playerId") int playerId, @RequestParam("playerName") String playerName) {
        playerService.updatePlayer(playerId, playerName);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/deletePlayer/{playerId}")
    public ResponseEntity<HttpStatus> deletePlayer(@PathVariable("playerId") int playerId) {
        playerService.deletePlayer(playerId);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}

