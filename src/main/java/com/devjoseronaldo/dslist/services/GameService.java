package com.devjoseronaldo.dslist.services;

import com.devjoseronaldo.dslist.dto.GameMinDTO;
import com.devjoseronaldo.dslist.entities.Game;
import com.devjoseronaldo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        //busca todos os games
        List<Game> result = gameRepository.findAll();

        //converte os games para o tipo GameMinDTO
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
