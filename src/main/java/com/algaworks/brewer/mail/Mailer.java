package com.algaworks.brewer.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.algaworks.brewer.model.Venda;

@Component
public class Mailer {
	
	@Autowired
	JavaMailSender javaMailSender;

	@Async
	public void enviar(Venda venda) {
		SimpleMailMessage mensagem = new SimpleMailMessage();
		mensagem.setFrom("foxports@hotmail.com");
		mensagem.setTo(venda.getCliente().getEmail());
		mensagem.setSubject("Obrigado por comprar em nossa loja");
		mensagem.setText("Muito obrigato, recebemos sua compra.");
		
		javaMailSender.send(mensagem);
	}

}
