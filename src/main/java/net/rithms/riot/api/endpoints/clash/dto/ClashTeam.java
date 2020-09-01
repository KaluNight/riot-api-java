package net.rithms.riot.api.endpoints.clash.dto;

import java.io.Serializable;
import java.util.List;
import net.rithms.riot.api.Dto;
import net.rithms.riot.api.endpoints.clash.constant.ClashTier;

/**
 * Represent a Clash Team.
 */
public class ClashTeam extends Dto implements Serializable {

  private static final long serialVersionUID = 3623649295705467408L;
  
  private String id;
  private int tournamentId;
  private String name;
  private int iconId;
  private int tier;
  private String captain;
  private String abbreviation;
  private List<ClashTeamMember> players;
  
  public ClashTeamMember getCaptain() {
    for(ClashTeamMember teamMember : players) {
      if(teamMember.getSummonerId().equals(captain)) {
        return teamMember;
      }
    }
    return null;
  }
  
  public String getId() {
    return id;
  }
  
  public String getTournamentId() {
    return Integer.toString(tournamentId);
  }
  
  public String getName() {
    return name;
  }
  
  public int getIconId() {
    return iconId;
  }
  
  public ClashTier getTier() {
    return ClashTier.getClashTierByNumber(tier);
  }
  
  public String getAbbreviation() {
    return abbreviation;
  }
  
  public List<ClashTeamMember> getPlayers() {
    return players;
  }
  
}
