package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class RuneSelection extends Dto implements Serializable {

  private static final long serialVersionUID = -4743950572043921229L;
  
  private int perk;
  private int var1;
  private int var2;
  private int var3;
  
  public int getPerk() {
    return perk;
  }
  
  public int getVar1() {
    return var1;
  }
  
  public int getVar2() {
    return var2;
  }
  
  public int getVar3() {
    return var3;
  }
  
}
