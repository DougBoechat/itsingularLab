package com.br.itsingular.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TempoContratacao {

	
	FREELANCER(1,"FREELANCER"), 
	UM_A_DOZE_MESES(2,"DE UM A DOZE MESES");
	
	private Integer tempoContratacao;
	private String descricaotempoContratacao;
	

}
