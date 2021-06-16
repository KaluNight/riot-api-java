package net.rithms.test.sync;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.match.v5.dto.MatchV5;
import net.rithms.riot.api.endpoints.match.v5.dto.MatchV5Timeline;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;
import net.rithms.test.RiotApiTest;

public class MatchTest {

  private static RiotApi api = null;

  @BeforeClass
  public static void prepareApi() {
    api = RiotApiTest.getRiotApi();
  }
  
  @Test
  public void testGetMatchListIdsWithBaseSettings() throws RiotApiException {
    Summoner summoner = api.getSummonerByName(Platform.EUW, "KaluNight");
    
    List<String> matchsIdsList = api.getMatchListByPuuid(Platform.EUW, summoner.getPuuid(), 0, 5);
    
    assertNotNull(summoner);
    assertNotNull(matchsIdsList);
    assertEquals(5, matchsIdsList.size());
  }
  
  @Test
  public void testGetMatchListIdsWithoutBaseSettings() throws RiotApiException {
    Summoner summoner = api.getSummonerByName(Platform.EUW, "KaluNight");
    
    List<String> matchsIdsList = api.getMatchListByPuuid(Platform.EUW, summoner.getPuuid(), null, null);
    
    assertNotNull(summoner);
    assertNotNull(matchsIdsList);
    assertEquals(20, matchsIdsList.size());
  }
  
  @Test
  public void testGetMatchListIdsWhenStartIndexChange() throws RiotApiException {
    Summoner summoner = api.getSummonerByName(Platform.EUW, "KaluNight");

    assertNotNull(summoner);
    
    List<String> matchsIdsList = api.getMatchListByPuuid(Platform.EUW, summoner.getPuuid(), 0, 1);
    
    assertNotNull(matchsIdsList);
    assertEquals(1, matchsIdsList.size());
    
    List<String> matchsIdsList2 = api.getMatchListByPuuid(Platform.EUW, summoner.getPuuid(), 1, 1);
    
    assertNotNull(matchsIdsList2);
    assertEquals(1, matchsIdsList2.size());
    
    assertNotEquals(matchsIdsList.get(0), matchsIdsList2.get(0));
  }
  
  @Test
  public void testGetMatchV5() throws RiotApiException {
    
    MatchV5 match = api.getMatchV5(Platform.EUW, "EUW1_5320147518");
    
    assertNotNull(match);
  }
  
  @Test
  public void testGetMatchV5Timeline() throws RiotApiException {
    
    MatchV5Timeline timeline = api.getTimelineV5ByMatchId(Platform.EUW, "EUW1_5320147518");
    
    assertNotNull(timeline);
  }
}
