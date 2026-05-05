package br.com.etechoracio.ingresso.dto;

import br.com.etechoracio.ingresso.enums.CategoriaFilmeEnum;
import br.com.etechoracio.ingresso.enums.ClassificacaoIndicativaEnum;
import br.com.etechoracio.ingresso.enums.SImNaoEnum;

public record FilmeResponseDTO(
        Long id,
        String nome,
        Integer duracao,
        Integer ano,
        String capa,
        CategoriaFilmeEnum categoria,
        ClassificacaoIndicativaEnum classificacao,
        SImNaoEnum emCartaz,
        String diretor,
        String elenco,
        String descricao,
        Double avaliacao

) { }
