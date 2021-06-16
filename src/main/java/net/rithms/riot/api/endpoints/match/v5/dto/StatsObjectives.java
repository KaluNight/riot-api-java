package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class StatsObjectives extends Dto implements Serializable {

  private static final long serialVersionUID = 1600574911197533542L;
  
  private StatsBaron baron;
  private StatsChampion champion;
  private StatsDragon dragon;
  private StatsInhibitor inhibitor;
  private StatsRiftHerald riftHerald;
  private StatsTower tower;
  
  public StatsBaron getBaron() {
    return baron;
  }
  
  public StatsChampion getChampion() {
    return champion;
  }
  
  public StatsDragon getDragon() {
    return dragon;
  }
  
  public StatsInhibitor getInhibitor() {
    return inhibitor;
  }
  
  public StatsRiftHerald getRiftHerald() {
    return riftHerald;
  }
  
  public StatsTower getTower() {
    return tower;
  }
  
}
