package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class StatsTower extends Dto implements Serializable {

  private static final long serialVersionUID = -2443814752647695531L;
  
  private boolean first;
  private int kills;
  
  public boolean isFirst() {
    return first;
  }
  
  public int getKills() {
    return kills;
  }
}
