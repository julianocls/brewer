package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Estilo;

@Controller
public class EstiloController {

	@RequestMapping("/estilo/novo")
	public String novo(Estilo estilo) {
		return "estilo/CadastroEstilo";
	}

	@RequestMapping(value = "/estilo/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Estilo estilo, BindingResult result, Model model, RedirectAttributes attributes) {
		
	
		if (result.hasErrors()) {
			return novo(estilo);		
		}
		
		attributes.addFlashAttribute("mensagem", "Estilo salvo com sucesso");
		return "redirect:/estilo/novo";
	}
	
	
}