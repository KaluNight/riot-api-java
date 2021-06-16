package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class MatchV5 extends Dto implements Serializable {

  private static final long serialVersionUID = 6940386304738159155L;
  
  private MatchMetadata metadata;
  private MatchInfo info;
  
  public MatchMetadata getMetadata() {
    return metadata;
  }

  public MatchInfo getInfo() {
    return info;
  }
}