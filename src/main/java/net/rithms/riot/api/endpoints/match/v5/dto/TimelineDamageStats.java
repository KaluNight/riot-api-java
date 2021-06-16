package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class TimelineDamageStats extends Dto implements Serializable {

  private static final long serialVersionUID = 1546743476249345665L;
  
  private int magicDamageDone;
  private int magicDamageDoneToChampions;
  private int magicDamageTaken;
  private int physicalDamageDone;
  private int physicalDamageDoneToChampions;
  private int physicalDamageTaken;
  private int totalDamageDone;
  private int totalDamageDoneToChampions;
  private int totalDamageTaken;
  private int trueDamageDone;
  private int trueDamageDoneToChampions;
  private int trueDamageTaken;
  
  public int getMagicDamageDone() {
    return magicDamageDone;
  }
  
  public int getMagicDamageDoneToChampions() {
    return magicDamageDoneToChampions;
  }
  
  public int getMagicDamageTaken() {
    return magicDamageTaken;
  }
  
  public int getPhysicalDamageDone() {
    return physicalDamageDone;
  }
  
  public int getPhysicalDamageDoneToChampions() {
    return physicalDamageDoneToChampions;
  }
  
  public int getPhysicalDamageTaken() {
    return physicalDamageTaken;
  }
  
  public int getTotalDamageDone() {
    return totalDamageDone;
  }
  
  public int getTotalDamageDoneToChampions() {
    return totalDamageDoneToChampions;
  }
  
  public int getTotalDamageTaken() {
    return totalDamageTaken;
  }
  
  public int getTrueDamageDone() {
    return trueDamageDone;
  }
  
  public int getTrueDamageDoneToChampions() {
    return trueDamageDoneToChampions;
  }
  
  public int getTrueDamageTaken() {
    return trueDamageTaken;
  }
}