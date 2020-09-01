package net.rithms.riot.api.endpoints.tft_match.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.UrlParameter;
import net.rithms.riot.api.endpoints.tft_match.TFTMatchApiMethod;
import net.rithms.riot.api.endpoints.tft_summoner.dto.TFTSummoner;
import net.rithms.riot.constant.Platform;

public class GetTFTMatchListIdBySummonerPuuid extends TFTMatchApiMethod {

  public GetTFTMatchListIdBySummonerPuuid(ApiConfig config, Platform platform, String puuid, Integer count) {
    super(config);
    setPlatform(platform);
    setReturnType(TFTSummoner.class);
    setUrlBase(platform.getHost() + "/tft/summoner/v1/summoners/" + puuid);
    if (count != null) {
        add(new UrlParameter("count", count));
    }
    addTFTApiKeyParameter();
  }
}
