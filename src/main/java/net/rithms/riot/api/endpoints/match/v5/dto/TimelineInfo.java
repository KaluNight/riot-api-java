package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;

public class TimelineInfo extends Dto implements Serializable{

  private static final long serialVersionUID = -4414114102914020455L;

  private int frameInterval;
  private List<TimelineFrame> frames;
  private long gameId;
  private List<TimelineParticipant> participants;
  
  public int getFrameInterval() {
    return frameInterval;
  }
  
  public List<TimelineFrame> getFrames() {
    return frames;
  }
  
  public long getGameId() {
    return gameId;
  }
  
  public List<TimelineParticipant> getParticipants() {
    return participants;
  }
}