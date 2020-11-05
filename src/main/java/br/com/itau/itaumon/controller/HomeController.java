package br.com.itau.itaumon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.itaumon.beans.Alarme;
import br.com.itau.itaumon.dao.AlarmeDAO;


@RestController // Indica que a classe irá responder protocolos HTTP (GET/POST)
@CrossOrigin("*")
public class HomeController {

	@Autowired // indica que o gerenciamento do atributo sera feito pelo Spring
	private AlarmeDAO dao;
	
	@GetMapping("/")
	public String index(){
		return "{\"mensagem\": \"Bem indo a API de teste\"}"
	}
}
