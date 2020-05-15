package com.golfservice.golfservice.controller;

import com.golfservice.golfservice.controller.interfaces.InterfaceRoundController;
import com.golfservice.golfservice.entity.RoundEntity;
import com.golfservice.golfservice.service.RoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/round"})
public class RoundController implements InterfaceRoundController {

    @Autowired
    private RoundService roundService;

    @GetMapping("/{playerId}/getAllRounds")
    public List<RoundEntity> getRoundsForPlayer(@PathVariable("playerId") int playerId) {
        return roundService.getAllRoundsForPlayer(playerId);
    }

    @GetMapping("/{roundId}")
    public RoundEntity getRound(@PathVariable("roundId") int roundId) {
        return roundService.getRound(roundId);
    }

    @PostMapping("/{round}")
    public ResponseEntity<HttpStatus> addRound(@RequestBody RoundEntity roundEntity) {
        roundService.addRound(roundEntity);

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/{round}")
    public ResponseEntity<HttpStatus> updateRound(@RequestBody RoundEntity roundEntity) {
        roundService.updateRound(roundEntity);

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/deleteRound/{roundId}")
    public ResponseEntity<HttpStatus> deleteRound(@PathVariable("roundId") int roundId) {
        roundService.deleteRound(roundId);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
