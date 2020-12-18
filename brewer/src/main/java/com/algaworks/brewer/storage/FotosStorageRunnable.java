package com.algaworks.brewer.storage;

import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

import com.algaworks.brewer.dto.FotosDTO;

public class FotosStorageRunnable implements Runnable {

	private MultipartFile[] files;
	private DeferredResult<FotosDTO> resultado;

	public FotosStorageRunnable(MultipartFile[] files, DeferredResult<FotosDTO> resultado) {
		this.files = files;
		this.resultado = resultado;
	}

	@Override
	public void run() {
		System.out.println(">>> " + files[0].getSize());
		// TODO: Salvar a foto no sistema de arquivos
		
		String name = files[0].getOriginalFilename();
		String contentType = files[0].getContentType();
		
		resultado.setResult(new FotosDTO(name, contentType));
	}

}
