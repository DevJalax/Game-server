package com.npst.COD.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npst.COD.Entity.PlayerLocation;
import com.npst.COD.Repo.PlayerLocationRepository;

@Service
public class PlayerLocationService {
	
    private final PlayerLocationRepository playerLocationRepository;

    @Autowired
    public PlayerLocationService(PlayerLocationRepository playerLocationRepository) {
        this.playerLocationRepository = playerLocationRepository;
    }

    public void savePlayerLocation(String playerId, double latitude, double longitude) {
        PlayerLocation playerLocation = new PlayerLocation();
        playerLocation.setPlayerId(playerId);
        playerLocation.setLatitude(latitude);
        playerLocation.setLongitude(longitude);
        playerLocation.setTimestamp(LocalDateTime.now());
        playerLocationRepository.save(playerLocation);
    }

    public List<PlayerLocation> getPlayerLocations(String playerId) {
        return playerLocationRepository.findByPlayerId(playerId);
    }
}
