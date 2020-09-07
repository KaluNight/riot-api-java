package net.rithms.riot.api.endpoints.tft_match.dto;

import java.io.Serializable;
import java.util.List;
import net.rithms.riot.api.Dto;

public class TFTMatchUnit extends Dto implements Serializable {

  private static final long serialVersionUID = 6721233386818288401L;
  
  private List<Integer> items;
  private String character_id;
  private String name;
  private int rarity;
  private int tier;
  
  public List<Integer> getItems() {
    return items;
  }
  
  public String getCharacterId() {
    return character_id;
  }
  
  public String getName() {
    return name;
  }
  
  public int getRarity() {
    return rarity;
  }
  
  public int getTier() {
    return tier;
  }
  
}