package com.npst.COD.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npst.COD.Entity.PlayerLocation;

@Repository
public interface PlayerLocationRepository extends JpaRepository<PlayerLocation, Long> {
	
    List<PlayerLocation> findByPlayerId(String playerId);

}
