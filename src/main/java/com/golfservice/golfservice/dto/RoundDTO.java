package com.golfservice.golfservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "round")
public class RoundDTO {

    @Id
    private int roundId;
    private int playerId;
    private int hole1;
    private int hole2;
    private int hole3;
    private int hole4;
    private int hole5;
    private int hole6;
    private int hole7;
    private int hole8;
    private int hole9;
    private int hole10;
    private int hole11;
    private int hole12;
    private int hole13;
    private int hole14;
    private int hole15;
    private int hole16;
    private int hole17;
    private int hole18;
    private int totalScoreFirst9;
    private int totalScoreLast9;
    private int totalScore;

    public RoundDTO(int roundId, int playerId, int hole1, int hole2, int hole3, int hole4, int hole5, int hole6, int hole7, int hole8, int hole9, int hole10, int hole11, int hole12, int hole13, int hole14, int hole15, int hole16, int hole17, int hole18) {
        this.roundId = roundId;

        this.playerId = playerId;
        this.hole1 = hole1;
        this.hole2 = hole2;
        this.hole3 = hole3;
        this.hole4 = hole4;
        this.hole5 = hole5;
        this.hole6 = hole6;
        this.hole7 = hole7;
        this.hole8 = hole8;
        this.hole9 = hole9;
        this.totalScoreFirst9 = this.hole1 + this.hole2 + this.hole3 + this.hole4 + this.hole5 + this.hole6 + this.hole7 + this.hole8 + this.hole9;

        this.hole10 = hole10;
        this.hole11 = hole11;
        this.hole12 = hole12;
        this.hole13 = hole13;
        this.hole14 = hole14;
        this.hole15 = hole15;
        this.hole16 = hole16;
        this.hole17 = hole17;
        this.hole18 = hole18;
        this.totalScoreLast9 = this.hole10 + this.hole11 + this.hole12 + this.hole13 + this.hole14 + this.hole15 + this.hole16 + this.hole17 + this.hole18;

        this.totalScore = this.totalScoreFirst9 + this.totalScoreLast9;
    }
}
