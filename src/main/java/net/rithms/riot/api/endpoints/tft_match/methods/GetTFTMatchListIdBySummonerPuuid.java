package net.rithms.riot.api.endpoints.tft_match.methods;

import java.util.List;

import com.google.gson.reflect.TypeToken;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.UrlParameter;
import net.rithms.riot.api.endpoints.tft_match.TFTMatchApiMethod;
import net.rithms.riot.constant.Platform;

public class GetTFTMatchListIdBySummonerPuuid extends TFTMatchApiMethod {

  public GetTFTMatchListIdBySummonerPuuid(ApiConfig config, Platform platform, String puuid, Integer count) {
    super(config);
    setPlatform(platform);
    setReturnType(new TypeToken<List<String>>() {
    }.getType());
    setUrlBase(platform.getRegionalHost(platform) + "/tft/match/v1/matches/by-puuid/" + puuid + "/ids");
    if (count != null) {
        add(new UrlParameter("count", count));
    }
    addTFTApiKeyParameter();
  }
}
