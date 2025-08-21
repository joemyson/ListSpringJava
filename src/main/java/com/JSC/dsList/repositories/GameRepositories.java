package com.JSC.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JSC.dsList.entities.Game;

public interface GameRepositories extends JpaRepository<Game, Long> {

}
