package com.JSC.dsList.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JSC.dsList.DTO.GameDTO;
import com.JSC.dsList.Service.GameService;
import com.JSC.dsList.entities.Game;

@RestController
@RequestMapping(value = "/game")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameDTO> findAll(){
		
		List<GameDTO> result = gameService.findAll();
		return result;
	}

}
