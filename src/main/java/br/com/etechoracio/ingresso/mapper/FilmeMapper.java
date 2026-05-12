package br.com.etechoracio.ingresso.mapper;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FilmeMapper {

    List<FilmeResponseDTO> toResponseDTOList(List<Filme> entities);
}
