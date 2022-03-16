package com.br.itsingular.services;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.br.itsingular.entity.Funcionarios;
import com.br.itsingular.repository.FuncionariosRepository;
import com.br.itsingular.utils.UpdateEmployeesConvert;

@Service
public class FuncionariosServices {
	
	@Autowired
	private FuncionariosRepository funcionariosRepository; 
	
	@Autowired
	private MongoTemplate template;
	
	public List<Funcionarios> findFuncionarios() {
		return funcionariosRepository.findAll();
	}
	public Optional<Funcionarios> findFuncionariosById(String id) {
		return Optional.ofNullable(funcionariosRepository.findById(id)).get();
	}
	public void insert(Funcionarios entity) {
		funcionariosRepository.insert(entity);
	}
	public void update(Funcionarios entity) {
		Query q= new Query();
		q.addCriteria(Criteria.where("_id").is(entity.getId()));
		template.findAndModify(q, UpdateEmployeesConvert.updateDadosfuncionarios(entity) , Funcionarios.class);
	}
	public void validaDataContratacao(LocalDate dataInicio, LocalDate dataFim) {
		LocalDate dataAtual = LocalDate.now();
		Date date = Date.valueOf(dataAtual);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataAtualParse = format.format(date);
		String[] anoAtualArray = dataAtualParse.split("/");
		String anoAtual = anoAtualArray[2];
		
		Date dateInicio = Date.valueOf(dataInicio);
		SimpleDateFormat formatInicio = new SimpleDateFormat("dd/MM/yyyy");
		String dataInicioParse = format.format(dateInicio);
		String[] dataInicioArray = dataInicioParse.split("/");
		String anoInicio = dataInicioArray[2];
		
		Date dateFim = Date.valueOf(dataFim);
		SimpleDateFormat formatFim = new SimpleDateFormat("dd/MM/yyyy");
		String dataFimParse =  format.format(dateFim);
		String[] dataFimArray = dataFimParse.split("/");
		String anoFim = dataFimArray[2];	
		
		if (!anoAtual.equals(anoInicio) && anoAtual.equals(anoFim)) {
			
		}
	}
}
