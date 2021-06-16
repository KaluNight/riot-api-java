package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;

public class StatsTeam extends Dto implements Serializable {

  private static final long serialVersionUID = 8959596393491794607L;
  
  private List<DraftChampionBan> bans;
  private StatsObjectives objectives;
  private int teamId;
  private boolean win;
  
  public List<DraftChampionBan> getBans() {
    return bans;
  }
  
  public StatsObjectives getObjectives() {
    return objectives;
  }
  
  public int getTeamId() {
    return teamId;
  }
  
  public boolean isWin() {
    return win;
  }
}