package com.golfservice.golfservice.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayerDTO {

    @Id
    private int playerId;
    private String playerName;
    private double avgGreenHits;
    private double avgPutts;

    public PlayerDTO(){}

    public PlayerDTO(int playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
    }

    public PlayerDTO(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public double getAvgGreenHits() {
        return this.avgGreenHits;
    }

    public double getAvgPutts() {
        return this.avgPutts;
    }

    public void setPlayerId(final int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(final String playerName) {
        this.playerName = playerName;
    }

    public void setAvgGreenHits(final double avgGreenHits) {
        this.avgGreenHits = avgGreenHits;
    }

    public void setAvgPutts(final double avgPutts) {
        this.avgPutts = avgPutts;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PlayerDTO)) {
            return false;
        } else {
            PlayerDTO other = (PlayerDTO) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getPlayerId() != other.getPlayerId()) {
                return false;
            } else {
                label33:
                {
                    Object this$playerName = this.getPlayerName();
                    Object other$playerName = other.getPlayerName();
                    if (this$playerName == null) {
                        if (other$playerName == null) {
                            break label33;
                        }
                    } else if (this$playerName.equals(other$playerName)) {
                        break label33;
                    }

                    return false;
                }

                if (Double.compare(this.getAvgGreenHits(), other.getAvgGreenHits()) != 0) {
                    return false;
                } else {
                    return Double.compare(this.getAvgPutts(), other.getAvgPutts()) == 0;
                }
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PlayerDTO;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + this.getPlayerId();
        Object $playerName = this.getPlayerName();
        result = result * 59 + ($playerName == null ? 43 : $playerName.hashCode());
        long $avgGreenHits = Double.doubleToLongBits(this.getAvgGreenHits());
        result = result * 59 + (int) ($avgGreenHits >>> 32 ^ $avgGreenHits);
        long $avgPutts = Double.doubleToLongBits(this.getAvgPutts());
        result = result * 59 + (int) ($avgPutts >>> 32 ^ $avgPutts);
        return result;
    }

    public String toString() {
        int var10000 = this.getPlayerId();
        return "Player(playerId=" + var10000 + ", playerName=" + this.getPlayerName() + ", avgGreenHits=" + this.getAvgGreenHits() + ", avgPutts=" + this.getAvgPutts() + ")";
    }

}
