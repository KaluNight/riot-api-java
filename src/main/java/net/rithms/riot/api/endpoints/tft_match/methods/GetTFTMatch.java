package net.rithms.riot.api.endpoints.tft_match.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.tft_match.TFTMatchApiMethod;
import net.rithms.riot.api.endpoints.tft_match.dto.TFTMatch;
import net.rithms.riot.constant.Platform;

public class GetTFTMatch extends TFTMatchApiMethod {

  public GetTFTMatch(ApiConfig config, Platform platform, String matchId) {
    super(config);
    setPlatform(platform);
    setReturnType(TFTMatch.class);
    setUrlBase(platform.getRegionalHost() + "/tft/match/v1/matches/" + matchId);
    addTFTApiKeyParameter();
  }

}
