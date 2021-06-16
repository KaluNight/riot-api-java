package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;

public class RuneStyle extends Dto implements Serializable {

  private static final long serialVersionUID = -2840834253064157568L;
  
  private String description;
  private List<RuneSelection> selections;
  private int style;

  public String getDescription() {
    return description;
  }

  public List<RuneSelection> getSelections() {
    return selections;
  }

  public int getStyle() {
    return style;
  }
  
}
