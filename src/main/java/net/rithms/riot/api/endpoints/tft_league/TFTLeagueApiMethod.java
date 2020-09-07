package net.rithms.riot.api.endpoints.tft_league;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.ApiMethod;

public abstract class TFTLeagueApiMethod extends ApiMethod {
  
  protected TFTLeagueApiMethod(ApiConfig config) {
    super(config, "tft-league");
    requireTFTApiKey();
  }
  
}
