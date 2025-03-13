package com.mthree.GTN.dao;

import com.mthree.GTN.model.Game;
import com.mthree.GTN.model.Round;

import java.util.List;

public interface GameDao {
    Game startGame();
    Round makeGuess(String myGuess);
    List<Game> listAllGames();
    Game getGameById(int id);
    List<Round> getRoundsById(int id);
}
