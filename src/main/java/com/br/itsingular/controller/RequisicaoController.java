package com.br.itsingular.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.itsingular.entity.Requisicao;
import com.br.itsingular.services.RequisicaoServices;
import com.br.itsingular.utils.Utils;

@Controller
@RequestMapping(value = "/requisicao")
public class RequisicaoController {

	private HttpServletRequest req;
	
	@Autowired
	private RequisicaoServices requisicaoServices;

	@RequestMapping(value = "/abrir", method = RequestMethod.GET)
	public ModelAndView main(HttpServletRequest request, Requisicao requisicao) {
		request.getSession().setAttribute("nomeSolicitante", "ITSINGULAR@ITSINGULAR.COM.BR");
		req = request;
		ModelAndView modelAndView = new ModelAndView("RequisicaoVagas");
		if(!Utils.isEmptyOrNull(requisicao)) { 
			requisicao = new Requisicao();
			
			requisicao.setNomeSolicitante(request.getSession().getAttribute("nomeSolicitante").toString());
			requisicao.setDataSolicitacao(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
			modelAndView.addObject("requisicao", requisicao);
		}
		
		return modelAndView;
	}
	
	@RequestMapping(path = "/addRequisicao", method = RequestMethod.POST)
	public ModelAndView addRequisicao(@Valid Requisicao requisicao, BindingResult result) {
		
		if (result.hasErrors()) {
			return main(req,null);
		}
		ModelAndView modelAndView = new ModelAndView("RequisicaoVagas");
		if (!Utils.isEmptyOrNull(requisicaoServices.salvarRequisicao(requisicao))) {
			modelAndView.addObject("message","Success");
			modelAndView.addObject("requisicao", new Requisicao());
			return modelAndView;
		}
		modelAndView.addObject("error","error");
		return modelAndView;
	}
}
