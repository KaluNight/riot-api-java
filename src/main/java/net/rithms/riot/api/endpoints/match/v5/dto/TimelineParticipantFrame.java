package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;
import net.rithms.riot.api.endpoints.match.dto.MatchPosition;

public class TimelineParticipantFrame extends Dto implements Serializable {

  private static final long serialVersionUID = 4391740739860660897L;
  
  private TimelineChampionStats championStats;
  private int currentGold;
  private TimelineDamageStats damageStats;
  private int goldPerSecond;
  private int jungleMinionsKilled;
  private int level;
  private int minionsKilled;
  private int participantId;
  private MatchPosition position;
  private int timeEnemySpentControlled;
  private int totalGold;
  private int xp;
  
  public TimelineChampionStats getChampionStats() {
    return championStats;
  }
  
  public int getCurrentGold() {
    return currentGold;
  }
  
  public TimelineDamageStats getDamageStats() {
    return damageStats;
  }
  
  public int getGoldPerSecond() {
    return goldPerSecond;
  }
  
  public int getJungleMinionsKilled() {
    return jungleMinionsKilled;
  }
  
  public int getLevel() {
    return level;
  }
  
  public int getMinionsKilled() {
    return minionsKilled;
  }
  
  public int getParticipantId() {
    return participantId;
  }
  
  public MatchPosition getPosition() {
    return position;
  }
  
  public int getTimeEnemySpentControlled() {
    return timeEnemySpentControlled;
  }
  
  public int getTotalGold() {
    return totalGold;
  }
  
  public int getXp() {
    return xp;
  }
}