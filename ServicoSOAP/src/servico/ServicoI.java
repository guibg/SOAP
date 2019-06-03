package servico;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import model.Disciplina;

@WebService
@SOAPBinding
public interface ServicoI {

	@WebMethod void inserirDisciplina(Disciplina materia);

	@WebMethod String listarDisciplina();
	
}
