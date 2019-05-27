package servico;

import javax.xml.ws.Endpoint;

public class ServicoPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8091/servico", new Servico());
	}
}
