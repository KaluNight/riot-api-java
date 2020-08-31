package net.rithms.riot.api.endpoints.clash.methods;

import java.util.List;
import com.google.gson.reflect.TypeToken;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.clash.ClashApiMethod;
import net.rithms.riot.api.endpoints.clash.dto.ClashTeamMember;
import net.rithms.riot.constant.Platform;

public class GetClashPlayerRegistrationBySummoner extends ClashApiMethod {

  public GetClashPlayerRegistrationBySummoner(ApiConfig config, Platform platform, String summonerId) {
    super(config);
    setPlatform(platform);
    setReturnType(new TypeToken<List<ClashTeamMember>>() {
    }.getType());
    setUrlBase(platform.getHost() + "/lol/clash/v1/players/by-summoner/" + summonerId);
    addApiKeyParameter();
  }
  
}
