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

| ID    | Caso de Teste                          | Tipo      | Pré-Condição               | Passos Detalhados                                                                                                                                  | Resultado Esperado                                                         | Status    |
| ----- | -------------------------------------- | --------- | -------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------- | --------- |
| CT-01 | Carregar aplicação                     | UI        | App instalado              | 1. Executar o aplicativo pelo atalho ou terminal.<br>2. Aguardar processo de inicialização.                                                        | A janela principal deve abrir sem erros e completamente carregada.         | ✅ |
| CT-02 | Selecionar moeda de origem             | UI        | App aberto                 | 1. Localizar o dropdown de “Moeda de Origem”.<br>2. Clicar no dropdown.<br>3. Selecionar uma moeda da lista.                                       | A moeda de origem deve ser alterada e aparecer no campo selecionado.       | ✅ |
| CT-03 | Selecionar moeda de destino            | UI        | App aberto                 | 1. Localizar o dropdown de “Moeda de Destino”.<br>2. Clicar no dropdown.<br>3. Selecionar a moeda desejada.                                        | A moeda de destino deve ser atualizada corretamente.                       | ✅ |
| CT-04 | Inserir valor válido para conversão    | UI        | App aberto                 | 1. Clicar no campo de valor.<br>2. Digitar um número válido (ex.: 100.50).                                                                         | O campo deve aceitar o valor e exibir corretamente o número digitado.      | ✅ |
| CT-05 | Inserir valor inválido (texto)         | UI        | App aberto                 | 1. Clicar no campo de valor.<br>2. Digitar caracteres não numéricos (ex.: “abc”).                                                                  | A aplicação deve impedir a entrada ou exibir mensagem de erro adequada.    | ✅ |
| CT-06 | Inserir valor negativo                 | UI        | App aberto                 | 1. Clicar no campo de valor.<br>2. Digitar um valor negativo (ex.: -50).                                                                           | App deve rejeitar o valor negativo ou exibir um alerta ao usuário.         | ✅ |
| CT-07 | Converter valores com API respondendo  | API/UI    | Internet ativa, app aberto | 1. Preencher o campo de valor com um número válido.<br>2. Selecionar moeda de origem.<br>3. Selecionar moeda destino.<br>4. Clicar em “Converter”. | O app deve exibir o valor convertido com base na taxa real da API.         | ✅ |
| CT-08 | Conversão com mesma moeda (USD→USD)    | Funcional | App aberto                 | 1. Selecionar a mesma moeda em origem e destino.<br>2. Inserir valor válido.<br>3. Clicar em “Converter”.                                          | O resultado deve ser exatamente igual ao valor inserido.                   | ✅ |
| CT-09 | Botão converter desabilitado sem dados | UI        | App aberto                 | 1. Garantir que campo de valor esteja vazio.<br>2. Não selecionar moedas ou deixá-las padrão.<br>3. Verificar botão.                               | O botão “Converter” deve permanecer desabilitado.                          | ✅ |
| CT-10 | UI não deve travar durante conversão   | UI        | API online                 | 1. Iniciar conversão com um valor válido.<br>2. Interagir com outros elementos da UI enquanto a conversão ocorre.                                  | A interface deve permanecer responsiva, sem congelamentos.                 | ✅ |
| CT-11 | Limpar campos                          | UI        | Campos preenchidos         | 1. Preencher os campos.<br>2. Clicar no botão “Limpar”.                                                                                            | Todos os campos devem retornar ao estado inicial.                          | ✅ |
| CT-12 | Atualização de valor resultante        | UI        | Campos preenchidos         | 1. Digitar um valor válido e converter.<br>2. Alterar o valor novamente.<br>3. Clicar em “Converter” novamente.                                    | O resultado deve atualizar de acordo com o novo valor.                     | ✅ |


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

### Estrutura das Pastas

### Estratégia de Branches

Utilizamos uma estratégia baseada em **Git Flow** simplificado, como não desenvolvemos nenhuma funcionalidade, utilizamos `test` ao invés de `feature`

- **`main`**: Código estável e produção
- **`develop`**: Desenvolvimento e integração
- **`test/*`**: Desenvolvimento de testes

Adotamos a especificação **Conventional Commits** para padronizar as mensagens. 
> A estrutura básica é `tipo(escopo): descrição`.
> Exemplo: docs: adiciona links de pr e commit

Não utilizamos escopo por ser um projeto simples.

>**[Link PR'S](https://github.com/gfreitas15/Currency-Converter/pulls)**

>**[Link para Commits](https://github.com/gfreitas15/Currency-Converter/commits/main)**

## 🚀 Execução

- Fazer DPS

## 🌐 GitHub Pages

**[Link para a landing page do projeto](https://gfreitas15.github.io/A3GQS5N/)**