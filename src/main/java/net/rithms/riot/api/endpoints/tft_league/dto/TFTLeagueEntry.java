package net.rithms.riot.api.endpoints.tft_league.dto;

import java.io.Serializable;
import net.rithms.riot.api.endpoints.league.dto.LeagueEntry;

/**
 * Since the TFT LeagueEntry object is exactly the same as a LoL LeagueEntry, 
 * we extends it in the case the TFT LeagueEntry got specific data for TFT with the time.
 */
public class TFTLeagueEntry extends LeagueEntry implements Serializable {

  private static final long serialVersionUID = 1321730236770446298L;
}
