package net.rithms.riot.api.endpoints.match.methods;

import java.util.List;

import com.google.gson.reflect.TypeToken;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.UrlParameter;
import net.rithms.riot.api.endpoints.match.MatchApiMethod;
import net.rithms.riot.constant.Platform;

public class GetMatchListByPuuid extends MatchApiMethod {

  public GetMatchListByPuuid(ApiConfig config, Platform platform, String puuid, Integer startIndex, Integer count) {
    super(config);
    setPlatform(platform);
    setReturnType(new TypeToken<List<String>>() {
    }.getType());

    setUrlBase(platform.getRegionalHost() + "/lol/match/v5/matches/by-puuid/" + puuid + "/ids");

    if (count != null) {
      add(new UrlParameter("count", count));
    }

    if (startIndex != null) {
      add(new UrlParameter("start", startIndex));
    }
    addApiKeyParameter();
  }

}
