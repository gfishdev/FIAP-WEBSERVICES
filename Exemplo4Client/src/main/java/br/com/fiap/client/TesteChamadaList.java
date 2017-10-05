package br.com.fiap.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.filter.HttpBasicAuthFilter;

public class TesteChamadaList {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		client.register(new HttpBasicAuthFilter("guilherme", "123"));

		WebTarget target = client.target("http://localhost:8080/Exemplo4").path("alunos");

		Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		Response resposta = invocationBuilder.get();

		Aluno[] alunos = resposta.readEntity(Aluno[].class);

		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
			System.out.println("Turma: " + a.getTurma());
			System.out.println("Média: " + a.getMedia());
			System.out.println("----------");
		}
	}

}
