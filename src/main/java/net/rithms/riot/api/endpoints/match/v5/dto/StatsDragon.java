package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class StatsDragon extends Dto implements Serializable {
  
  private static final long serialVersionUID = -5192526806601306151L;
  
  private boolean first;
  private int kills;
  
  public boolean isFirst() {
    return first;
  }
  
  public int getKills() {
    return kills;
  }
  
}
