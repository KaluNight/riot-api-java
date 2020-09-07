package net.rithms.riot.api.endpoints.tft_match.dto;

import java.io.Serializable;
import java.util.List;
import net.rithms.riot.api.Dto;

public class TFTMatchParticipant extends Dto implements Serializable {

  private static final long serialVersionUID = 673848687679294252L;
  
  private TFTMatchCompanion companion;
  private int gold_left;
  private int last_round;
  private int level;
  private int placement;
  private int players_eliminated;
  private String puuid;
  private float time_eliminated;
  private int total_damage_to_players;
  private List<TFTMatchTrait> traits;
  private List<TFTMatchUnit> units;
  
  public TFTMatchCompanion getCompanion() {
    return companion;
  }
  
  public int getGoldLeft() {
    return gold_left;
  }
  
  public int getLastRound() {
    return last_round;
  }
  
  public int getLevel() {
    return level;
  }
  
  public int getPlacement() {
    return placement;
  }
  
  public int getPlayersEliminated() {
    return players_eliminated;
  }
  
  public String getPuuid() {
    return puuid;
  }
  
  public float getTimeEliminated() {
    return time_eliminated;
  }
  
  public int getTotalDamageToPlayers() {
    return total_damage_to_players;
  }
  
  public List<TFTMatchTrait> getTraits() {
    return traits;
  }
  
  public List<TFTMatchUnit> getUnits() {
    return units;
  }
  
}
