package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.repository.FilmeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    private FilmeRepository filmeRepository;

    
    @GetMapping
    public List<Filme> findAll() {
        return filmeRepository.findAll();
    }
}
