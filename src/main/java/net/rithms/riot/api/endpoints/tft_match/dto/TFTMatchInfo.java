package net.rithms.riot.api.endpoints.tft_match.dto;

import java.io.Serializable;
import java.util.List;
import net.rithms.riot.api.Dto;

public class TFTMatchInfo extends Dto implements Serializable {

  private static final long serialVersionUID = 6266121385607163658L;
  
  private long game_datetime;
  private float game_length;
  private String game_variation;
  private String game_version;
  private List<TFTMatchParticipant> participants;
  private int queue_id;
  private int tft_set_number;
  
  /**
   * Return the {@link TFTMatchParticipant} corresponding to the given puuid.
   * @param puuid
   *             The puuid of the wanted participant.
   * @return the asked participant or null if the given puuid correspond to no participant.
   */
  public TFTMatchParticipant getTFTMatchParticipantByPuuid(String puuid) {
    for(TFTMatchParticipant participant : participants) {
      if(participant.getPuuid().equals(puuid)) {
        return participant;
      }
    }
    return null;
  }
  
  public long getGameDateTime() {
    return game_datetime;
  }
  
  public float getGameLength() {
    return game_length;
  }
  
  public String getGameVariation() {
    return game_variation;
  }
  
  public String getGameVersion() {
    return game_version;
  }
  
  public List<TFTMatchParticipant> getParticipants() {
    return participants;
  }
  
  public int getQueueId() {
    return queue_id;
  }
  
  public int getTftSetNumber() {
    return tft_set_number;
  }
  
}
