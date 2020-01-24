package br.com.consultapublica.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("deputado")
public class Deputado extends RepresentationModel {

    @JsonProperty("ideCadastro")
    private int ideCadastro;
    @JsonProperty("codOrcamento")
    private String codOrcamento;
    @JsonProperty("condicao")
    private String condicao;
    @JsonProperty("matricula")
    private String matricula;
    @JsonProperty("idParlamentar")
    private String idParlamentar;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("nomeParlamentar")
    private String nomeParlamentar;
    @JsonProperty("urlFoto")
    private String urlFoto;
    @JsonProperty("sexo")
    private String sexo;
    @JsonProperty("uf")
    private String UF;
    @JsonProperty("partido")
    private String partido;
    @JsonProperty("gabinete")
    private String gabinete;
    @JsonProperty("anexo")
    private String anexo;
    @JsonProperty("fone")
    private String fone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("comissoes")
    private Comissoes comissoes;

    public Deputado (){}
}
