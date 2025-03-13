package com.mthree.GTN.controller;

import com.mthree.GTN.dao.GameDao;
import com.mthree.GTN.model.Game;
import com.mthree.GTN.model.Round;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gtn")
@CrossOrigin
public class GameController {

    @Autowired
    GameDao dao;

    @PostMapping("/start")
    public void startGame() {

    }

    @PostMapping("/guess/{myGuess}")
    public Round makeGuess(@PathVariable String myGuess){

        return null;
    }

    @GetMapping("/games")
    public List<Game> listGames(){

        return null;
    }

    @GetMapping("/game/{id}")
    public Game getGameById(@PathVariable int id){

        return null;
    }

    @GetMapping("/rounds/{gameId}")
    public List<Round> getRoundsById(@PathVariable int gameId) {

        return null;
    }
}
