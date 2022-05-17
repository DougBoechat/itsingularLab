package com.br.itsingular.enums;

import lombok.Getter;

@Getter
public enum DepartamentoITSingular {
	
	COMERCIAL,
	CONCILIACAO,
	RH,
	TI,
	
	//Novos enums atualizados
	EMPLOYEE_EXPERIENCE,
	FINANCES,
	PRODUCT_SALES,
	SERVICE_SALES,
	TALENT_ACQUISITION,
	VAZIO;
	

	private String tipoDepartamento;
}
