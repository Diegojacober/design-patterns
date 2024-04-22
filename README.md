
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

## Singleton `Creational`

- O Singleton é um padrão de projeto que permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância. Resolve o problema do principio de responsabilidade unica (o **S** de **S**OLID)

Imagine que você tem uma casa com uma sala que só pode ser acessada por uma chave especial. O padrão Singleton garante que, no mundo da programação, uma classe tenha apenas uma instância, assim como só há uma chave para essa sala especial na casa.

Isso é útil quando você tem um objeto que precisa ser compartilhado por todo o seu programa, como um registro de eventos ou uma conexão com um banco de dados. Com o Singleton, você pode ter certeza de que sempre estará trabalhando com a mesma instância desse objeto em todo o seu código.

É como garantir que, independentemente de quantas vezes você tente abrir a sala especial, você sempre acabará na mesma sala, porque só há uma chave para ela.

#### Tipos de Singleton

- **Singleton Eager**: Imagine que você tem um bolo pronto antes mesmo de sentir vontade de comê-lo. O Singleton Eager cria a instância única da classe assim que o programa é iniciado, independentemente de ser usada imediatamente ou não. Isso garante que a instância esteja sempre disponível, mas pode desperdiçar recursos se a classe for complexa e não for necessária no início do programa.

- **Singleton Lazy**: Agora, pense em fazer o bolo apenas quando realmente tiver vontade de comê-lo. O Singleton Lazy cria a instância única da classe somente quando é solicitada pela primeira vez. Isso economiza recursos, pois a instância é criada apenas quando necessária, mas pode causar problemas de concorrência em ambientes multithread, a menos que seja tratado corretamente.

- **Singleton Enum**: Aqui, imagine que você tem um bolo que é sempre preparado do mesmo jeito, sem precisar decidir entre diferentes receitas. O Singleton Enum aproveita a garantia de que os valores de enumeração em Java são instanciados apenas uma vez em um contexto de carregamento de classe. Isso garante a criação de um singleton seguro e eficiente, sem preocupações com concorrência ou inicialização preguiçosa.

**Exemplo:** Neste exemplo temos uma agenda, onde queremos deixar alguns dias como disponiveis ou não, onde temos que sempre ter a mesma instancia da agenda para ocupar os dias em sequência. Temos exemplo em Eager, Lazy e com Enum. 