# Desafio Itaú - API de Transações & Estatísticas (Java 10x)

Este projeto foi desenvolvido como parte do treinamento e desafio **Java 10x**, simulando um sistema de alta performance para o Itaú. A API é responsável por receber transações financeiras, aplicar validações rigorosas de negócio em tempo real e expor um endpoint para o cálculo de estatísticas agregadas (como soma, média, valores mínimo e máximo, e quantidade) dos últimos 60 segundos.

O projeto utiliza o ecossistema **Spring Boot** e é focado em boas práticas de programação, injeção de dependências e manipulação limpa de dados.

---

## 🚀 Tecnologias Utilizadas

* **Java 17** (ou superior)
* **Spring Boot 3.x**
    * `Spring Web` (para criação dos endpoints REST)
* **Lombok** (para redução de código boilerplate como Getters, Setters e Construtores)
* **Apache Maven** (gerenciador de dependências e build)
* **NetBeans / IntelliJ IDEA** (Ambientes de Desenvolvimento)

---

## 📦 Estrutura do Projeto

O código está organizado dentro do pacote principal `com.mycompany.itaujava10xapplication`:

* `ItauJava10xApplication.java`: Classe principal que inicializa a aplicação Spring Boot.
* `TransacoesController.java`: Camada de controle REST que expõe o endpoint `/transacao` para receber novas requisições POST.
* `TransacaoService.java`: Camada de serviço onde ficam isoladas todas as regras de negócio e validações críticas da aplicação.
* `TransacaoRequest.java`: DTO (Data Transfer Object) ou classe de requisição que mapeia e captura os dados de entrada enviados pelo usuário no JSON.
* `Transacao.java`: Modelo/Entidade que representa a estrutura interna de uma transação financeira no sistema.
* `EstatisticaDTO.java`: Objeto de transferência de dados configurado para retornar os cálculos consolidados da API (Soma, Média, Mínimo, Máximo e Contagem).

---

## 🛠️ Regras de Negócio Implementadas

Na camada de serviço (`TransacaoService`), todas as transações passam por validações automáticas antes de serem aceitas pelo sistema:

1.  **Dados Completos:** O corpo da requisição, o valor e a data/hora não podem ser nulos ou vazios.
2.  **Valor Válido:** O valor da transação deve ser estritamente maior ou igual a zero (`>= 0`). Transações com valores negativos são rejeitadas imediatamente.
3.  **Data Consistente:** A data e hora da transação não podem estar no futuro (devem ser menores ou iguais ao momento presente `OffsetDateTime.now()`).

---

## 🛣️ Endpoints da API

### 1. Adicionar Transação
Recebe uma nova transação financeira e aplica as validações.

* **HTTP Method:** `POST`
* **Endpoint:** `/transacao`
* **Corpo da Requisição (JSON):**
    ```json
    {
      "valor": 1250.50,
      "dataHora": "2026-05-24T19:00:00.000-03:00"
    }
    ```
* **Códigos de Retorno:**
    * `201 Created`: Transação recebida, validada com sucesso.
    * `400 Bad Request`: Dados incorretos, valores negativos ou data no futuro.

---

## 🔧 Configuração Importante (Lombok)

Este projeto utiliza o **Lombok** para gerar automaticamente métodos essenciais através das anotações `@Data`, `@Getter`, `@NoArgsConstructor` e `@AllArgsConstructor`.

Caso sua IDE (como NetBeans ou IntelliJ) exiba linhas vermelhas indicando que os métodos `getValor()` ou `getDataHora()` não existem, certifique-se de ativar a seguinte opção:
1. Vá em **Propriedades do Projeto** -> **Build** -> **Compiling**.
2. Marque a caixa **"Enable Annotation Processing"** (Habilitar Processamento de Anotações).
3. Execute um **Clean and Build** no projeto.

---

## 👨‍💻 Autor

Desenvolvido por **David** durante o treinamento prático de desenvolvimento de microsserviços em Java.
