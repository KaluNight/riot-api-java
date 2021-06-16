package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class TimelineChampionStats extends Dto implements Serializable {

  private static final long serialVersionUID = -8949312776716011900L;
  
  private int abilityPower;
  private int armor;
  private int armorPen;
  private int armorPenPercent;
  private int attackDamage;
  private int attackSpeed;
  private int bonusArmorPenPercent;
  private int bonusMagicPenPercent;
  private int ccReduction;
  private int cooldownReduction;
  private int health;
  private int healthMax;
  private int healthRegen;
  private int lifesteal;
  private int magicPen;
  private int magicPenPercent;
  private int magicResist;
  private int movementSpeed;
  private int power;
  private int powerMax;
  private int powerRegen;
  private int spellVamp;
  
  public int getAbilityPower() {
    return abilityPower;
  }
  
  public int getArmor() {
    return armor;
  }
  
  public int getArmorPen() {
    return armorPen;
  }
  
  public int getArmorPenPercent() {
    return armorPenPercent;
  }
  
  public int getAttackDamage() {
    return attackDamage;
  }
  
  public int getAttackSpeed() {
    return attackSpeed;
  }
  
  public int getBonusArmorPenPercent() {
    return bonusArmorPenPercent;
  }
  
  public int getBonusMagicPenPercent() {
    return bonusMagicPenPercent;
  }
  
  public int getCcReduction() {
    return ccReduction;
  }
  
  public int getCooldownReduction() {
    return cooldownReduction;
  }
  
  public int getHealth() {
    return health;
  }
  
  public int getHealthMax() {
    return healthMax;
  }
  
  public int getHealthRegen() {
    return healthRegen;
  }
  
  public int getLifesteal() {
    return lifesteal;
  }
  
  public int getMagicPen() {
    return magicPen;
  }
  
  public int getMagicPenPercent() {
    return magicPenPercent;
  }
  
  public int getMagicResist() {
    return magicResist;
  }
  
  public int getMovementSpeed() {
    return movementSpeed;
  }
  
  public int getPower() {
    return power;
  }
  
  public int getPowerMax() {
    return powerMax;
  }
  
  public int getPowerRegen() {
    return powerRegen;
  }
  
  public int getSpellVamp() {
    return spellVamp;
  }
}