package net.rithms.riot.api.endpoints.clash.team_list.methods;

import java.util.List;
import com.google.gson.reflect.TypeToken;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.endpoints.clash.ClashApiMethod;
import net.rithms.riot.api.endpoints.clash.team_list.dto.ClashTeamMember;
import net.rithms.riot.constant.Platform;

public class GetClashTeamMembersBySummoner extends ClashApiMethod {

  public GetClashTeamMembersBySummoner(ApiConfig config, Platform platform, String summonerId) {
    super(config);
    setPlatform(platform);
    setReturnType(new TypeToken<List<ClashTeamMember>>() {
    }.getType());
    setUrlBase(platform.getHost() + "/lol/clash/v1/players/by-summoner/" + summonerId);
    addApiKeyParameter();
  }
  
}
