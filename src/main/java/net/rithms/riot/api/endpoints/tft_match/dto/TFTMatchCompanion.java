package net.rithms.riot.api.endpoints.tft_match.dto;

import java.io.Serializable;
import net.rithms.riot.api.Dto;

public class TFTMatchCompanion extends Dto implements Serializable {
  
  private static final long serialVersionUID = -769957542250892988L;
  
  private String content_ID;
  private long skin_ID;
  private String species;
  
  public String getContentId() {
    return content_ID;
  }
  
  public long getSkinId() {
    return skin_ID;
  }
  
  public String getSpecies() {
    return species;
  }
  
}