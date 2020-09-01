package net.rithms.riot.api.endpoints.tft_summoner;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.ApiMethod;

public abstract class TFTSummonerApiMethod extends ApiMethod {

  protected TFTSummonerApiMethod(ApiConfig config) {
    super(config, "tft-summoner");
    requireTFTApiKey();
  }
}