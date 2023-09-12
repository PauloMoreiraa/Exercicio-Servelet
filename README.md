# Calculadora de Permutações e Combinações Servlet

Este é um servlet simples que calcula permutações e combinações de K elementos a partir de um conjunto com N elementos. Ele permite que os usuários insiram valores de N e K por meio de um formulário HTML e retorna os resultados dos cálculos.

## :memo: Requisitos

- Java 8 ou superior
- Um servidor de aplicação compatível com Servlets (por exemplo, Apache Tomcat)

## :monocle_face: Como Usar

1. Clone ou faça o download deste repositório.

2. Configure seu servidor de aplicação para hospedar o servlet. Isso pode ser feito instalando o Apache Tomcat e implantando o arquivo WAR gerado a partir deste projeto.

3. Acesse a página inicial do servlet no navegador, geralmente em `http://localhost:8080/NomeDoSeuAplicativo`.

4. Preencha os campos "Tamanho do conjunto (N)" e "Tamanho do conjunto (K)" com valores numéricos válidos e clique em "Enviar".

5. Os resultados das permutações e combinações serão exibidos em uma página separada.

## :rotating_light: Mensagens de Erro

Se você inserir valores não numéricos ou campos vazios para N e/ou K, receberá uma mensagem de erro na página inicial.

## :building_construction: Estrutura do Projeto

- `index.jsp`: A página inicial que contém o formulário HTML para inserir valores de N e K.

- `Calcular.java`: O servlet que realiza os cálculos de permutações e combinações com base nos valores inseridos pelo usuário. Também lida com mensagens de erro.

- `resultado.jsp`: A página que exibe os resultados dos cálculos.

## :technologist: Contribuições

Sinta-se à vontade para contribuir para este projeto, reportar problemas ou propor melhorias. Ficaremos felizes em receber contribuições da comunidade.
