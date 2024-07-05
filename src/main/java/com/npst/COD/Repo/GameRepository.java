package com.npst.COD.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npst.COD.Entity.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
	
}
