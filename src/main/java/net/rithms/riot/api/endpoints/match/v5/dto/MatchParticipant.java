package net.rithms.riot.api.endpoints.match.v5.dto;

import java.io.Serializable;

import net.rithms.riot.api.Dto;

public class MatchParticipant extends Dto implements Serializable {

  private static final long serialVersionUID = -7138513896985411728L;
  
  private int assists;
  private int baronKills;
  private int bountyLevel;
  private int champExperience;
  private int champLevel;
  private int championId;
  private String championName;
  private int championTransform;
  private int consumablesPurchased;
  private int damageDealtToBuildings;
  private int damageDealtToObjectives;
  private int damageDealtToTurrets;
  private int damageSelfMitigated;
  private int deaths;
  private int detectorWardsPlaced;
  private int doubleKills;
  private int dragonKills;
  private boolean firstBloodAssist;
  private boolean firstBloodKill;
  private boolean firstTowerAssist;
  private boolean firstTowerKill;
  private boolean gameEndedInEarlySurrender;
  private boolean gameEndedInSurrender;
  private int goldEarned;
  private int goldSpent;
  private String individualPosition;
  private int inhibitorKills;
  private int inhibitorsLost;
  private int item0;
  private int item1;
  private int item2;
  private int item3;
  private int item4;
  private int item5;
  private int item6;
  private int itemsPurchased;
  private int killingSprees;
  private int kills;
  private String lane;
  private int largestCriticalStrike;
  private int largestKillingSpree;
  private int largestMultiKill;
  private int longestTimeSpentLiving;
  private int magicDamageDealt;
  private int magicDamageDealtToChampions;
  private int magicDamageTaken;
  private int neutralMinionsKilled;
  private int nexusKills;
  private int nexusLost;
  private int objectivesStolen;
  private int objectivesStolenAssists;
  private int participantId;
  private int pentaKills;
  private RunePerkz perks;
  private int physicalDamageDealt;
  private int physicalDamageDealtToChampions;
  private int physicalDamageTaken;
  private int profileIcon;
  private String puuid;
  private int quadraKills;
  private String riotIdName;
  private String riotIdTagline;
  private String role;
  private int sightWardsBoughtInGame;
  private int spell1Casts;
  private int spell2Casts;
  private int spell3Casts;
  private int spell4Casts;
  private int summoner1Casts;
  private int summoner1Id;
  private int summoner2Casts;
  private int summoner2Id;
  private String summonerId;
  private int summonerLevel;
  private String summonerName;
  private boolean teamEarlySurrendered;
  private int teamId;
  private String teamPosition;
  private int timeCCingOthers;
  private int timePlayed;
  private int totalDamageDealt;
  private int totalDamageDealtToChampions;
  private int totalDamageShieldedOnTeammates;
  private int totalDamageTaken;
  private int totalHeal;
  private int totalHealsOnTeammates;
  private int totalMinionsKilled;
  private int totalTimeCCDealt;
  private int totalTimeSpentDead;
  private int totalUnitsHealed;
  private int tripleKills;
  private int trueDamageDealt;
  private int trueDamageDealtToChampions;
  private int trueDamageTaken;
  private int turretKills;
  private int turretsLost;
  private int unrealKills;
  private int visionScore;
  private int visionWardsBoughtInGame;
  private int wardsKilled;
  private int wardsPlaced;
  private boolean win;
  
  
  public int getAssists() {
    return assists;
  }
  
  public int getBaronKills() {
    return baronKills;
  }
  
  public int getBountyLevel() {
    return bountyLevel;
  }
  
  public int getChampExperience() {
    return champExperience;
  }
  
  public int getChampLevel() {
    return champLevel;
  }
  
  public int getChampionId() {
    return championId;
  }
  
  public String getChampionName() {
    return championName;
  }
  
  public int getChampionTransform() {
    return championTransform;
  }
  
  public int getConsumablesPurchased() {
    return consumablesPurchased;
  }
  
  public int getDamageDealtToBuildings() {
    return damageDealtToBuildings;
  }
  
  public int getDamageDealtToObjectives() {
    return damageDealtToObjectives;
  }
  
  public int getDamageDealtToTurrets() {
    return damageDealtToTurrets;
  }
  
  public int getDamageSelfMitigated() {
    return damageSelfMitigated;
  }
  
  public int getDeaths() {
    return deaths;
  }
  
  public int getDetectorWardsPlaced() {
    return detectorWardsPlaced;
  }
  
  public int getDoubleKills() {
    return doubleKills;
  }
  
  public int getDragonKills() {
    return dragonKills;
  }
  
  public boolean isFirstBloodAssist() {
    return firstBloodAssist;
  }
  
  public boolean isFirstBloodKill() {
    return firstBloodKill;
  }
  
  public boolean isFirstTowerAssist() {
    return firstTowerAssist;
  }
  
  public boolean isFirstTowerKill() {
    return firstTowerKill;
  }
  
  public boolean isGameEndedInEarlySurrender() {
    return gameEndedInEarlySurrender;
  }
  
  public boolean isGameEndedInSurrender() {
    return gameEndedInSurrender;
  }
  
  public int getGoldEarned() {
    return goldEarned;
  }
  
  public int getGoldSpent() {
    return goldSpent;
  }
  
  public String getIndividualPosition() {
    return individualPosition;
  }
  
  public int getInhibitorKills() {
    return inhibitorKills;
  }
  
  public int getInhibitorsLost() {
    return inhibitorsLost;
  }
  
  public int getItem0() {
    return item0;
  }
  
  public int getItem1() {
    return item1;
  }
  
  public int getItem2() {
    return item2;
  }
  
  public int getItem3() {
    return item3;
  }
  
  public int getItem4() {
    return item4;
  }
  
  public int getItem5() {
    return item5;
  }
  
  public int getItem6() {
    return item6;
  }
  
  public int getItemsPurchased() {
    return itemsPurchased;
  }
  
  public int getKillingSprees() {
    return killingSprees;
  }
  
  public int getKills() {
    return kills;
  }
  
  public String getLane() {
    return lane;
  }
  
  public int getLargestCriticalStrike() {
    return largestCriticalStrike;
  }
  
  public int getLargestKillingSpree() {
    return largestKillingSpree;
  }
  
  public int getLargestMultiKill() {
    return largestMultiKill;
  }
  
  public int getLongestTimeSpentLiving() {
    return longestTimeSpentLiving;
  }
  
  public int getMagicDamageDealt() {
    return magicDamageDealt;
  }
  
  public int getMagicDamageDealtToChampions() {
    return magicDamageDealtToChampions;
  }
  
  public int getMagicDamageTaken() {
    return magicDamageTaken;
  }
  
  public int getNeutralMinionsKilled() {
    return neutralMinionsKilled;
  }
  
  public int getNexusKills() {
    return nexusKills;
  }
  
  public int getNexusLost() {
    return nexusLost;
  }
  
  public int getObjectivesStolen() {
    return objectivesStolen;
  }
  
  public int getObjectivesStolenAssists() {
    return objectivesStolenAssists;
  }
  
  public int getParticipantId() {
    return participantId;
  }
  
  public int getPentaKills() {
    return pentaKills;
  }
  
  public RunePerkz getPerks() {
    return perks;
  }
  
  public int getPhysicalDamageDealt() {
    return physicalDamageDealt;
  }
  
  public int getPhysicalDamageDealtToChampions() {
    return physicalDamageDealtToChampions;
  }
  
  public int getPhysicalDamageTaken() {
    return physicalDamageTaken;
  }
  
  public int getProfileIcon() {
    return profileIcon;
  }
  
  public String getPuuid() {
    return puuid;
  }
  
  public int getQuadraKills() {
    return quadraKills;
  }
  
  public String getRiotIdName() {
    return riotIdName;
  }
  
  public String getRiotIdTagline() {
    return riotIdTagline;
  }
  
  public String getRole() {
    return role;
  }
  
  public int getSightWardsBoughtInGame() {
    return sightWardsBoughtInGame;
  }
  
  public int getSpell1Casts() {
    return spell1Casts;
  }
  
  public int getSpell2Casts() {
    return spell2Casts;
  }
  
  public int getSpell3Casts() {
    return spell3Casts;
  }
  
  public int getSpell4Casts() {
    return spell4Casts;
  }
  
  public int getSummoner1Casts() {
    return summoner1Casts;
  }
  
  public int getSummoner1Id() {
    return summoner1Id;
  }
  
  public int getSummoner2Casts() {
    return summoner2Casts;
  }
  
  public int getSummoner2Id() {
    return summoner2Id;
  }
  
  public String getSummonerId() {
    return summonerId;
  }
  
  public int getSummonerLevel() {
    return summonerLevel;
  }
  
  public String getSummonerName() {
    return summonerName;
  }
  
  public boolean isTeamEarlySurrendered() {
    return teamEarlySurrendered;
  }
  
  public int getTeamId() {
    return teamId;
  }
  
  public String getTeamPosition() {
    return teamPosition;
  }
  
  public int getTimeCCingOthers() {
    return timeCCingOthers;
  }
  
  public int getTimePlayed() {
    return timePlayed;
  }
  
  public int getTotalDamageDealt() {
    return totalDamageDealt;
  }
  
  public int getTotalDamageDealtToChampions() {
    return totalDamageDealtToChampions;
  }
  
  public int getTotalDamageShieldedOnTeammates() {
    return totalDamageShieldedOnTeammates;
  }
  
  public int getTotalDamageTaken() {
    return totalDamageTaken;
  }
  
  public int getTotalHeal() {
    return totalHeal;
  }
  
  public int getTotalHealsOnTeammates() {
    return totalHealsOnTeammates;
  }
  
  public int getTotalMinionsKilled() {
    return totalMinionsKilled;
  }
  
  public int getTotalTimeCCDealt() {
    return totalTimeCCDealt;
  }
  
  public int getTotalTimeSpentDead() {
    return totalTimeSpentDead;
  }
  
  public int getTotalUnitsHealed() {
    return totalUnitsHealed;
  }
  
  public int getTripleKills() {
    return tripleKills;
  }
  
  public int getTrueDamageDealt() {
    return trueDamageDealt;
  }
  
  public int getTrueDamageDealtToChampions() {
    return trueDamageDealtToChampions;
  }
  
  public int getTrueDamageTaken() {
    return trueDamageTaken;
  }
  
  public int getTurretKills() {
    return turretKills;
  }
  
  public int getTurretsLost() {
    return turretsLost;
  }
  
  public int getUnrealKills() {
    return unrealKills;
  }
  
  public int getVisionScore() {
    return visionScore;
  }
  
  public int getVisionWardsBoughtInGame() {
    return visionWardsBoughtInGame;
  }
  
  public int getWardsKilled() {
    return wardsKilled;
  }
  
  public int getWardsPlaced() {
    return wardsPlaced;
  }
  
  public boolean isWin() {
    return win;
  }
  
}
