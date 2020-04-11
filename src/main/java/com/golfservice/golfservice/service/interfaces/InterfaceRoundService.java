package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.dto.RoundDTO;

import java.util.List;

public interface InterfaceRoundService {

    List<RoundDTO> getAllRoundsForPlayer(int playerId);

    RoundDTO getRound(int roundId);

    void addRound(RoundDTO round);

    void updateRound(RoundDTO round);

    void deleteRound(int roundId);

}
