package com.devjoseronaldo.dslist.repositories;

import com.devjoseronaldo.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{
}
