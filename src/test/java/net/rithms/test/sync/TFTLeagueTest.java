package net.rithms.test.sync;

import static org.junit.Assert.assertNotNull;
import java.util.Set;
import org.junit.BeforeClass;
import org.junit.Test;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.tft_league.dto.TFTLeagueEntry;
import net.rithms.riot.api.endpoints.tft_league.dto.TFTLeagueList;
import net.rithms.riot.api.endpoints.tft_summoner.dto.TFTSummoner;
import net.rithms.riot.constant.Platform;
import net.rithms.test.RiotApiTest;

/**
 * Tests synchronous calls to the TFT league endpoint
 */
public class TFTLeagueTest {

  private static RiotApi api = null;

  @BeforeClass
  public static void prepareApi() {
    api = RiotApiTest.getRiotApi();
  }

  @Test
  public void testGetTFTLeagueEntryBySummoner() throws RiotApiException {
    TFTSummoner tftSummonerByName = api.getTFTSummonerByName(Platform.EUW, "rastalol");
    Set<TFTLeagueEntry> leagueEntry = api.getTFTLeagueEntryBySummoner(Platform.EUW, tftSummonerByName.getId());
    
    assertNotNull(leagueEntry);
  }
  
  @Test
  public void testGetTFTLeagueEntries() throws RiotApiException {
    Set<TFTLeagueEntry> leagueEntryWithNull = api.getTFTLeagueEntries(Platform.EUW, "DIAMOND", "I", null);
    Set<TFTLeagueEntry> leagueEntryWith1 = api.getTFTLeagueEntries(Platform.EUW, "DIAMOND", "I", 1);
    Set<TFTLeagueEntry> leagueEntryWith2 = api.getTFTLeagueEntries(Platform.EUW, "DIAMOND", "I", 2);
    
    assertNotNull(leagueEntryWithNull);
    assertNotNull(leagueEntryWith1);
    assertNotNull(leagueEntryWith2);
  }
  
  @Test
  public void testGetTFTLeagueById() throws RiotApiException {
    TFTSummoner tftSummonerByName = api.getTFTSummonerByName(Platform.EUW, "rastalol");
    Set<TFTLeagueEntry> leagueEntry = api.getTFTLeagueEntryBySummoner(Platform.EUW, tftSummonerByName.getId());
    
    TFTLeagueList leagueList = api.getTFTLeagueById(Platform.EUW, leagueEntry.iterator().next().getLeagueId());
    assertNotNull(leagueList);
  }
  
  @Test
  public void testGetTFTChallengerLeague() throws RiotApiException {
    TFTLeagueList leagueList = api.getChallengerTFTLeague(Platform.EUW);
    assertNotNull(leagueList);
  }
  
  @Test
  public void testGetTFTGrandMasterLeague() throws RiotApiException {
    TFTLeagueList leagueList = api.getGrandmasterTFTLeague(Platform.EUW);
    assertNotNull(leagueList);
  }
  
  @Test
  public void testGetTFTMasterLeague() throws RiotApiException {
    TFTLeagueList leagueList = api.getMasterTFTLeague(Platform.EUW);
    assertNotNull(leagueList);
  }
  
}
