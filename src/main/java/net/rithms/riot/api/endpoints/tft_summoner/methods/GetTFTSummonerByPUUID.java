package net.rithms.riot.api.endpoints.tft_summoner.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.tft_summoner.TFTSummonerApiMethod;
import net.rithms.riot.api.endpoints.tft_summoner.dto.TFTSummoner;
import net.rithms.riot.constant.Platform;

public class GetTFTSummonerByPUUID extends TFTSummonerApiMethod {

  public GetTFTSummonerByPUUID(ApiConfig config, Platform platform, String puuid) {
    super(config);
    setPlatform(platform);
    setReturnType(TFTSummoner.class);
    setUrlBase(platform.getHost() + "/tft/summoner/v1/summoners/by-puuid/" + puuid);
    addTFTApiKeyParameter();
  }

}
