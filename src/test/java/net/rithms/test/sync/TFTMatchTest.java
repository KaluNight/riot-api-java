package net.rithms.test.sync;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.tft_match.dto.TFTMatch;
import net.rithms.riot.api.endpoints.tft_summoner.dto.TFTSummoner;
import net.rithms.riot.constant.Platform;
import net.rithms.test.RiotApiTest;

/**
 * Tests synchronous calls to the TFT summoner endpoint
 */
public class TFTMatchTest {

  private static RiotApi api = null;

  @BeforeClass
  public static void prepareApi() {
    api = RiotApiTest.getRiotApi();
  }

  @Test
  public void testGetTFTMatchList() throws RiotApiException {
    TFTSummoner tftSummonerByName = api.getTFTSummonerByName(Platform.EUW, "KaluNight");
    List<String> matchList = api.getTFTMatchList(Platform.EUW, tftSummonerByName.getPuuid(), null);
    List<String> matchListOnlyOneElement = api.getTFTMatchList(Platform.EUW, tftSummonerByName.getPuuid(), 1);
    assertNotNull(tftSummonerByName);
    assertNotNull(matchList);
    assertNotNull(matchListOnlyOneElement);
    assertEquals(1, matchListOnlyOneElement.size());
  }
  
  @Test
  public void testGetTFTMatch() throws RiotApiException {
    TFTSummoner tftSummonerByName = api.getTFTSummonerByName(Platform.EUW, "KaluNight");
    List<String> matchList = api.getTFTMatchList(Platform.EUW, tftSummonerByName.getPuuid(), null);
    
    TFTMatch tftMatch = api.getTFTMatch(Platform.EUW, matchList.get(0));
    assertNotNull(tftMatch);
  }
  
  
}
