
# Design Patterns em Java

Este repositório contém código de exemplos e explicações dos principais tipos de design patterns, os mais utilizados. Especialmente em Java




## Tópicos

- [O que são Design Patternss?](https://github.com/Diegojacober/design-patterns?tab=readme-ov-file#o-que-s%C3%A3o-design-patterns)
- [Tipos de Design Patterns](https://github.com/Diegojacober/design-patterns?tab=readme-ov-file#tipos-de-design-patterns)
- [Builder](https://github.com/Diegojacober/design-patterns?tab=readme-ov-file#builder-creational)
- [Factory Method](https://github.com/Diegojacober/design-patterns?tab=readme-ov-file#factory-method-creational)
- [Singleton](https://github.com/Diegojacober/design-patterns?tab=readme-ov-file#singleton-creational)
- [Proxy](https://github.com/Diegojacober/design-patterns?tab=readme-ov-file#proxy-structural)
- [Adapter](https://github.com/Diegojacober/design-patterns?tab=readme-ov-file#adapter-structural)


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

### Prototype `Creational`

- O Prototype é um padrão de projeto que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.

Imagine que você tem um brinquedo, digamos, um carrinho de controle remoto. Agora, você quer fazer outro carrinho exatamente igual, com as mesmas características, mas sem começar do zero. O padrão Prototype é como fazer uma cópia exata desse carrinho sem precisar construí-lo do início.

Na programação, o padrão Prototype permite que você crie novos objetos copiando um objeto existente, chamado de protótipo. Em vez de criar um novo objeto e definir todas as suas características novamente, você simplesmente copia o protótipo e faz as modificações necessárias, se desejar.

Isso é útil quando você tem objetos complexos ou caros de se criar, e deseja uma maneira fácil de criar novas instâncias baseadas em um modelo existente.

**Exemplo:** Temos de código exemplo uma possivel aplicação de interface onde temos botões com configurações pré-definidas, e queremos clonar esses botões, não precisamos criar uma classe para cada tipo de botão nem instanciar um novo tipo e setar todas as configurações novamente.

### Proxy `Structural`

- O Proxy permite que você forneça um substituto ou um espaço reservado para outro objeto. Um proxy controla o acesso ao objeto original, permitindo que você faça algo ou antes ou depois do pedido chegar ao objeto original.

Imagine que deseja ir a uma festa exclusiva, mas não pode simplesmente aparecer na porta. Em vez disso, você precisa de alguém para interagir com os organizadores da festa por você e garantir sua entrada. Esse "alguém" atuando em seu nome é como um proxy.

Na programação, o padrão Proxy funciona de maneira semelhante. Ele atua como um intermediário entre você (o cliente) e o objeto que você deseja acessar. Isso pode ser útil em várias situações, como controle de acesso, verificação de autorização, ou para adicionar funcionalidades adicionais sem modificar diretamente o objeto original.

digamos que você tenha uma imagem grande que leva muito tempo para carregar. Em vez de carregá-la imediatamente, você pode usar um proxy para exibir uma versão menor da imagem primeiro e, em seguida, carregar a versão completa apenas quando necessário.

**Exemplo:** Temos o seguinte desafio, criar logs para uma aplicação ja existente, mas temos como limitação, não poder mexer diretamente na classe responsável pela interação com o banco de dados (repository) para contornar o desafio, criamos uma classe que herda o repository e estende a interface de proxy e implementamos o método como desejamos sem comprometer o que ja havia sido feito anteriormente.

### Adapter `Structural`

- O Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si.

O padrão Adapter é como esse adaptador. Ele permite que objetos com interfaces incompatíveis trabalhem juntos. Por exemplo, se você tem uma classe que espera uma interface específica para funcionar corretamente, mas deseja usar outra classe que tenha uma interface diferente, você pode usar um adaptador para fazer a ponte entre elas.

Em termos mais técnicos, o adaptador envolve um objeto existente e fornece uma interface diferente para ele, para que possa ser usado de maneira transparente por outros objetos que esperam essa nova interface.

Em resumo, o padrão Adapter é como um adaptador físico que permite que dispositivos com diferentes interfaces se conectem. Ele ajuda a integrar classes ou objetos que, de outra forma, não poderiam trabalhar juntos devido a diferenças em suas interfaces.

**Exemplo:** No nosso exemplo de código temos uma classe que interaje com um jar, esse jar serve e é util porem não funciona da forma que desejamos, então utilizamos os métodos já existentes dele para criarmos uma adaptação. 
