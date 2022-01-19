package br.com.scale.users.Dados;

import java.util.List;

import br.com.scale.users.User.User;
import lombok.Data;

@Data
public class Dados {	
	
	private Long page;
	private Long per_page;
	private Long total;
	private Long total_pages;
	private List<User> data;

}
