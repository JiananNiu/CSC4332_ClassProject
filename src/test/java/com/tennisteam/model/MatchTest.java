package com.tennisteam.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MatchTest {

  @Test
  public void TeamMatchTest() {
    LocalDate date = LocalDate.of(2025, 3, 1);
    Match match = new Match(date, "LSU", "Florida", "John Smith", "Bob Lee",
            "6-4 3-6 7-5", "4-6 6-3 5-7");

    assertEquals(date, match.getDate());
    assertEquals("LSU", match.getTeamA());
    assertEquals("Florida", match.getTeamB());
    assertEquals("John Smith", match.getPlayerA());
    assertEquals("Bob Lee", match.getPlayerB());
    assertEquals("6-4 3-6 7-5", match.getScoreA());
    assertEquals("4-6 6-3 5-7", match.getScoreB());
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/matches.csv", numLinesToSkip = 1)
  public void testMatchFromCSV(LocalDate date, String teamA, String teamB, String playerA, String playerB, String scoreA, String scoreB) {
    Match match = new Match(date, teamA, teamB, playerA, playerB, scoreA, scoreB);

    assertEquals(date, match.getDate());
    assertEquals(teamA, match.getTeamA());
    assertEquals(teamB, match.getTeamB());
    assertEquals(playerA, match.getPlayerA());
    assertEquals(playerB, match.getPlayerB());
    assertEquals(scoreA, match.getScoreA());
    assertEquals(scoreB, match.getScoreB());
  }

}
