package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.dto.RoundDTO;

import java.util.List;

public interface InterfaceRoundService {
    List<RoundDTO> getAllRounds();

    RoundDTO getRound(int roundId);
}
