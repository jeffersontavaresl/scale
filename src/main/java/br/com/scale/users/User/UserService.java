package br.com.scale.users.User;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.scale.users.Dados.Dados;

@Service
public class UserService {

	public List<User> user(long page) {
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		
		restTemplate = restTemplateBuilder.build();
		
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("reqres.in")
				.path("api/users/")
				.queryParam("page", page)
				.build();
		
		Dados dados = restTemplate.getForObject(uriComponents.toUriString() , Dados.class);
		return dados.getData();
	}
}
