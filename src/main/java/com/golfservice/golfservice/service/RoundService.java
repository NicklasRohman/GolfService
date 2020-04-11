package com.golfservice.golfservice.service;

import com.golfservice.golfservice.dto.RoundDTO;
import com.golfservice.golfservice.service.interfaces.InterfaceRoundService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoundService implements InterfaceRoundService {


    @Override
    public List<RoundDTO> getAllRounds() {
        return null;
    }

    @Override
    public RoundDTO getRound(int roundId) {
        return null;
    }
}
