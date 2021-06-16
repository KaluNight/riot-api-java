package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class StatsRiftHerald extends Dto implements Serializable {

  private static final long serialVersionUID = -2779774471521701454L;
  
  private boolean first;
  private int kills;
  
  public boolean isFirst() {
    return first;
  }
  
  public int getKills() {
    return kills;
  }
  
}
