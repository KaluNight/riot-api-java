package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class StatsBaron extends Dto implements Serializable {

  private static final long serialVersionUID = -5876164194736089296L;
  
  private boolean first;
  private int kills;
  
  public boolean isFirst() {
    return first;
  }
  
  public int getKills() {
    return kills;
  }

}
