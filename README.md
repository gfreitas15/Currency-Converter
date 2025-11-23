# Currency Converter - Projeto A3

## 🎯 Sobre o Projeto

O **Currency Converter** é um sistema de conversão de moedas desenvolvido em Java com interface gráfica Swing. O projeto permite aos usuários converter valores entre diferentes moedas utilizando taxas de câmbio em tempo real fornecidas pela [ExchangeRate-API](https://www.exchangerate-api.com).

### Objetivo

> Demonstrar na prática técnicas de qualidade e teste de software, aplicando estratégias de teste, automação, métricas, estimativas e revisão de código em um sistema real.

## 👥 Equipe

- **Bruno Lussani Oliveira** - RA: 1292311886
- **Gabriel de Freitas Monguilhott** - RA: 1292312031
- **Gabriel Martins Schmelzer** - RA: 1292312038
- **Rafael Silveira de Vargas** - RA: 1292312390
- **Victor Pieluhowski Zuboski Bastos** - RA: 1292317745

## 🧪 Plano de Testes

### Escopo

#### Inclusões

- Testes funcionais da UI
- Testes de conexão da API
- Testes de validação das taxas de conversão
- Testes de entradas inválidas

#### Exclusões

- Testes de segurança
- Testes de desempenho
- Testes de carga/estresse

#### Risco e Mitigações


### Critérios

#### Aceitação

- Comunicação com API funcionando
- Funcionalidade da UI sem erros críticos
- Validação correta da entrada de dados
- Resultado da conversão não apresenta erros

#### Saída

- Nenhum defeito crítico pendente
- Todos os casos de teste foram executados

### Casos de Teste

| ID    | Caso de Teste                          | Tipo      | Pré-Condição                | Passos                                   | Resultado Esperado                                  | Status    |
| ----- | -------------------------------------- | --------- | --------------------------- | ---------------------------------------- | --------------------------------------------------- | --------- |
| CT-01 | Carregar aplicação                     | UI        | App iniciado                | Abrir a aplicação                        | A janela principal deve abrir sem erros             | A definir |
| CT-02 | Selecionar moeda de origem             | UI        | App aberto                  | Abrir dropdown e escolher moeda          | Moeda de origem deve ser atualizada corretamente    | A definir |
| CT-03 | Selecionar moeda de destino            | UI        | App aberto                  | Abrir dropdown e escolher moeda          | Moeda de destino deve ser atualizada corretamente   | A definir |
| CT-04 | Inserir valor válido para conversão    | UI        | App aberto                  | Digitar valor no campo                   | Campo deve aceitar o valor sem erros                | A definir |
| CT-05 | Inserir valor inválido (texto)         | UI        | App aberto                  | Digitar texto no campo                   | Exibir mensagem de erro ou impedir entrada inválida | A definir |
| CT-06 | Inserir valor negativo                 | UI        | App aberto                  | Digitar valor                            | App deve rejeitar ou alertar entrada negativa       | A definir |
| CT-07 | Converter valores com API respondendo  | API/UI    | Internet ativa              | Preencher campos e clicar em “Converter” | Valor convertido correto com taxa real              | A definir |
| CT-08 | Converter valores com API fora do ar   | API       | API offline                 | Clicar em “Converter”                    | App deve exibir erro informativo (“Falha na API”)   | A definir |
| CT-09 | Validar taxa retornada pela API        | API       | API online                  | Realizar requisição                      | Taxa deve ser coerente com o endpoint oficial       | A definir |
| CT-10 | Conversão com mesma moeda (USD→USD)    | Funcional | App aberto                  | Tentar converter                         | Resultado deve ser exatamente o mesmo valor         | A definir |
| CT-11 | Botão converter desabilitado sem dados | UI        | App aberto                  | Não preencher nada                       | Botão deve permanecer desativado                    | A definir |
| CT-12 | UI não deve travar durante conversão   | UI        | API online                  | Executar conversão                       | Aplicação continua responsiva                       | A definir |
| CT-13 | Limpar campos                          | UI        | Campo preenchido            | Botão Limpar                             | Campos devem retornar ao estado inicial             | A definir |
| CT-14 | Atualização de valor resultante        | UI        | Campos preenchidos          | Modificar input                          | Resultado deve atualizar após nova conversão        | A definir |



## 🤖 Testes Automatizados

### Ferramentas Utilizadas

- **JUnit 5** (Versão 5.10.0)

### Como Rodar os Testes

#### Pré-requisitos

- **Maven** (3.6+)
- **JDK 23+**

#### Como executar

1. Abrir terminal

2. Abrir o projeto

        cd Currency-Converter
        
3. Executar os testes

        mvn test

Gerar relátorio de cobertura com JaCoCo:

    mvn clean test jacoco:report
    
    start target/site/jacoco/index.html

## 📊 Métricas e Estimativas

- Fazer

## 🔍 Revisão Técnica

### Técnicas Utilizadas

- Fazer

### Resultados Encontrados

- Fazer

## 🔧 Versionamento

- Fazer

### Estratégia de Branches

- Fazer

Utilizamos uma estratégia baseada em **Git Flow** simplificado:

- **`main`**: Código estável e produção
- **`develop`**: Desenvolvimento e integração
- **`test/*`**: Desenvolvimento de testes

## 🚀 Execução

- Fazer DPS

## 🌐 GitHub Pages

**[Link para a landing page do projeto](https://gfreitas15.github.io/A3GQS5N/)**