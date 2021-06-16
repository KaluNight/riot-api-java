package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;

public class MatchMetadata extends Dto implements Serializable {

  private static final long serialVersionUID = 4090649995539019111L;
  
  private String dataVersion;
  private String matchId;
  private List<String> participants;
  
  public String getDataVersion() {
    return dataVersion;
  }
  
  public String getMatchId() {
    return matchId;
  }

  public List<String> getParticipantsPuuid() {
    return participants;
  }

}