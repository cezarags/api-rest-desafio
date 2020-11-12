# Desafio API transações com springboot

API Restful genérica que realiza transferencia.

#### Funcionalidades
1. Transfêrencia de valores,armazenados em arraylist.
2. Relatorio de estatisticas.
3. Remoção de todos os dados.


## Documentação
- A documentação da API foi gerada com Swagger e está disponível em `http://localhost:8080/swagger-ui.html#/transacao-controller`

![swagger](https://github.com/cezarags/api-rest-desafio/blob/main/swagger-Endpoints.jpg)

**OBSERVAÇÃO:** É necessário iniciar a aplicação para ter acesso ao documento.

## Requisitos para execução
 - [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
 - [Maven ](https://maven.apache.org)
 


#### application.properties
1.Ativar Compressao:
 server.compression.enabled=true

2.Especificar o que tipo deve ser comprimido: 
server.compression.mime-types=application/json

3.Defini um valor mínimo para realizar a compressão (1KB):
server.compression.min-response-size=1024

4.Caso algum campo receba algum valor nulo não será retornado na lista, assim tem ganho de performace:
spring.jackson.default-property-inclusion=NON_NULL



**1. Clonando o repositório** 

```bash
git clone https://github.com/cezarags/api-rest-desafio.git
```

**2 Importanto o projeto**
No Eclipse,Clique em Arquivo >importar>selecione Projetos Existentes>Procurar>selecionar o local onde realizou o download do clone acima e importar

**3. Executar a aplicação utilizando o maven ou iniciar pelo Eclipse ou STS**

```bash

Voce pode iniciar clicando com o botão direito do mouse no projeto e selecionar Executar como Spring Boot App. Sem o STS, você provavelmente executará o aplicativo na linha de comando com o seguinte comando:

cd api-itau
mvn spring-boot:run
```

A aplicação pode ser acessada em `http://localhost:8080/transacoes`.

**4 Automatizando testes com Postman, **

GET: Utilizado para obter um recurso
POST: Utilizado para cadastrar uma informação
PUT : Utilizado para alterar um recurso
DELETE: Utilizado para deletar um recurso

```bash
A primeira coisa que precisamos fazer é especificar a URI que vamos enviar a chamada e em seguida especificar o método da chamada, no nosso caso Post.
Em nosso caso devemos enviar parâmetros informados via body(corpo)Ex:
{     
        "valor": 300,
        "dataOperacao": "2020-11-11 22:26"  
}

![postman-automatizando testes](https://github.com/cezarags/api-rest-desafio/blob/main/EndpointTransferir.jpg)



```

Você também pode executar o arquivo no formato .jar, para executar use o seguinte comando

```bash

java -jar target/itau-api-1.0-SNAPSHOT
```



## Principais técnologias utilizadas
1. Java JDK 11
2. Maven 
3. Spring Boot 2.4.0
6. Swagger 2.9.2

