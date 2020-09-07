package net.rithms.riot.api.endpoints.tft_league.dto;

import java.io.Serializable;
import java.util.List;
import net.rithms.riot.api.Dto;

public class TFTLeagueList extends Dto implements Serializable {

  private static final long serialVersionUID = 7833811493505460727L;
  
  private String leagueId;
  private List<TFTLeagueItem> entries;
  private String tier;
  private String name;
  private String queue;
  
  public String getLeagueId() {
    return leagueId;
  }
  
  public List<TFTLeagueItem> getEntries() {
    return entries;
  }
  
  public String getTier() {
    return tier;
  }
  
  public String getName() {
    return name;
  }
  
  public String getQueue() {
    return queue;
  }
}
