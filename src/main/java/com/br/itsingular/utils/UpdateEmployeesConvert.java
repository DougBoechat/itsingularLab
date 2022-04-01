package com.br.itsingular.utils;

import org.springframework.data.mongodb.core.query.Update;

import com.br.itsingular.entity.Funcionarios;

public class UpdateEmployeesConvert {

	public static Update updateDadosfuncionarios(Funcionarios f) {
		Update update = new Update();

		//Dados especificos do Profissional
		update.set("nome", f.getNome());
		update.set("rg", f.getRg());
		update.set("cpf", f.getCpf());
		update.set("dataNascimento", f.getDataNascimento());
		update.set("genero", f.getGenero());
		update.set("idade", f.getIdade());
		
		//Dados de contato
		update.set("numeroCelular", f.getNumeroCelular());
		update.set("numeroTelefone", f.getNumeroTelefone());
		update.set("email", f.getEmail());
		update.set("emailCorporativo", f.getEmailCorporativo());
		
		//Dados para Contratacao
		update.set("departamento", f.getDepartamento());
		update.set("cargo", f.getCargo());
		update.set("tecnologiaPrincipal", f.getTecnologiaPrincipal());
		update.set("nivelContratacao", f.getNivelContratacao());
		update.set("atuacao", f.getAtuacao());
		update.set("clienteParceiros", f.getClienteParceiros());
		update.set("gestores", f.getGestores());
		update.set("tipoContratacao", f.getTipoContratacao());
		update.set("remuneracaoCLT", f.getRemuneracaoCLT());
		update.set("remuneracaoPJ", f.getRemuneracaoPJ());
		update.set("valortransporte", f.getValorTransporte());
		update.set("valorVrVA", f.getValorVrVA());
		update.set("valorPlanoSaude", f.getValorPlanoSaude());
		update.set("valorAuxilioCreche", f.getValorAuxilioCreche());
		update.set("dataContratacao", f.getDataContratacao());
		update.set("dataFimContratacao", f.getDataFimContratacao());
		update.set("statusFuncionario", f.getStatusFuncionario());
		update.set("tempoContratacao", f.getTempoContratacao());
		update.set("modoHoras", f.getModoHoras());
		update.set("apontamentoHoras", f.getApontamentoHoras());


		
		//Dados do Logradouro 
		update.set("logradouroResidencial", f.getLogradouroResidencial());
		update.set("bairroResidencial", f.getBairroResidencial());
		update.set("estadoResidencial", f.getEstadoResidencial());
		update.set("numeroResidencial", f.getNumeroResidencial());
		update.set("complementoResidencial", f.getComplementoResidencial());
		update.set("localidadeResidencial", f.getLocalidadeResidencial());
		update.set("cepResidencial", f.getCepResidencial());
		
		//Dados bancários
		update.set("tipoConta", f.getTipoConta());
		update.set("banco", f.getBanco());
		update.set("agencia", f.getAgencia());
		update.set("conta", f.getConta());
		
		//Se PJ, Dados da Empresa
		update.set("cnpj", f.getCnpj());
		update.set("nomeEmpresa", f.getNomeEmpresa());
		update.set("logradouroComercial", f.getLogradouroComercial());
		update.set("bairroComercial", f.getBairroComercial());
		update.set("estadoComercial", f.getEstadoComercial());
		update.set("localidadeComercial", f.getLocalidadeComercial());
		update.set("numeroComercial", f.getNumeroComercial());
		update.set("complementoComercial", f.getComplementoComercial());
		update.set("cepComercial", f.getCepComercial());
		
		update.set("necessarioDominioITSingular", f.getNecessarioDominioITSingular());
		update.set("NecessarioNotebookITSingular", f.getNecessarioNotebookITSingular());
		
		update.set("observacao", f.getObservacao());
		
		return update;
	}
}
