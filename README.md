# Voll Med - API REST

Este projeto é uma API REST desenvolvida utilizando Java Spring, com o objetivo de simular o cadastro de médicos e pacientes, bem como o agendamento de consultas médicas. O sistema inclui classes de validação de regras de negócio para garantir a integridade das operações de agendamento de consultas.

## Objetivo

O objetivo principal deste projeto é fornecer uma plataforma para agendamento de consultas médicas, permitindo que médicos e pacientes possam cadastrar-se no sistema, visualizar informações relevantes e realizar o agendamento de consultas de forma eficiente.

## Funcionalidades

O sistema inclui as seguintes funcionalidades:

- **Cadastro de Médicos e Pacientes**: Médicos e pacientes podem cadastrar-se no sistema, fornecendo informações básicas, como nome, email e especialidade (para médicos).
- **Agendamento de Consultas**: Pacientes podem agendar consultas com médicos disponíveis, escolhendo a data e horário desejados.
- **Validações de Regras de Negócio**: Implementação de classes de validação para garantir a integridade das operações de agendamento, incluindo verificações de disponibilidade de médicos e conflitos de horário.

## Tecnologias Utilizadas

O projeto utiliza as seguintes tecnologias:

- **Java Spring Boot**: Utilizado como o framework principal para o desenvolvimento da API, fornecendo uma estrutura robusta e eficiente.
- **Spring Data JPA**: Utilizado para interagir com o banco de dados, facilitando as operações de persistência.
- **Spring Security**: Utilizado para lidar com a autenticação e autorização dos usuários na API.
- **Swagger UI**: Utilizado para gerar uma documentação interativa da API.

