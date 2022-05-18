package com.br.itsingular.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.br.itsingular.entity.Funcionarios;
import com.br.itsingular.repository.FuncionariosRepository;
import com.br.itsingular.utils.UpdateEmployeesConvert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

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
		Query q = new Query();
		q.addCriteria(Criteria.where("_id").is(entity.getId()));
		template.findAndModify(q, UpdateEmployeesConvert.updateDadosfuncionarios(entity), Funcionarios.class);
	}

	public Boolean validaDataContratacao(LocalDate dataInicio, LocalDate dataFim) {

		Integer anoAtual = LocalDate.now().getYear();
		Integer anoInicio = dataInicio != null ? dataInicio.getYear() : null;
		Integer anoFinal = dataFim != null ? dataFim.getYear() : null;

		if (anoInicio != null || anoFinal == null) {
			if (anoInicio == anoAtual) {
				return Boolean.TRUE;
			}

		}

		return Boolean.FALSE;

	}

}
