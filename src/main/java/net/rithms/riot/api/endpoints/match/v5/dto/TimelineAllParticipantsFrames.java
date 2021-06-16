package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import net.rithms.riot.api.Dto;

public class TimelineAllParticipantsFrames extends Dto implements Serializable {
  
  private static final long serialVersionUID = 8360495948296370833L;

  @SerializedName("1") 
  private TimelineParticipantFrame framePlayer1;
  @SerializedName("2") 
  private TimelineParticipantFrame framePlayer2;
  @SerializedName("3") 
  private TimelineParticipantFrame framePlayer3;
  @SerializedName("4") 
  private TimelineParticipantFrame framePlayer4;
  @SerializedName("5") 
  private TimelineParticipantFrame framePlayer5;
  @SerializedName("6") 
  private TimelineParticipantFrame framePlayer6;
  @SerializedName("7") 
  private TimelineParticipantFrame framePlayer7;
  @SerializedName("8") 
  private TimelineParticipantFrame framePlayer8;
  @SerializedName("9") 
  private TimelineParticipantFrame framePlayer9;
  @SerializedName("10") 
  private TimelineParticipantFrame framePlayer10;
  
  public List<TimelineParticipantFrame> getAllPlayersFrames() {
    List<TimelineParticipantFrame> allPlayersFrames = new ArrayList<>();
    
    if(framePlayer1 != null) {
      allPlayersFrames.add(framePlayer1);
    }
    
    if(framePlayer2 != null) {
      allPlayersFrames.add(framePlayer2);
    }
    
    if(framePlayer3 != null) {
      allPlayersFrames.add(framePlayer3);
    }
    
    if(framePlayer4 != null) {
      allPlayersFrames.add(framePlayer4);
    }
    
    if(framePlayer5 != null) {
      allPlayersFrames.add(framePlayer5);
    }
    
    if(framePlayer6 != null) {
      allPlayersFrames.add(framePlayer6);
    }
    
    if(framePlayer7 != null) {
      allPlayersFrames.add(framePlayer7);
    }
    
    if(framePlayer8 != null) {
      allPlayersFrames.add(framePlayer8);
    }
    
    if(framePlayer9 != null) {
      allPlayersFrames.add(framePlayer9);
    }
    
    if(framePlayer10 != null) {
      allPlayersFrames.add(framePlayer10);
    }
    
    return allPlayersFrames;
  }
  
  public TimelineParticipantFrame getFramePlayer1() {
    return framePlayer1;
  }
  
  public TimelineParticipantFrame getFramePlayer2() {
    return framePlayer2;
  }
  
  public TimelineParticipantFrame getFramePlayer3() {
    return framePlayer3;
  }
  
  public TimelineParticipantFrame getFramePlayer4() {
    return framePlayer4;
  }
  
  public TimelineParticipantFrame getFramePlayer5() {
    return framePlayer5;
  }
  
  public TimelineParticipantFrame getFramePlayer6() {
    return framePlayer6;
  }
  
  public TimelineParticipantFrame getFramePlayer7() {
    return framePlayer7;
  }
  
  public TimelineParticipantFrame getFramePlayer8() {
    return framePlayer8;
  }
  
  public TimelineParticipantFrame getFramePlayer9() {
    return framePlayer9;
  }
  
  public TimelineParticipantFrame getFramePlayer10() {
    return framePlayer10;
  }
  
}
