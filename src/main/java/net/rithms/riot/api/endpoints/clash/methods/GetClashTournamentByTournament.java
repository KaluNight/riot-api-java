package net.rithms.riot.api.endpoints.clash.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.clash.ClashApiMethod;
import net.rithms.riot.api.endpoints.clash.dto.ClashTournament;
import net.rithms.riot.constant.Platform;

public class GetClashTournamentByTournament extends ClashApiMethod {

  public GetClashTournamentByTournament(ApiConfig config, Platform platform, String tournamentId) {
    super(config);
    setPlatform(platform);
    setReturnType(ClashTournament.class);
    setUrlBase(platform.getHost() + "/lol/clash/v1/tournaments/" + tournamentId);
    addApiKeyParameter();
  }
}
