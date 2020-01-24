package br.com.consultapublica.controller.dto;

import br.com.consultapublica.model.Comissoes;
import br.com.consultapublica.model.Deputado;
import lombok.*;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DeputadoDto {

    private int ideCadastro;
    private String condicao;
    private String nome;
    private String nomeParlamentar;
    private String urlFoto;
    private String sexo;
    private String UF;
    private String partido;
    private String gabinete;
    private String anexo;
    private String fone;
    private String email;
    private Comissoes comissoes;
    private Link link;

    private DeputadoDto(Deputado deputado) {
        this.ideCadastro = deputado.getIdeCadastro();
        this.condicao = deputado.getCondicao();
        this.nome = deputado.getNome();
        this.nomeParlamentar = deputado.getNomeParlamentar();
        this.urlFoto = deputado.getUrlFoto();
        this.sexo = deputado.getSexo();
        this.UF = deputado.getUF();
        this.partido = deputado.getPartido();
        this.gabinete = deputado.getGabinete();
        this.anexo = deputado.getAnexo();
        this.fone = deputado.getFone();
        this.email = deputado.getEmail();
        this.comissoes = deputado.getComissoes();
        this.link = WebMvcLinkBuilder.linkTo(Deputado.class).slash(deputado).withRel("Deputado");
    }

    public static List<DeputadoDto> convert(List<Deputado> deputados){
        return deputados.stream().map(DeputadoDto::new).collect(Collectors.toList());
    }
}
