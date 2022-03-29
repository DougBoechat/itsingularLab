/**
 * 
 */
package com.br.itsingular.utils;

import java.time.format.DateTimeFormatter;

import com.br.itsingular.entity.Funcionarios;

public class TemplateEmailAreaTecnica {

	public static String criarTemplateEmail(Funcionarios funcionario) {

		StringBuffer sb = new StringBuffer();
		
		sb.append("	<!DOCTYPE html>");
		sb.append("<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"");
		sb.append("xmlns:v=\"urn:schemas-microsoft-com:vml\"");
		sb.append("xmlns:o=\"urn:schemas-microsoft-com:office:office\">");
		sb.append("<head>");
		sb.append(" <meta charset=\"utf-8\">");
		sb.append(" <meta name=\"viewport\" content=\"width=device-width\"> ");
		sb.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> ");
		sb.append("<meta name=\"x-apple-disable-message-reformatting\"> ");

		sb.append("	<body width=\"100%\" bgcolor=\"#ffffff\" style=\"margin: 0; mso-line-height-rule: exactly;\">");
		sb.append("    <center style=\"width: 100%; background: #ffffff; text-align: left;\">");
		sb.append(
				"  <div style=\"display: none; font-size: 1px; line-height: 1px; max-height: 0px; max-width: 0px; opacity: 0; overflow: hidden; mso-hide: all; font-family: Arial, sans-serif;\">");
		sb.append(" </div>");
		sb.append(
				" <div style=\"display: none; font-size: 1px; line-height: 1px; max-height: 0px; max-width: 0px; opacity: 0; overflow: hidden; mso-hide: all; font-family: Arial, sans-serif;\">");
		sb.append(
				"&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;");
		sb.append(" </div>");
		sb.append(" <div style=\"max-width: 640px; margin: auto;\" class=\"email-container\">");
		sb.append(
				" <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" width=\"100%\" style=\"max-width: 640px;\">");
		sb.append("  <tr>");
		sb.append("  <td align=\"left\" valign=\"top\">");
		sb.append("<img src=\"https://ncdn0.infojobs.com.br/logos/2018/04/30/461110.jpg\" width=110 height=70>");
		sb.append("</td>");
		sb.append("   </tr>");
		sb.append(" </table>");
		sb.append(
				" <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" width=\"100%\" style=\"max-width: 640px; border: 1px solid #d8d8d8;\">");
		sb.append(" <tr>");
		sb.append(" <td bgcolor=\"#ffffff\">");
		sb.append(" <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">");
		sb.append("  <tr>");
		sb.append("  <td style=\"padding: 40px 25px;\">");
		sb.append(
				"<P style=\"text-align:center;margin: 0;  font-family: Arial, sans-serif; font-size: 20px; line-height: 140%; color: #3e4049;\">NOVO PROFISSIONAL IT SINGULAR </P>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\"></P><BR>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Nome do Funcionário: "
						+ funcionario.getNome() + "</P><BR>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">RG: "
						+ funcionario.getRg() + "</P><BR>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">CPF: "
						+ funcionario.getCpf() + "</P><BR>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">E-mail: "
						+ funcionario.getEmail() + "</P><BR>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Celular: "
						+ funcionario.getNumeroCelular() + "</P><BR>");
		
		sb.append("---------------------------------------------------------------------------------------------------------------");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">CEP: "
						+ funcionario.getCepResidencial() + "</P><BR>");
		
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Logradouro: "
						+ funcionario.getLogradouroResidencial() + "</P><BR>");
		
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Número: "
						+ funcionario.getNumeroResidencial() + "</P><BR>");
		
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Complemento: "
						+ funcionario.getComplementoResidencial() + "</P><BR>");
		
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Bairro: "
						+ funcionario.getBairroResidencial() + "</P><BR>");
		
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Cidade: "
						+ funcionario.getLocalidadeResidencial() + "</P><BR>");
		
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Estado: "
						+ funcionario.getEstadoResidencial() + "</P><BR>");
		
		sb.append("---------------------------------------------------------------------------------------------------------------");
		
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Departamento: "
						+ funcionario.getDepartamento().name() + "</P><BR>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Gestor Direto: "
						+ funcionario.getGestores().name() + "</P><BR>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Cliente: "
						+ funcionario.getClienteParceiros().name() + "</P><BR>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Tipo de Contratação: "
						+ funcionario.getTipoContratacao().name() + "</P><BR>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Dt. de Início: "
						+ funcionario.getDataContratacao().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "</P><BR>");
		sb.append("---------------------------------------------------------------------------------------------------------------");
		
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Notebook?: "
						+ funcionario.getNecessarioNotebookITSingular() + "</P><BR>");
		sb.append(
				"<P style=\"margin: 0;  font-family: Arial, sans-serif; font-size: 16px; line-height: 140%; color: #3e4049;\">Email IT?: "
						+ funcionario.getNecessarioDominioITSingular() + "</P><BR>");
		
		
		sb.append("   </td>");
		sb.append("  </tr>");
		sb.append(" </table>");
		sb.append(" </td>");
		sb.append("  </tr>");
		sb.append("    </table> ");
		sb.append("</div>");
		sb.append("	    </center>");
		sb.append("	</body>");
		sb.append("	</html>");

		return sb.toString();

	}
}
