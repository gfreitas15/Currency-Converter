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

1. **Abrir o terminal**

2. **Acessar o projeto**
   ```bash
   cd Currency-Converter
   ```

3. **Adicionar sua `API_KEY`**  

   Edite o arquivo:
   ```
   src/main/resources/config.properties
   ```

4. **Executar os testes**
   ```bash
   mvn test
   ```


## 📊 Métricas e Estimativas

### Métricas

#### Cobertura de Instruções

No projeto, atingimos 71%, o que demonstra boa cobertura geral.

#### Complexidade Ciclomática

Somando todos as classes, o total observado foi de 50, valor baixo que se justifica pela simplicidade do projeto.

Como gerar relátorio de cobertura com JaCoCo:

    mvn clean test jacoco:report
    
    start target/site/jacoco/index.html

### Estimativa de Esforço (PERT)

| Atividade                                   | O  | M  | P  | Tempo Estimado (h) | Real (h) |
|---------------------------------------------|----|----|----|---------------------|----------|
| Estudo da Aplicação                          | 1  | 2  | 4  | 2.3                 |     4     |
| Análise Inicial                               | 1  | 2  | 3  | 2.0                 |     3     |
| Definição de Escopo                           | 1  | 1  | 2  | 1.2                 |     2     |
| Estudo do Código                              | 1  | 2  | 3  | 2.0                 |     1     |
| Planejamento dos Testes (inclui Casos)        | 2  | 3  | 5  | 3.2                 |     2     |
| Implementação de Testes Automatizados         | 2  | 4  | 6  | 4.0                 |     6     |
| Execução e Validação dos Casos de Teste       | 1  | 2  | 3  | 2.0                 |     1     |
| Análise de Qualidade                           | 1  | 2  | 3  | 2.0                 |    4      |
| Análise de Cobertura                           | 1  | 1  | 2  | 1.2                 |    3      |
| Documentação Final                             | 1  | 2  | 3  | 2.0                 |    8      |
| Versionamento e Organização do Repositório     | 1  | 1  | 2  | 1.2                 |    3      |
| **Total do Projeto**                           |    |    |    | **23.1**            | **37**    |

## 🔍 Revisão Técnica

### Técnicas Utilizadas

#### SonarQube

Utilizamos a ferramenta **SonarQube** para análise estática de código, que fornece métricas detalhadas sobre segurança, confiabilidade, manutenibilidade e duplicação de código.

#### Como Usar:

1. Baixe o [SonarQube](https://www.sonarqube.org/downloads/)

2. Execute-o

3. Abra o navegador e acesse:

`http://localhost:9000`

4. Gere um token

5. Rode o seguinte comando no terminal:
```bash
mvn clean verify sonar:sonar 
 -Dsonar.host.url=http://localhost:9000   
 -Dsonar.token=SEU_TOKEN_AQUI
```
6. Acesse o resultado no seu navegador


#### Code Review via Pull Requests

Todos os testes e mudanças passam por revisão colaborativa no GitHub através de Pull Requests antes de serem integrados à branch `develop` e principalmente à `main`.

#### Análise de Cobertura (JaCoCo)

A ferramenta **JaCoCo** foi utilizada para análise de cobertura de código, identificando áreas com baixa cobertura e direcionando melhorias nos testes automatizados.

### Resultados Encontrados

- **354 linhas de código** analisadas
- **Segurança:** Nenhuma vulnerabilidade detectada, demonstrando boas práticas de segurança
- **Manutenibilidade:** Código limpo, com apenas 4 code smells menores
- **Duplicações:** Nenhuma duplicação de código
- **Confiabilidade:** Identificado 1 bug que requer correção para melhorar a confiabilidade do sistema

Em geral os resultados foram bem positivos, mas há uma grande ressalva: a maior parte da implementação do código foi feita
na classe de UI, o que demonstra péssima separação de responsabilidades. A lógica de negócio, validações e até chamadas
de API foram colocadas diretamente na camada de interface gráfica, o que fere princípios básicos de boas práticas, dificulta os testes automatizados, reduz a reutilização do código e torna a aplicação mais frágil a mudanças.
Em um cenário ideal, a UI deveria apenas exibir dados e captar interações, enquanto toda a lógica deveria estar isolada
em serviços ou controladores específicos.

## 🔧 Versionamento

### Estrutura das Pastas

        Currency-Converter/
        │
        ├── docs/                    
        │
        ├── src/
        │   ├── main/
        │   │   ├── java/com/github/blaxk3/
        │   │   │   ├── api/           # Classes responsáveis por chamadas externas (APIs)
        │   │   │   │   └── CurrencyRateAPI.java
        │   │   │   ├── converter/     # Lógica principal de conversão de moedas
        │   │   │   │   └── CurrencyConverter.java
        │   │   │   └── ui/            # Implementação da interface gráfica (UI)
        │   │   │       └── UI.java
        │   │   └── resources/         # Arquivos de recursos (caso necessário)
        │   │
        │   └── test/
        │       ├── java/com/github/blaxk3/
        │       │   ├── api/           # Testes relacionados à camada de API
        │       │   │   └── CurrencyRateAPITest.java
        │       │   └── ui/            # Testes da interface gráfica e filtros
        │       │       ├── NumericFilterTest.java
        │       │       └── UITest.java
        │
        ├── target/                    
        ├── .gitignore
        ├── LICENSE
        ├── pom.xml                   
        └── README.md


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

## 🌐 GitHub Pages

**[Link para a landing page do projeto]()**