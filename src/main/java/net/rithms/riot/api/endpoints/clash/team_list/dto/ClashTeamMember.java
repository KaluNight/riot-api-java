package net.rithms.riot.api.endpoints.clash.team_list.dto;

import java.io.Serializable;
import net.rithms.riot.api.Dto;
import net.rithms.riot.api.endpoints.clash.team_list.constant.TeamPosition;
import net.rithms.riot.api.endpoints.clash.team_list.constant.TeamRole;

/**
 * This object contain an active team member of a clash team.
 * @author KaluNight
 */
public class ClashTeamMember extends Dto implements Serializable {

  private static final long serialVersionUID = -6040664986162887640L;
  
  private String summonerId;
  private String teamId;
  private String position;
  private String role;
  
  public String getSummonerId() {
    return summonerId;
  }
  
  public String getTeamId() {
    return teamId;
  }
  
  public TeamPosition getTeamPosition() {
    return TeamPosition.valueOf(position);
  }
  
  public TeamRole getTeamRole() {
    return TeamRole.valueOf(role);
  }
  
}
