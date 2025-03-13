package com.mthree.GTN.dao;

import com.mthree.GTN.model.Game;
import com.mthree.GTN.model.Round;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GameDaoImpl implements GameDao {

    @Autowired
    JdbcTemplate jdbc;


    @Override
    public Game startGame() {
        //TODO: generate random 4 digit number = String
        //Create a list ["0", "1"]
        // insert answer to DB

        return null;
    }

    @Override
    public Round makeGuess(String myGuess) {
        return null;
    }

    @Override
    public List<Game> listAllGames() {
        return List.of();
    }

    @Override
    public Game getGameById(int id) {
        return null;
    }

    @Override
    public List<Round> getRoundsById(int id) {
        return List.of();
    }
}
