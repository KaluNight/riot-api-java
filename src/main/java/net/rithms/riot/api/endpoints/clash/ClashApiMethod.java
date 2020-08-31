package net.rithms.riot.api.endpoints.clash;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.ApiMethod;

public abstract class ClashApiMethod extends ApiMethod {

  protected ClashApiMethod(ApiConfig config) {
    super(config, "clash");
    requireApiKey();
  }
}
