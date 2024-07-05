package com.npst.COD.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npst.COD.Service.ReplayService;

@RestController
@RequestMapping("/replays")
public class ReplayController {
	
    private final ReplayService replayService;

    @Autowired
    public ReplayController(ReplayService replayService) {
        this.replayService = replayService;
    }

    // Add REST endpoints for managing replays
}
