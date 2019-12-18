package com.pedrosolbm.crud.api.responses;

import java.util.List;

public class Response<T> {

	private T data;

	private List<String> erros;

	// COnstrutor de resposta, recebendo qualquer tipo de dado
	public Response(T data) {
		this.data = data;
	}

	//Construtor de resposta, recebendo lista de erros
	public Response(List<String> erros) {
		this.erros = erros;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}

}
