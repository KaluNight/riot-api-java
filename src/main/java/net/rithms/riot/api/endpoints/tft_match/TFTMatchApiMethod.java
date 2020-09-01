package net.rithms.riot.api.endpoints.tft_match;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.ApiMethod;

public abstract class TFTMatchApiMethod extends ApiMethod {

  protected TFTMatchApiMethod(ApiConfig config) {
    super(config, "tft-match");
    requireTFTApiKey();
  }
}
