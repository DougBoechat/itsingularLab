/**
 * 
 */
package com.br.itsingular.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author dcarneiro
 *
 */
@Getter
@AllArgsConstructor
public enum TipoContratacao {

	CLT(1,"CLT"),
	COOPERATIVA(2,"COOPERATIVA"), 
	ESTAGIO(3,"ESTÁGIO"),
	FLEX_CLT(4,"FLEX CLT"),
	FLEX_PJ(5, "FLEX PJ"),
	PJ(6,"PJ");
	
	
	private Integer tipoContratacao;
	private String descricaoTipoContratacao;	
	
}
