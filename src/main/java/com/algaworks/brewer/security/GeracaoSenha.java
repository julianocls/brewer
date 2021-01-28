package com.algaworks.brewer.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeracaoSenha {
	
	public static void main(String[] args) {
		
		String password = "juliano";
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println("Usuario:" + password + " => Senha: " + encoder.encode(password));
	}

}
