package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class MatchV5Timeline extends Dto implements Serializable {

  private static final long serialVersionUID = -8057314163458714540L;

  private MatchMetadata metadata;
  private TimelineInfo info;
   
  public MatchMetadata getMetadata() {
    return metadata;
  }
  
  public TimelineInfo getInfo() {
    return info;
  }
}