package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;

public class MatchInfo extends Dto implements Serializable {
  
  private static final long serialVersionUID = 6091050769089476832L;
  
  private long gameCreation;
  private int gameDuration;
  private long gameId;
  private String gameMode;
  private String gameName;
  private long gameStartTimestamp;
  private String gameType;
  private String gameVersion;
  private int mapId;
  private List<MatchParticipant> participants;
  private String platformId;
  private int queueId;
  private List<StatsTeam> teams;
  
  /**
   * Utility method to get the participant by {@code puuid}.
   * </p>
   * 
   * @param puuid
   * 
   * @return Participant from {@link #getParticipants()} matching {@code puuid}, or {@code null} if there is no such participant.
   */
  public MatchParticipant getParticipantByPuuid(String puuid) {
    if (participants != null) {
      for (MatchParticipant participant : participants) {
        if (participant.getPuuid().equals(puuid)) {
          return participant;
        }
      }
    }
    return null;
  }
  
  /**
   * Utility method to get the participant by {@code summonerId}.
   * </p>
   * 
   * @param summonerId
   * 
   * @return Participant from {@link #getParticipants()} matching {@code summonerId}, or {@code null} if there is no such participant.
   */
  public MatchParticipant getParticipantBySummonerId(String summonerId) {
    if (participants != null) {
      for (MatchParticipant participant : participants) {
        if (participant.getSummonerId().equals(summonerId)) {
          return participant;
        }
      }
    }
    return null;
  }
  
  
  /**
   * Utility method to get the participant by {@code summonerName}.
   * <p>
   * 
   * @param summonerName
   *            Summoner name
   * @return Participant from {@link #getParticipants()} matching {@code summonerName}, or {@code null} if there is no such participant.
   */
  public MatchParticipant getParticipantBySummonerName(String summonerName) {
      for (MatchParticipant participant : participants) {
        if (participant.getSummonerName().equals(summonerName)) {
          return participant;
        }
      }
    return null;
  }
  
  /**
   * Utility method to get the team by {@code teamId}.
   * 
   * @param teamId
   *            Team ID
   * @return Team from {@link #getTeams()} matching {@code teamId}, or {@code null} if there is no team matching the {@code teamId}.
   */
  public StatsTeam getTeamByTeamId(int teamId) {
      for (StatsTeam team : teams) {
        if (team.getTeamId() == teamId) {
          return team;
        }
      }
    return null;
  }
  
  /**
   * Utility method to get the participant by {@code participantId}.
   * 
   * @param participantId
   *            Participant ID
   * @return Participant from {@link #getParticipants()} matching {@code participantId}, or {@code null} if there is no such participant.
   */
  public MatchParticipant getParticipantByParticipantId(int participantId) {
      for (MatchParticipant participant : participants) {
        if (participant.getParticipantId() == participantId) {
          return participant;
        }
      }
    return null;
  }
  
  public long getGameCreation() {
    return gameCreation;
  }
  
  public int getGameDuration() {
    return gameDuration;
  }
  
  public long getGameId() {
    return gameId;
  }
  
  public String getGameMode() {
    return gameMode;
  }
  
  public String getGameName() {
    return gameName;
  }
  
  public long getGameStartTimestamp() {
    return gameStartTimestamp;
  }
  
  public String getGameType() {
    return gameType;
  }
  
  public String getGameVersion() {
    return gameVersion;
  }
  
  public int getMapId() {
    return mapId;
  }
  
  public List<MatchParticipant> getParticipants() {
    return participants;
  }
  
  public String getPlatformId() {
    return platformId;
  }
  
  public int getQueueId() {
    return queueId;
  }
  
  public List<StatsTeam> getTeams() {
    return teams;
  }
}
