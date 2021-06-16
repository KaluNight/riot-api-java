package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class RuneStatsPerkz extends Dto implements Serializable {

  private static final long serialVersionUID = -3831162554804358474L;
  
  private int defense;
  private int flex;
  private int offense;
  
  public int getDefense() {
    return defense;
  }
  
  public int getFlex() {
    return flex;
  }
  
  public int getOffense() {
    return offense;
  }
}
