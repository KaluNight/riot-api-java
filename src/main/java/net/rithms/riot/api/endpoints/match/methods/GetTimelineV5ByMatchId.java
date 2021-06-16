package net.rithms.riot.api.endpoints.match.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.match.MatchApiMethod;
import net.rithms.riot.api.endpoints.match.v5.dto.MatchV5Timeline;
import net.rithms.riot.constant.Platform;

public class GetTimelineV5ByMatchId extends MatchApiMethod {

  public GetTimelineV5ByMatchId(ApiConfig config, Platform platform, String matchId) {
    super(config);
    setPlatform(platform);
    setReturnType(MatchV5Timeline.class);
    setUrlBase(platform.getRegionalHost() + "/lol/match/v5/matches/" + matchId + "/timeline");
    addApiKeyParameter();
  }
}