package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class DraftChampionBan extends Dto implements Serializable {

  private static final long serialVersionUID = -1805505634777750578L;
  
  private int championId;
  private int pickTurn;
  
  public int getChampionId() {
    return championId;
  }
  
  public int getPickTurn() {
    return pickTurn;
  }
  
}
