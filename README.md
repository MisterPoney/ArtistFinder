# ArtistFinder

Objetivo:

Desenvolver sistema de cadastro de agendamentos de teste para atores e artistas, onde o usuário possa entrar, criar testes para pessoas se inscreverem. Os artistas que se inscreverem, mandaram um video teste para os produtores, se o video teste for aprovado pelo produtor, ele podera fazer um agendamento para uma reniao com o artista. O produtor pode cadastrar Diretores e outras pessoas.

 

Requisito de negócio:

- Tela para cadastrar, editar e deletar clientes tendo os seguintes campos: nome, email e telefone;

- Não permitir o usuário cadastrar/editar clientes com o mesmo email e telefone;

- Tela para cadastrar agendamentos tendo os seguintes campos: cliente, data de início e data de fim;

- Não permitir o usuário cadastrar agendamentos no mesma faixa de horário;

- Todas as regras de negócio devem estar no backend;

- Caso alguma das regras citadas anteriormente não for atendida, deve ser gerado um alerta em tela para o usuário;

 

Requisitos Técnicos:

- Usar Docker

- Utilizar Angular na versão 14 para o frontend

- Utilizar Spring Boot na versão 3 para o backend

- Testes no frontend com Jasmine ou Jest (100% de cobertura)

- Testes no backend com JUnit, sendo unitários e de isolamento (100% de cobertura)

- Utilizar MongoDB como banco de dados

 