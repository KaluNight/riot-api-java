package net.rithms.test.sync;

import org.junit.BeforeClass;
import org.junit.Test;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.request.ratelimit.RateLimitException;
import net.rithms.riot.constant.Platform;
import net.rithms.test.RiotApiTest;

import static org.junit.Assert.*;

public class RateLimitTest {

  private static RiotApi api = null;

  @BeforeClass
  public static void prepareApi() {
    api = RiotApiTest.getRiotApi();
  }

  @Test
  public void testGetTFTMatch() throws RiotApiException {

    try {
      for(int i = 0; i < 121; i++) {
        api.getSummonerByName(Platform.EUW, "KaluNight");
      }
    }catch(RateLimitException e) {
      RiotApi.log.fine("Expected Error");
    }
    
    try {
      for(int i = 0; i < 10; i++) {
        api.getTFTSummonerByName(Platform.EUW, "KaluNight");
      }
    }catch(RateLimitException e) {
      RiotApi.log.warning("This key can still be fired but a rate limit error has been throw!");
      fail();
    }
    //Test OK
  }
}
