package net.rithms.riot.api.endpoints.clash.constant;

import java.security.InvalidParameterException;

public enum ClashTier {
  ONE(1),
  TWO(2),
  THREE(3),
  FOUR(4);

  private int tier;

  private ClashTier(int tier) {
    this.tier = tier;
  }
  
  public int getTier() {
    return tier;
  }
  
  public static ClashTier getClashTierByNumber(int tier) {
    for(ClashTier clashTier : values()) {
      if(clashTier.getTier() == tier) {
        return clashTier;
      }
    }
    throw new InvalidParameterException("Tier must be between 1 and 4 (included)");
  }
}
