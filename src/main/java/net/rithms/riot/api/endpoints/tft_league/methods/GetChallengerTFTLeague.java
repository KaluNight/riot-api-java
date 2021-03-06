package net.rithms.riot.api.endpoints.tft_league.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.tft_league.TFTLeagueApiMethod;
import net.rithms.riot.api.endpoints.tft_league.dto.TFTLeagueList;
import net.rithms.riot.constant.Platform;

public class GetChallengerTFTLeague extends TFTLeagueApiMethod {

  public GetChallengerTFTLeague(ApiConfig config, Platform platform) {
    super(config);
    setPlatform(platform);
    setReturnType(TFTLeagueList.class);
    setUrlBase(platform.getHost() + "/tft/league/v1/challenger");
    addTFTApiKeyParameter();
  }
}
