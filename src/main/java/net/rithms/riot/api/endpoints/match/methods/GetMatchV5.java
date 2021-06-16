package net.rithms.riot.api.endpoints.match.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.match.MatchApiMethod;
import net.rithms.riot.api.endpoints.match.v5.dto.MatchV5;
import net.rithms.riot.constant.Platform;

public class GetMatchV5 extends MatchApiMethod {

  public GetMatchV5(ApiConfig config, Platform platform, String matchId) {
    super(config);
    setPlatform(platform);
    setReturnType(MatchV5.class);
    setUrlBase(platform.getRegionalHost() + "/lol/match/v5/matches/" + matchId);
    addApiKeyParameter();
  }
  
}
