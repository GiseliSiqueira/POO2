# TRABALHO INTEGRADO: Nossa Distribuidora

Trabalho desenvolvido durante a disciplina de:
- Programação Orientada a Objetos 2


**INTEGRANTES DO GRUPO:** 
- Giseli Nunes Siqueira

        
# Sumário


# Gerência de Requisitos

## 1	Motivação e Propósito do Sistema 

A distribuidora de gás e água necessita de um sistema de informação para gerenciar suas atividades principais que são: Venda de gás e de água. Sendo necessário para seu controle o gerenciamento de informações dos produtos comercializados pela mesma, bem como dos seus clientes e fornecedores. Além desse gerenciamento, deve ser possível realizar consultas de vendas e de prazos para recebimento das realizadas à prazo e de estoque, verificando seu nível.

## 3	Minimundo 

A Distribuidora de gás e água deseja um sistema para gerenciamento de suas atividades de vendas e atendimento a clientes. O principal negócio da distribuidora é vender produtos como botijão de gás natural e galões de água mineral. Sobre botijas de gás, são comercializadas as padrão para residências. Sobre galões de água mineral, são comercializadas as de 20 litros sem gás.

Os valores dos produtos variam conforme o seu tipo. Atualmente é cobrado um valor de 50,00 R$ para botijas de gás e de 9,00 R$ para galões de água mineral. O valor a ser pago ao registrar uma compra poderá ser modificado dependendo de descontos dados a clientes.

Os produtos são vendidos a clientes que são pessoas físicas maiores de 18 anos. Para a distribuidora é importante identificar cada cliente para controle, sendo que para cada cliente há um número de inscrição. De um cliente deseja-se ter o seu nome, endereço residencial, telefone fixo e celular.

Os produtos são adquiridos de fornecedores que são registrados para controle, havendo um número de registro par cada fornecedor da distribuidora. De uma distribuidora deseja-se ter o CNPJ, a razão social, o endereço e o telefone de contato. Os itens adquiridos tem uma data de aquisição, valor de compra e tipo do produto. O tempo de aquisição de produtos é definido pelo nível de tal produto disponível em estoque.

Uma venda consiste em obter inicialmente o nome do cliente para verificar internamente seu endereço, caso não seja um cliente é realizado um novo cadastro. É especificado o produto vendido e seu valor, incluindo seu pagamento (se no ato da compra ou à prazo). Pagamentos de compras são feitas exclusivamente em dinheiro. Uma venda é solicitada via telefone, onde o cliente liga para a distribuidora e tem seus dados registrados. Uma venda não pode ser realizada caso o cliente esteja em débito junto a distribuidora.

A distribuidora realiza entrega dos produtos vendidos utilizando o endereço cadastrados para o cliente. A ordem de prioridade de entrega é definida pela sequência de venda, sendo a primeira efetivação de compra a primeira a sair para entrega.

A distribuidora faz a administração dos cliente com pagamento pendente, verificando o vencimento de prazos para recebimento, verificando o recebimento ou não do valor. No caso de prazo vencido e pagamento ainda não realizado o cliente é notificado sobre seu débito via telefone. Gerencia ainda os pedidos que são recebidos em um dia e os pedidos que já saíram para entrega.

## 4	Requisitos de Usuários

Tomando por base o contexto do sistema, foram identificados os seguintes requisitos de usuário: 

### 4.1	Requisitos Funcionais (Histórias de Usuário)

|ID|Descrição|Prioridade|Pontos|
|---|---|---|---|
|RF01|Eu, como vendedor, quero controlar as vendas de gás e água, registrando clientes com seus respectivos endereços e telefone para contato, bem como valor da compra, data tanto de compra como de pagamento e status de entrega para registrar vendas e adicionar clientes.|Must||
|RF02|Eu, como vendedor, quero registrar o pagamento das compras, seja no ato da entrega do produto ou no vencimento do prazo para controlar os recebimentos das vendas realizadas.|Must||
|RF03|Eu, como vendedor, quero registrar o prazo para recebimento de pagamento de compras a prazo, informando sobre o vencimento de prazos para controle de recebimento de vendas à prazo.|Should||
|RF04|Eu, como administrador, quero controlar o estoque, registrando entradas e saídas de produtos e informando a necessidade de aquisição de novos produtos quando o nível chegar a um determinado total para controlar os níveis de estoque bem como reposições.|Could||
|RF05|Eu, como administrador, quero registrar os fornecedores de gás e água para manter registros de todos os fornecedores que já forneceram produtos.|Should||
|RF06|Eu, como administrador, quero permitir que fornecedores sejam desativados para conhecimento de quais fornecedores não fornecem mais produtos, mas mantê-los na base de dados.|Could||
|RF07|Eu, como administrador, quero permitir que fornecedores sejam reativados para que fornecedores já cadastrados na base de dados sejam fornecedores ativos no fornecimento de produtos.|Could||
|RF08|Eu, como vendedor, quero realizar o gerenciamento dos clientes da distribuidora para inserir dados de novos clientes na base de dados de clientes.|Should||
|RF09|Eu, como administrador, quero permitir que clientes sejam desativados para garantir que clientes que não estão mais ativos permaneçam na base de dados de clientes.|Could||
|RF10|Eu, como administrador, quero permitir que os clientes sejam reativados para que clientes já inseridos na base de dados possam ser clientes ativos.|Could||
|RF11|Eu, como administrador, quero realizar o monitoramento de pedidos recebidos por dia para obter estimativas de vendas diárias.|Could||
|RF12|Eu, como administrador, quero permitir o gerenciamento de pedidos que já saíram para entrega para controle de entregas.|Could||
|RF13|Eu, como administrador, quero obter relatórios periódicos com a aquisição de produtos para estoque e de vendas para controle de gastos e lucros.|Could||


# Desenvolvimento do Sistema

## 2.    Projeto de Sistemas:
### 2.1  Projeto Arquitetural 
#### 2.1.1   Plataforma de Implementação e Tecnologias

descrever tecnologias usadas no sistema, justificando cada uma delas com base no contexto


# Gestão de Projetos

## 2.    Cronograma macro de sprints 
datas dos sprints.

