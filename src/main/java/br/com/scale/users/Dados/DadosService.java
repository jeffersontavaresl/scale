package br.com.scale.users.Dados;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class DadosService {

	public Dados dados(long page) {
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		
		restTemplate = restTemplateBuilder.build();
		
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("reqres.in")
				.path("api/users/")
				.queryParam("page", page)
				.build();
		
		ResponseEntity<Dados> dados = restTemplate.getForEntity(uriComponents.toUriString() , Dados.class);
		return dados.getBody();
	}
}
