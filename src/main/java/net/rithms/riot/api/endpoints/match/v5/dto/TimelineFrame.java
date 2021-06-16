package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;
import java.util.List;

import net.rithms.riot.api.Dto;

public class TimelineFrame extends Dto implements Serializable {

  private static final long serialVersionUID = 3231669740924710887L;
  
  private List<TimelineEvent> events;
  private TimelineAllParticipantsFrames participantFrames;
  private int timestamp;
  
  public List<TimelineEvent> getEvents() {
    return events;
  }
  
  public TimelineAllParticipantsFrames getParticipantFrames() {
    return participantFrames;
  }
  
  public int getTimestamp() {
    return timestamp;
  }
}