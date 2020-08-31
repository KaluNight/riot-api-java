package net.rithms.riot.api.endpoints.clash.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.clash.ClashApiMethod;
import net.rithms.riot.api.endpoints.clash.dto.ClashTeam;
import net.rithms.riot.constant.Platform;

public class GetClashTeamByTeamId extends ClashApiMethod {

  public GetClashTeamByTeamId(ApiConfig config, Platform platform, String teamId) {
    super(config);
    setPlatform(platform);
    setReturnType(ClashTeam.class);
    setUrlBase(platform.getHost() + "/lol/clash/v1/teams/" + teamId);
    addApiKeyParameter();
  }
  
}
