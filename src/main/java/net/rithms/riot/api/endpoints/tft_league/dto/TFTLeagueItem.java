package net.rithms.riot.api.endpoints.tft_league.dto;

import java.io.Serializable;
import net.rithms.riot.api.endpoints.league.dto.LeagueItem;

/**
 * Since the TFT LeagueItem object is exactly the same as a LoL LeagueItem, 
 * we extends it in the case the TFT LeagueItem got specific data for TFT with the time.
 */
public class TFTLeagueItem extends LeagueItem implements Serializable {

  private static final long serialVersionUID = 936490123746525155L;
}
