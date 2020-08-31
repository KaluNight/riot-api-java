package net.rithms.riot.api.endpoints.clash.dto;

import java.io.Serializable;
import java.util.List;
import net.rithms.riot.api.Dto;

/**
 * Representation of a Clash tournament.
 */
public class ClashTournament extends Dto implements Serializable {

  private static final long serialVersionUID = 278239760104769042L;
  
  private int id;
  private int themeId;
  private String nameKey;
  private String nameKeySecondary;
  private List<ClashTournamentPhase> schedule;
  
  public int getId() {
    return id;
  }
  
  public int getThemeId() {
    return themeId;
  }
  
  public String getNameKey() {
    return nameKey;
  }
  
  public String getNameKeySecondary() {
    return nameKeySecondary;
  }
  
  public List<ClashTournamentPhase> getSchedule() {
    return schedule;
  }
}
