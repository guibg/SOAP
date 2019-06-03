package servico;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import model.Disciplina;

@WebService(endpointInterface = "servico.ServicoI")
public class Servico implements ServicoI {

	private static List<Disciplina> Disciplinas = new ArrayList<>();

	public void inserirDisciplina(Disciplina disciplina) {
		Disciplinas.add(disciplina);
	}

	public String listarDisciplina() {
		String disciplinasRetorno = "";
		for (Disciplina disciplina : Disciplinas) {
			disciplinasRetorno += disciplina.getNome();
			disciplinasRetorno += ", ";
		}
		return disciplinasRetorno;
	}

}
