package net.rithms.riot.api.endpoints.tft_league.methods;

import java.util.Set;
import com.google.gson.reflect.TypeToken;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.tft_league.TFTLeagueApiMethod;
import net.rithms.riot.api.endpoints.tft_league.dto.TFTLeagueEntry;
import net.rithms.riot.constant.Platform;

public class GetTFTLeagueEntryBySummoner extends TFTLeagueApiMethod {

  public GetTFTLeagueEntryBySummoner(ApiConfig config, Platform platform, String summonerId) {
    super(config);
    setPlatform(platform);
    setReturnType(new TypeToken<Set<TFTLeagueEntry>>() {
    }.getType());
    setUrlBase(platform.getHost() + "/tft/league/v1/entries/by-summoner/" + summonerId);
    addTFTApiKeyParameter();
  }
}
