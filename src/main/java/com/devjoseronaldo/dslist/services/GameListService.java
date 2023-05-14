package com.devjoseronaldo.dslist.services;

import com.devjoseronaldo.dslist.dto.GameListDTO;
import com.devjoseronaldo.dslist.entities.GameList;
import com.devjoseronaldo.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gamelistRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {

        List<GameList> result = gamelistRepository.findAll();

        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}
