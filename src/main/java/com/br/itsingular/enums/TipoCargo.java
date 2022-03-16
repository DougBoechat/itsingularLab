package com.br.itsingular.enums;

import lombok.Getter;

@Getter
public enum TipoCargo {

	ANALISTA_BI,
	ANALISTA_DADOS, 
	ANALISTA_DATAPOWER, 
	ANALISTA_INFRAESTRUTURA, 
	ANALISTA_NEGOCIOS, 
	ANALISTA_REDES, 
	ANALISTA_SEGURANCA, 
	ANALISTA_SUPORTE, 
	ARQUITETO, 
	ARQUITETO_CLOUD, 
	CIENTISTA_DADOS, 
	COMERCIAL, 
	CONSULTOR_ANALYTICS, 
	CONSULTOR_ERP, 
	CONSULTOR_SAP, 
	COORDENADOR_GERENTE, 
	DBA, 
	DESENVOLVEDOR_BACK_END,
	DESENVOLVEDOR_FRONT_END, 
	DESENVOLVEDOR_FULLSTACK, 
	DESENVOLVEDOR_MOBILE, 
	DESIGNER, 
	DEVOPS, 
	ENGENHEIRO_DADOS, 
	ENGENHEIRO_SOFTWARE, 
	ESPECIALISTA, 
	GERENTE_PROJETOS, 
	PRODUCT_OWNER, 
	QA, 
	SCRUM_MASTER, 
	TECH_LEAD, 
	UX_UI,
	VAZIO;

	private String tipoCargo;
	
}
