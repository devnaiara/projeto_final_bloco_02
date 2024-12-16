# Projeto Final Bloco 2: Sistema de Comércio Eletrônico para Farmácia

## Descrição do Projeto
Este projeto consiste no desenvolvimento de um **Sistema de Comércio Eletrônico para uma Farmácia**, utilizando o framework **Spring Boot** e os conhecimentos adquiridos durante o Bloco 2. A aplicação permite gerenciar produtos e categorias de forma eficiente, com um CRUD completo para cada recurso, além de um relacionamento entre eles no banco de dados.

1. **Recursos:**
   - **Categoria:** CRUD completo com os métodos de criação, leitura, atualização, exclusão e listagem.
   - **Produto:** CRUD completo, com relacionamento bidirecional do tipo "Um para Muitos" com o recurso Categoria.

2. **Banco de Dados:**
   - Relacionamento entre as tabelas de Categoria e Produto implementado no banco de dados.

## Etapas do Desenvolvimento

### Configuração do Projeto e Banco de Dados
- Criar um repositório no GitHub com o nome `projeto_final_bloco_02`.
- Configurar o projeto Spring Boot e o banco de dados.
- Realizar os testes iniciais da aplicação.
- Atualizar a branch `01_Configurando_Projeto` com o conteúdo desenvolvido.

---

### CRUD para Categoria (Sem Relacionamento)
- Criar a branch `02_CRUD_Categoria`.
- Implementar o CRUD completo para o recurso Categoria.
- Testar a aplicação utilizando ferramentas como **Insomnia**.
- Atualizar a branch `02_CRUD_Categoria` com o conteúdo desenvolvido.

---

### CRUD para Produto (Com Relacionamento)
- Criar a branch `03_CRUD_Produto_Relacionamento`.
- Implementar o CRUD completo para o recurso Produto.
- Criar o relacionamento do tipo **OneToMany bidirecional** entre Produto e Categoria.
- Habilitar o relacionamento no recurso Categoria.
- Testar a aplicação com ferramentas como **Insomnia**.
- Atualizar a branch `03_CRUD_Produto_Relacionamento` com o conteúdo desenvolvido.

---

## Tecnologias Utilizadas

- **Linguagem de Programação:** Java 17
- **Framework:** Spring Boot
- **Banco de Dados:** MySQL
- **Ferramentas de Teste:** Insomnia
- **Controle de Versão:** Git/GitHub

## Estrutura do Projeto

- **Model:** Define as entidades `Produto` e `Categoria`.
- **Repository:** Interface para acesso e manipulação de dados no banco.
- **Controller:** Gerencia as requisições HTTP e expõe os endpoints do sistema.

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/projeto_final_bloco_02.git
   ```

2. Acesse a pasta do projeto:
   ```bash
   cd projeto_final_bloco_02
   ```

3. Configure o banco de dados no arquivo `application.properties`.

4. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

5. Utilize o Insomnia ou outra ferramenta de teste para acessar os endpoints.

