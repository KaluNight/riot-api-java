package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class TimelineVictimDamage extends Dto implements Serializable {

  private static final long serialVersionUID = 3885405775994177029L;
  
  private boolean basic;
  private int magicDamage;
  private String name;
  private int participantId;
  private int physicalDamage;
  private String spellName;
  private int spellSlot;
  private int trueDamage;
  private String type;
  
  public static long getSerialversionuid() {
    return serialVersionUID;
  }
  
  public boolean isBasic() {
    return basic;
  }
  
  public int getMagicDamage() {
    return magicDamage;
  }
  
  public String getName() {
    return name;
  }
  
  public int getParticipantId() {
    return participantId;
  }
  
  public int getPhysicalDamage() {
    return physicalDamage;
  }
  
  public String getSpellName() {
    return spellName;
  }
  
  public int getSpellSlot() {
    return spellSlot;
  }
  
  public int getTrueDamage() {
    return trueDamage;
  }
  
  public String getType() {
    return type;
  }
}
