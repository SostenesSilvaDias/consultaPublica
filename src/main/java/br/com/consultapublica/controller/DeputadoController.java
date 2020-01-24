package br.com.consultapublica.controller;

import br.com.consultapublica.controller.dto.DeputadoDto;
import br.com.consultapublica.service.DeputadoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.hateoas.MediaTypes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/deputados")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DeputadoController {

    private final @NonNull DeputadoService deputadoService;

    @GetMapping(produces = MediaTypes.HAL_FORMS_JSON_VALUE)
    public List<DeputadoDto> consultarDeputados() throws JsonProcessingException {
        return DeputadoDto.convert(deputadoService.consultarDeputados());
    }
}
