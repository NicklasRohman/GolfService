package com.golfservice.golfservice.controller;

import com.golfservice.golfservice.controller.interfaces.InterfaceRoundController;
import com.golfservice.golfservice.dto.RoundDTO;
import com.golfservice.golfservice.service.RoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/round"})
public class RoundController implements InterfaceRoundController {

    @Autowired
    private RoundService roundService;

    @RequestMapping("/{playerId}/getAllRounds")
    public List<RoundDTO> getRoundsForPlayer(@PathVariable("playerId") int playerId) {
        return roundService.getAllRoundsForPlayer(playerId);
    }

    @RequestMapping("/{roundId}")
    public RoundDTO getRound(@PathVariable("roundId") int roundId) {
        return roundService.getRound(roundId);
    }

}
