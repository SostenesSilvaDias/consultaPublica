package br.com.consultapublica.service;


import br.com.consultapublica.model.Deputado;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Objects;

@Service
public class DeputadoService {

    public List<Deputado> consultarDeputados() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://www.camara.leg.br/SitCamaraWS/Deputados.asmx/ObterDeputados", String.class);
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(Objects.requireNonNull(responseEntity.getBody()), new TypeReference<List<Deputado>>() {});

        /*ObjectMapper jsonMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String json = jsonMapper.writeValueAsString(deputados);
        DeputadoRoot myObjects = jsonMapper.readValue(json, DeputadoRoot.class);

        Deputado list = xmlMapper.readValue(responseEntity.getBody(), Deputado.class);
        JsonNode node = xmlMapper.readTree(responseEntity.getBody());
        List<DeputadoRoot> Deputados = Arrays.asList(jsonMapper.readValue(json, DeputadoRoot[].class));
        List<Deputado> myObjects = jsonMapper.readValue(json, jsonMapper.getTypeFactory().constructCollectionType(List.class, Deputado.class));*/
    }

}
