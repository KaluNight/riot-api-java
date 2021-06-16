package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class TimelineParticipant extends Dto implements Serializable {

  private static final long serialVersionUID = 4409959074732075190L;

  private int participantId;
  private String puuid;
  
  public int getParticipantId() {
    return participantId;
  }
  
  public String getPuuid() {
    return puuid;
  }
  
}