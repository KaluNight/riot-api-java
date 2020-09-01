package net.rithms.riot.api.endpoints.tft_summoner.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.tft_summoner.TFTSummonerApiMethod;
import net.rithms.riot.api.endpoints.tft_summoner.dto.TFTSummoner;
import net.rithms.riot.constant.Platform;

public class GetTFTSummoner extends TFTSummonerApiMethod {

  public GetTFTSummoner(ApiConfig config, Platform platform, String summonerId) {
    super(config);
    setPlatform(platform);
    setReturnType(TFTSummoner.class);
    setUrlBase(platform.getHost() + "/tft/summoner/v1/summoners/" + summonerId);
    addTFTApiKeyParameter();
  }
}
