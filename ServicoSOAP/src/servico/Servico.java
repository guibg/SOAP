package servico;

import java.util.ArrayList;
import java.util.List;

public class Servico {

	private static List<String> Materias = new ArrayList<>();

	public void inserirMateria(String materia) {
		Materias.add(materia);
	}

	public String listarMaterias() {
		String MateriasRetorno = "";
		for (String materia : Materias) {
			MateriasRetorno += ", ";
			MateriasRetorno += materia;
		}
		return MateriasRetorno;
	}
}
