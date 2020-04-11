package com.golfservice.golfservice.service;

import com.golfservice.golfservice.dto.RoundDTO;
import com.golfservice.golfservice.service.interfaces.InterfaceRoundService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoundService implements InterfaceRoundService {

    List<RoundDTO> listOfRounds = new ArrayList<>();

    public RoundService() {
        listOfRounds.add(new RoundDTO(1, 1, 3, 3, 3, 3, 5, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3));
        listOfRounds.add(new RoundDTO(2, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3));
        listOfRounds.add(new RoundDTO(3, 2, 3, 4, 3, 3, 3, 3, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3));
        listOfRounds.add(new RoundDTO(4, 2, 3, 3, 3, 3, 5, 3, 3, 3, 3, 3, 5, 3, 3, 3, 3, 3, 3, 3));
    }

    @Override
    public List<RoundDTO> getAllRoundsForPlayer(int playerId) {

        List<RoundDTO> result = new ArrayList<>();

        for (RoundDTO ro : listOfRounds) {
            if (ro.getPlayerId() == playerId) {
                result.add(ro);
            }
        }

        return result;
    }

    @Override
    public RoundDTO getRound(int roundId) {

        for (RoundDTO ro : listOfRounds) {
            if (ro.getRoundId() == roundId) {
                return ro;
            }
        }

        return null;
    }

    @Override
    public void addRound(RoundDTO round) {
        listOfRounds.add(round);
    }

    @Override
    public void updateRound(RoundDTO round) {
        for (RoundDTO ro : listOfRounds
        ) {
            if (ro.getRoundId() == round.getRoundId()) {
                ro.setPlayerId(round.getPlayerId());
                ro.setHole1(round.getHole1());
                ro.setHole2(round.getHole2());
                ro.setHole3(round.getHole3());
                ro.setHole4(round.getHole4());
                ro.setHole5(round.getHole5());
                ro.setHole6(round.getHole6());
                ro.setHole7(round.getHole7());
                ro.setHole8(round.getHole8());
                ro.setHole9(round.getHole9());
                ro.setHole10(round.getHole10());
                ro.setHole11(round.getHole11());
                ro.setHole12(round.getHole12());
                ro.setHole13(round.getHole13());
                ro.setHole14(round.getHole14());
                ro.setHole15(round.getHole15());
                ro.setHole16(round.getHole16());
                ro.setHole17(round.getHole17());
                ro.setHole18(round.getHole18());

                ro.setTotalScoreFirst9(ro.getHole1() + ro.getHole2() + ro.getHole3() + ro.getHole4() + ro.getHole5() + ro.getHole6() + ro.getHole7() + ro.getHole8() + ro.getHole9());
                ro.setTotalScoreLast9(ro.getHole10() + ro.getHole11() + ro.getHole12() + ro.getHole13() + ro.getHole14() + ro.getHole15() + ro.getHole16() + ro.getHole17() + ro.getHole18());
                ro.setTotalScore(ro.getTotalScoreFirst9() + ro.getTotalScoreLast9());
                
            }

        }
    }

    @Override
    public void deleteRound(int roundId) {
        listOfRounds.removeIf(ro -> ro.getRoundId() == roundId);

    }
}
