package net.rithms.riot.api.endpoints.tft_summoner.methods;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.endpoints.tft_summoner.TFTSummonerApiMethod;
import net.rithms.riot.api.endpoints.tft_summoner.dto.TFTSummoner;
import net.rithms.riot.constant.Platform;

public class GetTFTSummonerByName extends TFTSummonerApiMethod {

  public GetTFTSummonerByName(ApiConfig config, Platform platform, String summonerName) {
    super(config);
    setPlatform(platform);
    setReturnType(TFTSummoner.class);
    try {
      setUrlBase(platform.getHost() + "/tft/summoner/v1/summoners/by-name/" + URLEncoder.encode(summonerName, "UTF-8"));
    } catch (UnsupportedEncodingException e) {
      // This should never happen
      RiotApi.log.error("URL Encoding Failed", e);
    }
    addTFTApiKeyParameter();
  }
  
}
