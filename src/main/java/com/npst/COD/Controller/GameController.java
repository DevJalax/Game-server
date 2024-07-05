package com.npst.COD.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npst.COD.Service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
	
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    // Add REST endpoints for managing games
}
