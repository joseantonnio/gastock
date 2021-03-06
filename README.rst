================================
GASTOCK - Controle de Estoque
================================

Trabalho da disciplina de **Linguagem de Programação III** do curso de Análise e Desenvolvimento de Sistemas do
Instituto Federal de Educação, Ciência e Tecnologia de São Paulo - Campus São Carlos. Disciplina mestrada pelo
Prof. Dr. Carlos José De Almeida Pereira a.k.a. *Carlão* e Prof. Dr. Rodrigo Elias Bianchi a.k.a. *Bianchi*.

Objetivo
--------

Controlar o estoque de combustíveis em Postos de Abastecimento é uma trafera basicamente impossível sem o auxilio de meios eletrônicos nos dias de hoje. A ideia desse projeto é fornecer, de uma maneira segura e confiável, relatórios e telas que auxiliem os funcionários a realizarem esse controle.

Introdução
--------------------

Segundo a Wikipédia, um posto de abastecimento, posto de serviços, ou posto de combustível é uma instalação que vende combustível e lubrificantes para veículos a motor. Os tipos mais comuns de combustível vendidos são gasolina ou diesel (gasóleo).

Alguns postos (no Brasil, inclusive), fornecem combustíveis alternativos tais como álcool (etanol combustível), butano (GLP), gás natural e biodiesel. Outros oferecem hidrogênio e querosene.

O GASTOCK será dividido em dois sistemas, o primeiro será uma simulação de um sistema embarcado, onde existirá um terminal que o usuário irá digitar a quantidade de combustível que será liberado para seu veículo.

.. figure:: https://raw.githubusercontent.com/joseantonnio/gastock/master/Apresenta%C3%A7%C3%A3o%201/terminal.jpg
   :alt: map to buried treasure

   Exemplo do sistema Embarcado
   
Esse sistema embarcado irá realizar o armazenamento das informações da bomba de combustvível no banco de dados e irá travar/destravar a bomba.

Já o segundo sistema será o de gerenciamento de estoque de combustíveis, que **irá** controlar 3 tipos de combustíveis: gasolina, álcool e diesel. Cada combustível também terá uma quantidade de bombas que serão gerenciadas pelo sistema. O segundo sistema também **irá** exibir um relatório de combustíveis vendidos, disponíveis e quais estão próximos do limite mínimo, e um relatório básico de vendas. Este, por sua vez, **não** irá exibir relatórios de faturamento, **não** realizará o controle de caixa e **não** realizará qualquer controle administrativo de posto de abastecimento com exceção dos itens listados anteriormente.
