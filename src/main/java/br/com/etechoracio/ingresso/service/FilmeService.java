package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.repository.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {
    private FilmeRepository filmeRepository;
    public List<FilmeResponseDTO> findAll() {
        var filmes = filmeRepository.findAll();
        return null;
    }
}
