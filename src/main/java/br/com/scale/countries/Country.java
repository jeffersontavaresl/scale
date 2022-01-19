package br.com.scale.countries;

import java.util.List;

import lombok.Data;

@Data
public class Country {
	private String code;
	private String name;
	private List<String> fronteiras;	
}
