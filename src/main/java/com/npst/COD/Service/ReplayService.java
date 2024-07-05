package com.npst.COD.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npst.COD.Repo.ReplayRepository;

@Service
public class ReplayService {
	
    private final ReplayRepository replayRepository;

    @Autowired
    public ReplayService(ReplayRepository replayRepository) {
        this.replayRepository = replayRepository;
    }

    // Add methods for managing replays
}
