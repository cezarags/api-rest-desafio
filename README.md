# Transaçoes API com springboot

API Restful genérica que realiza transferencia.

#### Funcionalidades
1. Transfêrencia de valores,armazenados em arraylist.
2. Relatorio de estatisticas.
3. Remoção de todos os dados.


## Documentação
- A documentação da API foi gerada com Swagger e está disponível em `http://localhost:8080/trasacoes/swagger-ui.html`

**OBSERVAÇÃO:** É necessário iniciar a aplicação para ter acesso ao documento.

## Requisitos para execução
 - [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
 - [Maven ](https://maven.apache.org)
 -


#### application.properties
-Ativar Compressao 
-server.compression.enabled=true
-Especificar o que tipo deve ser comprimido 
-server.compression.mime-types=application/json
-Defini um valor mínimo para realizar a compressão (1KB)
-server.compression.min-response-size=1024
-Caso algum campo receba algum valor nulo não será retornado na lista, assim tem ganho de performace
-spring.jackson.default-property-inclusion=NON_NULL



**1. Clonando o repositório** 

```bash
git clone https://github.com/cezarags/api-rest-desafio.git
```

**2. Executar a aplicação utilizando o maven**

```bash
cd banco-api
mvn spring-boot:run
```

A aplicação pode ser acessada em `http://localhost:8080/transacoes`.

Você também pode executar o arquivo no formato .jar, para executar use o seguinte comando

```bash

java -jar target/itau-api-1.0-SNAPSHOT
```



## Principais técnologias utilizadas
1. Java JDK 11
2. Maven 
3. Spring Boot 2.4.0
6. Swagger 2.9.2

