package net.rithms.test.sync;

import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.tft_summoner.dto.TFTSummoner;
import net.rithms.riot.constant.Platform;
import net.rithms.test.RiotApiTest;

/**
 * Tests synchronous calls to the TFT summoner endpoint
 */
public class TFTSummonerTest {

  private static RiotApi api = null;

  @BeforeClass
  public static void prepareApi() {
    api = RiotApiTest.getRiotApi();
  }

  @Test
  public void testGetTFTSummoner() throws RiotApiException {
    TFTSummoner tftSummonerByName = api.getTFTSummonerByName(Platform.EUW, "KaluNight");
    TFTSummoner tftSummonerById = api.getTFTSummoner(Platform.EUW, tftSummonerByName.getId());
    assertNotNull(tftSummonerByName);
    assertNotNull(tftSummonerById);
  }
  
  @Test
  public void testGetTFTSummonerByPuuid() throws RiotApiException {
    TFTSummoner tftSummonerByName = api.getTFTSummonerByName(Platform.EUW, "KaluNight");
    TFTSummoner tftSummonerByPuuid = api.getTFTSummonerByPuuid(Platform.EUW, tftSummonerByName.getPuuid());
    assertNotNull(tftSummonerByName);
    assertNotNull(tftSummonerByPuuid);
  }

  @Test
  public void testGetTFTSummonerByAccount() throws RiotApiException {
    TFTSummoner tftSummonerByName = api.getTFTSummonerByName(Platform.EUW, "KaluNight");
    TFTSummoner tftSummonerByAccount = api.getTFTSummonerByAccount(Platform.EUW, tftSummonerByName.getAccountId());
    assertNotNull(tftSummonerByName);
    assertNotNull(tftSummonerByAccount);
  }

  @Test
  public void testGetSummonerByName() throws RiotApiException {
    TFTSummoner tftSummonerByName = api.getTFTSummonerByName(Platform.EUW, "KaluNight");
    assertNotNull(tftSummonerByName);
  }
  
}
