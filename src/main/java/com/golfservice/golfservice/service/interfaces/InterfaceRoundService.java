package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.entity.RoundEntity;

import java.util.List;

public interface InterfaceRoundService {

    List<RoundEntity> getAllRoundsForPlayer(int playerId);

    RoundEntity getRound(int roundId);

    void addRound(RoundEntity round);

    void updateRound(RoundEntity round);

    void deleteRound(int roundId);

}
