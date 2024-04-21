
# Design Patterns em Java

Este repositório contém código de exemplos e explicações dos principais tipos de design patterns, os mais utilizados. Especialmente em Java




## Tópicos

- [O que são Design Patternss?](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
- [Tipos de Design Patterns](https://github.com/matiassingers/awesome-readme)
- [Builder](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)
- [Factory Method](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)
- [Singleton](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)


## O que são Design Patterns?

São padrões de projetos que foram criados para solucionar problemas recorrentes da programação orientada a objetos. Esses padrões não são meros trechos de código, mas sim conceitos complexos que combinam estratégias para resolver um problema
existente.

São como receitas que os programadores compartilham para resolver desafios específicos de maneira eficiente e organizada.

Pense neles como instruções ou guias que ajudam os programadores a projetar e estruturar o código de forma mais clara e reutilizável. Assim como você pode seguir uma receita para fazer um bolo de chocolate, os design patterns fornecem diretrizes para escrever código de qualidade.

Esses padrões são desenvolvidos ao longo do tempo pela comunidade de desenvolvedores, e cada um deles aborda um problema comum de maneira específica. Eles ajudam os programadores a economizar tempo, evitar erros comuns e facilitar a manutenção do software ao longo do tempo.

## Tipos de Design Patterns

- **Creational:** Trata da criação de objetos, fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.

- **Structural:** relação entre os objetos e como eles interagem entre si, explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas estruturas flexíveis e eficientes.

- **Behavioral:** comunicação entre os objetos, em termos de responsabilidades e algoritmos. Chamadas de métodos etc.

## Builder `Creational`

- É um pattern que permite construir objetos complexos, com muitos parametros, passo a passo, o que permite criar diferentes tipos e representações de um mesmo objeto.

Vamos imaginar que você queira construir uma casa de Lego, mas não tem todas as peças necessárias de uma vez. Com o padrão Builder, você pode dividir a construção em etapas. Primeiro, você coloca o alicerce, depois as paredes, o telhado e assim por diante, até que sua casa esteja completa.

Na programação, o Builder é usado quando você precisa criar objetos que têm muitos parâmetros ou configurações. Em vez de passar todos esses parâmetros de uma vez, você usa um Builder para construir o objeto passo a passo, adicionando cada parte conforme necessário.

**Exemplo:** Neste exemplo temos uma classe Pessoa, onde são necessários diversos parametros no constutor, invés de digitarmos cada um, onde podemos confundir as ordens e passar dados incorretos, além de ficar incompreensivel, podemos cirar uma classe estática que vai servir de builder para nossa classe Pessoa.

``Dica: O pacote Lombook já possui uma notation que cria esse pattern. @Builder``

## Factory Method `Creational`

- Essencialmente, o padrão Factory Method é uma maneira de delegar a criação de objetos para subclasses, permitindo flexibilidade e organização no código.

Imagine que você tem uma fábrica de carros. Esta fábrica pode produzir diferentes modelos de carros, como sedan, SUV e caminhão. Cada modelo é construído em uma linha de produção específica, com máquinas e trabalhadores especializados para aquele tipo de carro.

Você pode ter uma classe base chamada "Factory" que possui um método chamado "createProduct". Esta classe é como a fábrica em si. Então, você tem subclasses dessa fábrica, como "CarFactory", "ToyFactory" e assim por diante. Cada subclasse sabe como criar um tipo específico de produto.

A "CarFactory" sabe como criar carros e pode produzir diferentes modelos de carros, como sedan, SUV e caminhão. Quando você precisa de um carro, você chama o método "createProduct" da "CarFactory" e ela retorna o tipo certo de carro que você precisa.

**Exemplo:** Neste exemplo temos 2 tipos de Produtos, Digitais e Físicos, ambos herdam da classe mãe "Produto", se quisermos setar o tipo de Produto precisamos chamar a função "setPossuiDimensoesFisicas", o que está suscetível a erros de quem esta usando a classe como cliente. Para contornar isso, criamos uma Fábrica, onde possui um metodo estático getInstance, onde passamos apenas o tipo do produto e ele retorna uma instância correta do objeto que desejamos.