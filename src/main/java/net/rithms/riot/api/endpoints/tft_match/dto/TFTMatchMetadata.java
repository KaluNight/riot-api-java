package net.rithms.riot.api.endpoints.tft_match.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;

public class TFTMatchMetadata extends Dto implements Serializable {

  private String data_version;
  private String match_id;
  /**
   * List participants PUUID's
   */
  private List<String> participants;
}
