package net.rithms.riot.api.endpoints.clash.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import net.rithms.riot.api.Dto;

public class ClashTournamentPhase extends Dto implements Serializable {
  
  private static final long serialVersionUID = -577047210352508663L;
  
  private int id;
  private long registrationTime;
  private long startTime;
  private boolean cancelled;
  
  public int getId() {
    return id;
  }
  
  public long getRegistrationTimeTimestamp() {
    return registrationTime;
  }
  
  public ZonedDateTime getRegistrationTime() {
    return ZonedDateTime.of(Timestamp.from(Instant.ofEpochMilli(registrationTime)).toLocalDateTime(),
        ZoneId.systemDefault());
  }
  
  public long getStartTimeTimestamp() {
    return startTime;
  }
  
  public ZonedDateTime getStartTime() {
    return ZonedDateTime.of(Timestamp.from(Instant.ofEpochMilli(startTime)).toLocalDateTime(),
        ZoneId.systemDefault());
  }
  
  public boolean isCancelled() {
    return cancelled;
  }
}
