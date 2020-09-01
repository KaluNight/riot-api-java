package net.rithms.riot.api.endpoints.tft_summoner.dto;

import net.rithms.riot.api.endpoints.summoner.dto.Summoner;

/**
 * Since the TFTSummoner object is exactly the same as a LoL summoner, 
 * we extends it in the case the TFT Summoner got specific data for TFT with the time.
 */
public class TFTSummoner extends Summoner {

  private static final long serialVersionUID = -6140664067119236692L;

}
