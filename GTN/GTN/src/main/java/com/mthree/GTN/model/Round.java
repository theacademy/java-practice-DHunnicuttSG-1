package com.mthree.GTN.model;

import java.time.LocalDateTime;

public class Round {
    int roundId;
    int gameId;
    String guess;
    String guessResults;
    LocalDateTime myTimeStamp;

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getGuessResults() {
        return guessResults;
    }

    public void setGuessResults(String guessResults) {
        this.guessResults = guessResults;
    }

    public LocalDateTime getMyTimeStamp() {
        return myTimeStamp;
    }

    public void setMyTimeStamp(LocalDateTime myTimeStamp) {
        this.myTimeStamp = myTimeStamp;
    }
}
