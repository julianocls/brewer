package com.algaworks.brewer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

import com.algaworks.brewer.dto.FotosDTO;
import com.algaworks.brewer.storage.FotoStorage;
import com.algaworks.brewer.storage.FotosStorageRunnable;

@RestController
@RequestMapping("/fotos")
public class FotosController {
	
	@Autowired
	FotoStorage fotoStorage;

	@PostMapping
	public DeferredResult<FotosDTO> upload(@RequestParam("files[]") MultipartFile[] files) {

		
		DeferredResult<FotosDTO> resultado = new DeferredResult<FotosDTO>();
		
		Thread thread = new Thread( new FotosStorageRunnable(files, resultado, fotoStorage));
		thread.start();
 		
		return resultado;
	}

}
