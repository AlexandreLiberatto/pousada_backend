
---

# Pousada Backend

Este projeto é uma API de backend para um sistema de gerenciamento hoteleiro, desenvolvido em **Java** utilizando o framework **Spring Boot**. Ele permite o controle eficiente de reservas, hóspedes, disponibilidade de quartos, e formas de pagamento, proporcionando uma gestão centralizada e eficaz para hotéis e pousadas.

## Funcionalidades
- **Cadastro de Hóspedes**: Inclusão e atualização de dados.
- **Gerenciamento de Quartos**: Acompanhamento de status (Livre/Ocupado).
- **Reserva e Check-in**: Registro de estadias com controle de pagamento.
- **Formas de Pagamento**: Dinheiro, Pix e cartão.

## Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot**
- **Maven** (gerenciamento de dependências)
- **H2 Database** (banco de dados embutido)

## Estrutura do Projeto
- **/src**: Código-fonte da aplicação.
- **/resources**: Arquivos de configuração e scripts SQL.
- **pom.xml**: Arquivo de configuração do Maven.

## Como Executar Localmente
1. Clone o repositório:
   ```bash
   git clone https://github.com/AlexandreLiberatto/pousada_backend.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd pousada_backend
   ```
3. Compile e inicie a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Acesse a API em: `http://localhost:8080`

## Contribuições
Contribuições são bem-vindas! Abra uma **issue** para sugestões ou **pull requests** com melhorias.

## Licença
Este projeto é distribuído sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.

---
