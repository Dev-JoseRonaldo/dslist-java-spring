package com.devjoseronaldo.dslist.services;

import com.devjoseronaldo.dslist.dto.GameDTO;
import com.devjoseronaldo.dslist.dto.GameMinDTO;
import com.devjoseronaldo.dslist.entities.Game;
import com.devjoseronaldo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        //busca todos os games
        List<Game> result = gameRepository.findAll();

        //converte os games para o tipo GameMinDTO
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        //todo: tratamento caso venha um id que não exista
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
}
