package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;

public class MatchTimelineMetadata extends Dto implements Serializable {

  private static final long serialVersionUID = -2959963783455590353L;
  
  private String dataVersion;
  private String matchId;
  private List<String> participants;
  
  public String getDataVersion() {
    return dataVersion;
  }
  
  public String getMatchId() {
    return matchId;
  }
  
  public List<String> getParticipants() {
    return participants;
  }
}
