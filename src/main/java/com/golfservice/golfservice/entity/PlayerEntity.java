package com.golfservice.golfservice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "player")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;

    private String playerName;
    private double avgGreenHits;
    private double avgPutts;

    public PlayerEntity() {
    }

    public PlayerEntity(String playerName) {
        this.playerName = playerName;
    }

}
