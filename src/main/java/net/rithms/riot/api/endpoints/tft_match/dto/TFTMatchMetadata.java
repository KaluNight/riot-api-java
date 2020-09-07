package net.rithms.riot.api.endpoints.tft_match.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;

public class TFTMatchMetadata extends Dto implements Serializable {

  private static final long serialVersionUID = -3520371575046330349L;
  
  private String data_version;
  private String match_id;
  
  /**
   * List of participants PUUID's
   */
  private List<String> participants;
  
  public String getDataVersion() {
    return data_version;
  }
  
  public String getMatchId() {
    return match_id;
  }
  
  public List<String> getParticipants() {
    return participants;
  }
}
