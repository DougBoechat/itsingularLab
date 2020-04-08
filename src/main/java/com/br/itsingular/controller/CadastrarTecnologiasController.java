/**
 * 
 */
package com.br.itsingular.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.itsingular.entity.Tecnologias;
import com.br.itsingular.services.CadastrarTecnologiasServices;
import com.br.itsingular.utils.Utils;

import lombok.Getter;

/**
 * @author dcarneiro
 *
 */
@Controller
@RequestMapping(value = "/cadastrarTecnologias")
public class CadastrarTecnologiasController {

	@Autowired
	private CadastrarTecnologiasServices cadastrarTecnologiasServices;

	@Getter
	private List<Tecnologias> listTecnologias;

	@RequestMapping(path = "/listar")
	public ModelAndView inicio() {
		ModelAndView model = new ModelAndView("/CadastrarTecnologias");
		model.addObject("tecnologias", new Tecnologias());
		listTecnologias = cadastrarTecnologiasServices.findCursos();
		if (listTecnologias.isEmpty()) {
			return model;
		}
		model.addObject("listTecnologias", listTecnologias);
		return model;
	}

	@RequestMapping(path = "/incluir", method = RequestMethod.POST)
	public ModelAndView insertTecnologias(@Valid Tecnologias tec, BindingResult result) {
		ModelAndView model = new ModelAndView("/CadastrarTecnologias");
		try {
			if (result.hasErrors()) {
				model.addObject("tecnologias", new Tecnologias());
				model.addObject("listTecnologias", listTecnologias);
				return model;
			}
			if (Utils.isEmptyOrNull(tec.getId())) {
				cadastrarTecnologiasServices.insertCurso(complementar(tec));
			} else {
				cadastrarTecnologiasServices.UpdateCursos(tec.getId(), complementar(tec));
			}
			listTecnologias = cadastrarTecnologiasServices.findCursos();
			model.addObject("tecnologias", new Tecnologias());
			model.addObject("listTecnologias", listTecnologias);
			model.addObject("message", "Success");
		} catch (Exception e) {
			model.addObject("error", e.getMessage().toString());
		}
		return model;

	}

	@RequestMapping("/delete/{id}")
	public ModelAndView excluir(@PathVariable("id") String id, Tecnologias cursos) {
		ModelAndView model = new ModelAndView("/CadastrarTecnologias");
		try {
			cadastrarTecnologiasServices.deleteCursos(id);
			listTecnologias = cadastrarTecnologiasServices.findCursos();
			model.addObject("tecnologias", new Tecnologias());
			model.addObject("listTecnologias", listTecnologias);
			model.addObject("message", "Success");
		} catch (Exception e) {
			model.addObject("error", e.getMessage().toString());
		}
		return model;

	}

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") String id) {
		ModelAndView model = new ModelAndView("/CadastrarTecnologias");
		Optional<Tecnologias> tst = cadastrarTecnologiasServices.findCursosById(id);
		Tecnologias tec = new Tecnologias();
		tec.setId(tst.get().getId());
		tec.setNomeCurso(tst.get().getNomeCurso());
		tec.setVersao(tst.get().getVersao());
		tec.setDescricaoResumida(tst.get().getDescricaoResumida());
		model.addObject("tecnologias", tec);
		listTecnologias = cadastrarTecnologiasServices.findCursos();
		return model;
	}

	public Tecnologias complementar(Tecnologias tec) {
		if (Utils.isEmptyOrNull(tec.getId())) {
			tec.setId(null);
		}
		tec.setDataInclOrManut(new Date());
		tec.setUsuario("Usuário Logado");
		return tec;
	}
}
