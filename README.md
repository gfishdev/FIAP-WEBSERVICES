# FIAP-WEBSERVICES


### Para gerar as classes do Web Service ###
wsgen -s . -classpath . br.com.fiap.exemplo.ws.HelloWeb

### Para importar as classes do Web Service ###
wsimport -keep -p br.com.fiap.exemplo.ws.client http://localhost:8080/hello?wsdl
