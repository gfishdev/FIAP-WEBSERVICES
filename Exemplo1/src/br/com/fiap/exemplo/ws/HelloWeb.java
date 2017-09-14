package br.com.fiap.exemplo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWeb {
	/**
	 * 
	 * Para gerar as classes do Web Service
	 * wsgen -s . -classpath . br.com.fiap.exemplo.ws.HelloWeb
	 */

	@WebMethod
	public String hello(String nome) {
		return "Hello " + nome;
	}

}
