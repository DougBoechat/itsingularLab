package com.br.itsingular.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import com.br.itsingular.enums.ApontamentoHoras;
import com.br.itsingular.enums.ClientesParceiros;
import com.br.itsingular.enums.DepartamentoITSingular;
import com.br.itsingular.enums.Gestores;
import com.br.itsingular.enums.ModoHoras;
import com.br.itsingular.enums.StatusFuncionario;
import com.br.itsingular.enums.TecnologiaPrincipal;
import com.br.itsingular.enums.TempoContratacao;
import com.br.itsingular.enums.TipoAtuacao;
import com.br.itsingular.enums.TipoBanco;
import com.br.itsingular.enums.TipoCargo;
import com.br.itsingular.enums.TipoConta;
import com.br.itsingular.enums.TipoContratacao;
import com.br.itsingular.enums.TipoGenero;
import com.br.itsingular.enums.TipoNivel;
import com.br.itsingular.model.Conta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("CADASTRAR_FUNCIONARIOS")
public class Funcionarios implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@NotBlank(message = "Campo obrigatório")
	private String nome;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private DepartamentoITSingular departamento;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private TipoCargo cargo;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private TecnologiaPrincipal tecnologiaPrincipal;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private TipoNivel nivelContratacao;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private TipoAtuacao atuacao;

	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private ClientesParceiros clienteParceiros;

	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private Gestores gestores;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private TipoContratacao tipoContratacao;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private TempoContratacao tempoContratacao;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private ModoHoras modoHoras;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private ApontamentoHoras apontamentoHoras;
	
	private String remuneracaoCLT;

	private String remuneracaoPJ;
	
	private String valorTransporte;

	private String valorVrVA;

	private String valorPlanoSaude;

	private String valorAuxilioCreche;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Campo obrigatório")
	private LocalDate dataContratacao;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataFimContratacao;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private StatusFuncionario statusFuncionario;

	
	@NotBlank(message = "Campo obrigatório")
	private String rg;
	
	@NotBlank(message = "Campo obrigatório")
	private String cpf;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Campo obrigatório")
	private LocalDate dataNascimento;
	
	@NotNull(message = "Campo obrigatório")
	@Enumerated(EnumType.STRING)
	private TipoGenero genero;
	
	private Integer idade;
	
	
	@NotBlank(message = "Campo obrigatório")
	private String logradouroResidencial;
	
	@NotBlank(message = "Campo obrigatório")
	private String bairroResidencial;
	
	@NotBlank(message = "Campo obrigatório")
	private String estadoResidencial;
	
	@NotBlank(message = "Campo obrigatório")
	private String localidadeResidencial;
	
	@NotBlank(message = "Campo obrigatório")
	private String numeroResidencial;
	
	@NotBlank(message = "Campo obrigatório")
	private String complementoResidencial;
	
	@NotBlank(message = "Campo obrigatório")
	private String cepResidencial;
	
	private String logradouroComercial;
	
	private String bairroComercial;
	
	private String estadoComercial;
	
	private String localidadeComercial;
	
	private String numeroComercial;
	
	private String complementoComercial;
	
	private String cepComercial;
	
	private List<Conta> contas;
	
	private String cnpj;
	
	private String nomeEmpresa;
	
	@NotBlank(message = "Campo obrigatório")
	private String numeroCelular;
	
	private String numeroTelefone;
	
	@NotBlank(message = "Campo obrigatório")
	private String email;
	
	private String emailCorporativo;
	
	
	
	private String observacao;
	
	@NotBlank(message = "Campo obrigatório")
	private String necessarioNotebookITSingular;
	
	@NotBlank(message = "Campo obrigatório")
	private String necessarioDominioITSingular;
	
	@LastModifiedBy
	private String usuarioManutencao;
	
	@LastModifiedDate
	private String dataManutencao;

}
