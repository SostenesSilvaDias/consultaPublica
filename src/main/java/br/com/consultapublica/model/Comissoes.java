package br.com.consultapublica.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Comissoes extends RepresentationModel {

    @JsonProperty("titular")
    private List<Comissao> titular;
    @JsonProperty("suplente")
    private  List<Comissao> suplente;

    public Comissoes(){}
}
