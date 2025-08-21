package com.JSC.dsList.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JSC.dsList.DTO.GameDTO;
import com.JSC.dsList.entities.Game;
import com.JSC.dsList.repositories.GameRepositories;

@Service
public class GameService {
	
	@Autowired
	private GameRepositories gameRepositories;

	public List <GameDTO>findAll(){
		
		List<Game> result = gameRepositories.findAll();
		List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).toList();
		return  dto;
		
		
	}
}
