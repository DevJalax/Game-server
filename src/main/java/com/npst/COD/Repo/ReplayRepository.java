package com.npst.COD.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npst.COD.Entity.Replay;

@Repository
public interface ReplayRepository extends JpaRepository<Replay, Long> {
	
}
