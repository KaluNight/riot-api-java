package net.rithms.test.sync;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.clash.constant.TeamPosition;
import net.rithms.riot.api.endpoints.clash.constant.TeamRole;
import net.rithms.riot.api.endpoints.clash.dto.ClashTeam;
import net.rithms.riot.api.endpoints.clash.dto.ClashTeamMember;
import net.rithms.riot.api.endpoints.clash.dto.ClashTournament;
import net.rithms.riot.api.endpoints.clash.dto.ClashTournamentPhase;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;
import net.rithms.test.RiotApiTest;

public class ClashTest {

  private static RiotApi api = null;

  @BeforeClass
  public static void prepareApi() {
    api = RiotApiTest.getRiotApi();
  }
  
  @Test
  public void testGetClashPlayerRegistration() throws RiotApiException {
    Summoner summoner = api.getSummonerByName(Platform.EUW, "KaluNight");
    
    List<ClashTeamMember> playerTeamRegistration = api.getClashPlayersBySummoner(Platform.EUW, summoner.getId());
    
    assertNotNull(playerTeamRegistration);
    assertNotNull(summoner);
  }
  
  @Test
  public void testGetClashTeamByTeamId() throws RiotApiException {
    Summoner summoner = api.getSummonerByName(Platform.EUW, "KaluNight");
    
    List<ClashTeamMember> playerTeamRegistration = api.getClashPlayersBySummoner(Platform.EUW, summoner.getId());
    
    if(!playerTeamRegistration.isEmpty()) {
      TeamPosition position = playerTeamRegistration.get(0).getTeamPosition();
      TeamRole role = playerTeamRegistration.get(0).getTeamRole();
      
      ClashTeam clashTeam = api.getClashTeamByTeamId(Platform.EUW, playerTeamRegistration.get(0).getTeamId());
      ClashTeamMember captain = clashTeam.getCaptain();
      
      assertNotNull(position);
      assertNotNull(role);
      assertNotNull(clashTeam);
      assertNotNull(captain);
      assertNotNull(clashTeam);
    }
    
    assertNotNull(playerTeamRegistration);
    assertNotNull(summoner);
  }
  
  @Test
  public void testGetClashTournamentByTeamId() throws RiotApiException {
    Summoner summoner = api.getSummonerByName(Platform.EUW, "KaluNight");
    
    List<ClashTeamMember> playerTeamRegistration = api.getClashPlayersBySummoner(Platform.EUW, summoner.getId());
    
    if(!playerTeamRegistration.isEmpty()) {
      ClashTournament tournament = api.getClashTournamentByTeam(Platform.EUW, playerTeamRegistration.get(0).getTeamId());
      List<ClashTournamentPhase> schedule = tournament.getSchedule();
      if(!schedule.isEmpty()) {
        ClashTournamentPhase phase = schedule.get(0);
        ZonedDateTime registrationStart = phase.getRegistrationTime();
        RiotApi.log.finest("Check if registration time is the same in client : " + 
            registrationStart.withZoneSameInstant(ZoneId.of("Europe/Zurich")).toString());
        
        ZonedDateTime tournamentStart = phase.getStartTime();
        RiotApi.log.finest("Check if start time is the same in client : " + 
            tournamentStart.withZoneSameInstant(ZoneId.of("Europe/Zurich")).toString());
      }
      
      
      assertNotNull(schedule);
      assertEquals(false, schedule.isEmpty());
      assertNotNull(tournament.getNameKey());
      assertNotNull(tournament.getNameKeySecondary());
    }
    
    assertNotNull(playerTeamRegistration);
    assertNotNull(summoner);
  }
  
  @Test
  public void testGetClashTournamentByTournament() throws RiotApiException {
    Summoner summoner = api.getSummonerByName(Platform.EUW, "KaluNight");
    
    List<ClashTeamMember> playerTeamRegistration = api.getClashPlayersBySummoner(Platform.EUW, summoner.getId());
    
    if(!playerTeamRegistration.isEmpty()) {
      ClashTeam team = api.getClashTeamByTeamId(Platform.EUW, playerTeamRegistration.get(0).getTeamId());
      ClashTournament tournament = api.getClashTournamentByTournament(Platform.EUW, team.getTournamentId());
      List<ClashTournamentPhase> schedule = tournament.getSchedule();
      if(!schedule.isEmpty()) {
        ClashTournamentPhase phase = schedule.get(0);
        ZonedDateTime registrationStart = phase.getRegistrationTime();
        RiotApi.log.finest("Check if registration time is the same in client : " + 
            registrationStart.withZoneSameInstant(ZoneId.of("Europe/Zurich")).toString());
        
        ZonedDateTime tournamentStart = phase.getStartTime();
        RiotApi.log.finest("Check if start time is the same in client : " + 
            tournamentStart.withZoneSameInstant(ZoneId.of("Europe/Zurich")).toString());
      }
      
      assertNotNull(schedule);
      assertEquals(false, schedule.isEmpty());
      assertNotNull(tournament.getNameKey());
      assertNotNull(tournament.getNameKeySecondary());
    }
  }
  
  @Test
  public void testGetClashTournaments() throws RiotApiException {
    List<ClashTournament> clashTournaments = api.getClashTournaments(Platform.EUW);
    
    RiotApi.log.finest("List of upcoming and active tournaments :");
    
    for(ClashTournament tournament : clashTournaments) {
      RiotApi.log.finest("\nTournament Name : " + tournament.getNameKey()
      + " Secondary Name : " + tournament.getNameKeySecondary() + " Theme Id : " + tournament.getThemeId());
      
      RiotApi.log.finest("Number of phase : " + tournament.getSchedule().size());
      
      for(ClashTournamentPhase phase : tournament.getSchedule()) {
        RiotApi.log.finest("Phase registration : " 
      + phase.getRegistrationTime().withZoneSameInstant(ZoneId.of("Europe/Zurich")).toString());
        RiotApi.log.finest("Phase start : " 
      + phase.getStartTime().withZoneSameInstant(ZoneId.of("Europe/Zurich")).toString());
      }
    }
    
    assertNotNull(clashTournaments);
  }
}
