package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;
import net.rithms.riot.api.endpoints.match.dto.MatchPosition;

public class TimelineEvent extends Dto implements Serializable {

  private static final long serialVersionUID = 1936824412463193547L;

  private long realTimestamp;
  private int timestamp;
  private String type;
  private int creatorId;
  private String wardType;
  private int itemId;
  private int participantId;
  private String levelUpType;
  private int skillSlot;
  private List<Integer> assistingParticipantIds;
  private int bounty;
  private int killStreakLength;
  private int killerId;
  private MatchPosition position;
  private List<TimelineVictimDamageDealt> victimDamageDealt;
  private List<TimelineVictimDamageReceived> victimDamageReceived;
  private int victimId;
  private String killType;
  private int level;
  private int afterId;
  private int beforeId;
  private int goldGain;
  private int multiKillLength;
  private String laneType;
  private int teamId;
  private int killerTeamId;
  private String monsterSubType;
  private String monsterType;
  private String buildingType;
  private String towerType;
  private long gameId;
  private int winningTeam;
  
  public static long getSerialversionuid() {
    return serialVersionUID;
  }
  
  public long getRealTimestamp() {
    return realTimestamp;
  }
  
  public int getTimestamp() {
    return timestamp;
  }
  
  public String getType() {
    return type;
  }
  
  public int getCreatorId() {
    return creatorId;
  }
  
  public String getWardType() {
    return wardType;
  }
  
  public int getItemId() {
    return itemId;
  }
  
  public int getParticipantId() {
    return participantId;
  }
  
  public String getLevelUpType() {
    return levelUpType;
  }
  
  public int getSkillSlot() {
    return skillSlot;
  }
  
  public List<Integer> getAssistingParticipantIds() {
    return assistingParticipantIds;
  }
  
  public int getBounty() {
    return bounty;
  }
  
  public int getKillStreakLength() {
    return killStreakLength;
  }
  
  public int getKillerId() {
    return killerId;
  }
  
  public MatchPosition getPosition() {
    return position;
  }
  
  public List<TimelineVictimDamageDealt> getVictimDamageDealt() {
    return victimDamageDealt;
  }
  
  public List<TimelineVictimDamageReceived> getVictimDamageReceived() {
    return victimDamageReceived;
  }
  
  public int getVictimId() {
    return victimId;
  }
  
  public String getKillType() {
    return killType;
  }
  
  public int getLevel() {
    return level;
  }
  
  public int getAfterId() {
    return afterId;
  }
  
  public int getBeforeId() {
    return beforeId;
  }
  
  public int getGoldGain() {
    return goldGain;
  }
  
  public int getMultiKillLength() {
    return multiKillLength;
  }
  
  public String getLaneType() {
    return laneType;
  }
  
  public int getTeamId() {
    return teamId;
  }
  
  public int getKillerTeamId() {
    return killerTeamId;
  }
  
  public String getMonsterSubType() {
    return monsterSubType;
  }
  
  public String getMonsterType() {
    return monsterType;
  }
  
  public String getBuildingType() {
    return buildingType;
  }
  
  public String getTowerType() {
    return towerType;
  }
  
  public long getGameId() {
    return gameId;
  }
  
  public int getWinningTeam() {
    return winningTeam;
  }
}