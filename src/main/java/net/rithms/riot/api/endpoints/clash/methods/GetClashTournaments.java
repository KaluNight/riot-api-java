package net.rithms.riot.api.endpoints.clash.methods;

import java.util.List;
import com.google.gson.reflect.TypeToken;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.clash.ClashApiMethod;
import net.rithms.riot.api.endpoints.clash.dto.ClashTournament;
import net.rithms.riot.constant.Platform;

public class GetClashTournaments extends ClashApiMethod {

  public GetClashTournaments(ApiConfig config, Platform platform) {
    super(config);
    setPlatform(platform);
    setReturnType(new TypeToken<List<ClashTournament>>() {
    }.getType());
    setUrlBase(platform.getHost() + "/lol/clash/v1/tournaments");
    addApiKeyParameter();
  }
}
