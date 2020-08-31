package net.rithms.riot.api.endpoints.clash;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.ApiMethod;

/**
 * Api method for Clash API.
 * @author KaluNight
 */
public abstract class ClashApiMethod extends ApiMethod {

  protected ClashApiMethod(ApiConfig config) {
    super(config, "clash");
    requireApiKey();
  }
}
