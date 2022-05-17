package com.br.itsingular.model;

import com.br.itsingular.enums.TipoBanco;
import com.br.itsingular.enums.TipoConta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {
	
	private TipoBanco banco;
	private TipoConta tipoConta;
	private String agencia;
	private String conta;

}
