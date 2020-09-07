package net.rithms.riot.api.endpoints.tft_match.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class TFTMatch extends Dto implements Serializable {

  private static final long serialVersionUID = 3706147402640616007L;
  
  private TFTMatchMetadata metadata;
  private TFTMatchInfo info;
  
  public TFTMatchMetadata getMetadata() {
    return metadata;
  }
  
  public TFTMatchInfo getInfo() {
    return info;
  }
  
}
