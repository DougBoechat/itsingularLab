package com.br.itsingular.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import com.br.itsingular.utils.Utils;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "CADASTRAR_CURRICULOS")
public class Curriculos implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@NotBlank(message = "Campo obrigatório")
	private String cpf;
	
	private String[] tecnologiasAssociadas;
	
	@NotBlank(message = "Campo obrigatório")
	private String nome;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Campo obrigatório")
	private LocalDate dataNascimento;
	
	@NotBlank(message = "Campo obrigatório")
	private String telCelular;
	
	@NotBlank(message = "Campo obrigatório")
	private String email;
	
	@JsonIgnore
    private TipagemArquivosUpload uploadDownloadPdf;
	@JsonIgnore
    private TipagemArquivosUpload uploadDownloadWord;

	@Transient
	private MultipartFile pdf;
	
	@Transient
	private MultipartFile word;
	
	public String getDataNascimentoFormat() {
		return Utils.formatDate(this.getDataNascimento());
	}
	
}
