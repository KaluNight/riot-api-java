package net.rithms.riot.api.endpoints.clash.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.clash.ClashApiMethod;
import net.rithms.riot.api.endpoints.clash.dto.ClashTournament;
import net.rithms.riot.constant.Platform;

public class GetClashTournamentByTeam extends ClashApiMethod {

  public GetClashTournamentByTeam(ApiConfig config, Platform platform, String teamId) {
    super(config);
    setPlatform(platform);
    setReturnType(ClashTournament.class);
    setUrlBase(platform.getHost() + "/lol/clash/v1/tournaments/by-team/" + teamId);
    addApiKeyParameter();
  }
}