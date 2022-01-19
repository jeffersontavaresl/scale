package br.com.scale.countries;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CountryService {

	public Country[] country() {
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		
		restTemplate = restTemplateBuilder.build();
		
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("amock.io")
				.path("api/fcmaia/countries")
				.build();
		
		ResponseEntity<Country[]> country = restTemplate.getForEntity(uriComponents.toUriString() , Country[].class);
		return country.getBody();
	}
}
