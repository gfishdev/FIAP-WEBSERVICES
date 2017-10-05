package br.com.fiap.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.filter.HttpBasicAuthFilter;


public class TesteChamada {
	
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		client.register(new HttpBasicAuthFilter("guilherme", "123"));
		WebTarget target = client.target("http://localhost:8080/Exemplo4").path("alunos");
		
		Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		
		Aluno a = new Aluno("Mario", "Atras do armario", 10.0);
		
		Response resposta = invocationBuilder.post(Entity.entity(a, MediaType.APPLICATION_JSON));
		
		Retorno r = resposta.readEntity(Retorno.class);
		
		System.out.println(r.getMensagem());
	}
	
}
