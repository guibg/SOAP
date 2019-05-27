package servico;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import model.Disciplina;

public class Cliente {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8091/servico");

		QName qname = new QName("http://servico/", "ServicoService");

		Service ws = Service.create(url, qname);

		ServicoI servico = ws.getPort(ServicoI.class);
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("teste");
		servico.inserirDisciplina(disciplina);
		System.out.println(servico.listarDisciplina());
	}
}
