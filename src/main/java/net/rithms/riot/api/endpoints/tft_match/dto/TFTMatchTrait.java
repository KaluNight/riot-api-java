package net.rithms.riot.api.endpoints.tft_match.dto;

import java.io.Serializable;
import net.rithms.riot.api.Dto;

public class TFTMatchTrait extends Dto implements Serializable {

  private static final long serialVersionUID = -6428539222568227788L;
  
  private String name;
  private int num_units;
  private int style;
  private int tier_current;
  private int tier_total;
  
  public String getName() {
    return name;
  }
  
  public int getNumUnits() {
    return num_units;
  }
  
  public int getStyle() {
    return style;
  }
  
  public int getTierCurrent() {
    return tier_current;
  }
  
  public int getTierTotal() {
    return tier_total;
  }
  
}