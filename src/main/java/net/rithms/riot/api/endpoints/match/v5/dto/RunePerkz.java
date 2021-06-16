package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;

public class RunePerkz extends Dto implements Serializable {

  private static final long serialVersionUID = 5883965901428718266L;
  
  private RuneStatsPerkz statPerks;
  private List<RuneStyle> styles;
  
  public RuneStatsPerkz getStatPerks() {    
    return statPerks;
  }
  
  public List<RuneStyle> getStyles() {
    return styles;
  }
  
}