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

A Distribuidora de gás e água deseja um sistema para gerenciamento de suas atividades de vendas e atendimento a clientes. O principal negócio da distribuidora é vender produtos como botijão de gás natural e galões de água mineral. Sobre botijas de gás, são comercializadas as de padrão para residências com 24 kilos, onde cada uma possui uma marca. Sobre galões de água mineral, também possuem uma marca e uma capacidade de 20 litros do tipo sem gás.

Os valores dos produtos variam conforme o seu tipo. Atualmente é cobrado um valor de 50,00 R$ para botijas de gás e de 9,00 R$ para galões de água mineral. O valor a ser pago ao registrar uma compra poderá ser modificado dependendo de descontos dados a clientes, que podem ser dados a clientes que adquirirem várias unidades de um mesmo produto.

Os produtos são vendidos a clientes que são pessoas físicas. Para a distribuidora é importante identificar cada cliente para controle, sendo que para cada cliente há um número de inscrição. De um cliente deseja-se ter o seu nome, endereço residencial, telefone podendo ser fixo ou celular. Cada cliente tem um status que informa se o mesmo é um cliente ativo da distribuidora. Por cliente ativo, entende-se ser aqueles que ainda realizam compras na distribuidora frequentemente.

Os produtos são adquiridos de fornecedores que são registrados para controle, havendo um número de registro para cada fornecedor da distribuidora. De uma distribuidora deseja-se ter o CNPJ, a razão social, o endereço e o telefone de contato. Os itens adquiridos tem uma data de aquisição, valor de compra e tipo do produto. O tempo de aquisição de produtos é definido pelo nível de tal produto disponível em estoque. Cada fornecedor possui um status que informa se o mesmo é um fornecedor ativo da distribuidora. Por distribuidor ativo, entende-se ser aqueles que ainda oferecem produtos à distribuidora.

Uma venda consiste em obter inicialmente o nome do cliente para verificar internamente seu endereço, caso não seja um cliente é realizado um novo cadastro. É especificado o produto vendido, em seguida a quantidade é informada, sendo o seu valor preenchido automaticamente dependendo do tipo do produto e da quantidade requerida. Em seguida é informado a data para pagamento (se no ato da compra ou à prazo). Pagamentos de compras são feitas exclusivamente em dinheiro e o recebimento pode ser feito no ato da entrega para vendas com pagamento à vista, onde o status de recebimento é alterado após o retorno do entregador ou na data de vencimento do prazo para compras à prazo, tendo o status de recebimento da venda alterado posteriormente. Uma venda é solicitada via telefone, onde o cliente liga para a distribuidora e tem seus dados registrados. Uma venda não pode ser realizada caso o cliente esteja em débito junto a distribuidora, ou seja, com venda possuindo status de pagamento pendente/a receber.

A distribuidora realiza entrega dos produtos vendidos utilizando o endereço cadastrados para o cliente. A ordem de prioridade de entrega é definida pela sequência de venda, sendo a primeira efetivação de compra a primeira a sair para entrega. Ao sair para entrega o status de recebimento da venda deve permanecer como pendente e após o retorno do entregador o status deverá ser atualizado para confirmado nos casos de vendas com recebimento à vista.

A distribuidora faz a administração dos cliente com pagamento pendente, verificando o vencimento de prazos para recebimento, e se houve o recebimento ou não do valor. No caso de prazo vencido e pagamento ainda não realizado o cliente é notificado sobre seu débito via telefone. Gerencia ainda os pedidos que são recebidos em um dia e os pedidos que já saíram para entrega. Gera ainda relatórios de vendas mensais para informações de despesas e lucros, bem como estimativas de vendas.

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
|RF12|Eu, como vendedor, quero permitir o gerenciamento de pedidos que já saíram para entrega para controle de entregas.|Could||
|RF13|Eu, como administrador, quero obter relatórios periódicos com a aquisição de produtos para estoque e de vendas para controle de gastos e lucros.|Could||
|RF14|Eu, como administrador, quero obter um histórico de clientes que já realizaram compras para controle de status de clientes ativos ou desativos.|Could||
|RF15|Eu, como administrador, quero obter um histórico de fornecedores que já forneceram seus produtos para controle de fornecedores ativos ou desativos.|Could||
|RF16|Eu, como administrador, quero cadastrar os produtos para obter informações sobre cada produto.|Should||


# Desenvolvimento do Sistema

## 2.    Projeto de Sistemas:
### 2.1  Projeto Arquitetural 
#### 2.1.1   Plataforma de Implementação e Tecnologias

No desenvolvimento desse sistema será necessária a utilização de algumas ferramentas, desde a parte de análise do sistema até a sua implementação. Para isso foram listadas abaixo tais tecnologias de acordo com sua área de utilização e sua fase de utilização.

* Linguagens:

UML (Unified Modeling Language): Utilizada para elaboração dos diagramas de caso de uso, classes e de sequencia.

Java: Utilizando a orientação a objeto para melhor definir as partes do sistema, sendo usada a JavaSE como ferramenta para criação e execução da aplicação desktop. 

SQL: Linguagem de consulta estruturada para banco de dados relacional.

* Ferramentas:

Diagramas: Astah - ferramenta de apoio para a modelagem UML.

IDE: Netbeans - Ambiente de desenvolvimento integrado, oferecendo as principais ferramentas para o desenvolvimento da aplicação desktop do sistema.

* Armazenamento de dados: 

SGBD: MySQL - sistema para gerenciar o banco de dados que será utilizado pelo sistema e que utiliza a linguagem SQL.


# Gestão de Projetos

## 2.    Cronograma macro de sprints 

Para a execução desse projeto foi estabelecido um tempo de acordo com as datas de entregas de cada etapa ao professor e considerando limitações como equipe e particularidades do projeto. Dessa forma foram definidos os seguintes sprints:

* 1º . Iniciando no dia 01/03/2017 e termina no dia 26/03/2017.
* 2º . Iniciando no dia 27/03/2017 e termina no dia 30/04/2017.
* 3º . Iniciando no dia 01/05/2017 e termina no dia 28/05/2017.
* 4º . Iniciando no dia 29/05/2017 e termina no dia 26/06/2017.

A definição da duração, conforme dita anteriormente, foi baseada nas entregas definidas para o trabalho, sendo estipulado para cada Sprint um total de horas divididas da seguinte forma:

|Etapa|Artefato|Estimativa de Esforço|Data Prevista de entrega|
|---|---|---|---|
|Planejamento|Busca de Cliente real|3|26/03|
|Planejamento|Análise de viabilidade de construção de sistema proposto|3|26/03|
|Planejamento|Elaboração de plano de Projeto|6|26/03|
|Elaboração|Análise – descrição do problema|3|26/03|
|Elaboração|Análise – Levantamento de Requisitos|6|26/03|
|Elaboração|Análise – Descrição de casos de uso|10|26/03|
|Elaboração|Análise – Modelagens|8|26/03|
|Elaboração|Projeto – Construção de diagrama de classe|6|30/04|
|Elaboração|Projeto – planejamento e descrição das tecnologias utilizadas.|3|30/04|
|Elaboração|Projeto – planejamento dos padrões de projeto utilizados|3|30/04|
|Construção|Definição de atividade de Cadastros (RF04, RF05, RF08, RF16)|10|30/04|
|Construção|Definição de atividade de ativação/desativação (RF06, RF07, RF09, RF10)|8|30/04|
|Construção|Definição de atividade de Venda (RF01, RF02, RF03)|10|28/05|
|Construção|Definição de atividade de Controle de pagamentos (RF02, RF03)|8|28/05|
|Construção|Definição de atividade de Controle de entregas (RF12)|6|28/05|
|Construção|Definição de atividade de Geração de relatórios (RF04, RF11, RF13, RF14, RF15)|10|28/05|
|Construção|Garantia de Qualidade na Gerência de Projeto|5|12/06|
|Construção|Garantia da Qualidade em Gerência de Requisitos|5|26/06|
|Construção|Garantia de Qualidade em Verificação e Validação|5|26/06|
|Construção|Garantia da Qualidade em Gerência e Configuração|5|26/06|
|Construção|Garantia da Qualidade em Manutenção|5|26/06|
|Construção|Realizar Teste de Sistema|5|26/06|

Totalizando 133 horas dedicadas ao projeto divididas por etapa como segue:

* 12 horas dedicadas para Planejamento;
* 39 horas dedicadas para Elaboração;
* 82 horas dedicadas para Construção;


