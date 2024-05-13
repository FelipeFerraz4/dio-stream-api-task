# dio-stream-api-task

## Stream Api

- A ``Streams API`` traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional.
- Stream, trata-se de uma poderosa solução para processar coleções de maneira declarativa, ao invés da tradicional forma imperativa.
- Combinada com as `Expressões Lambda` e ``Method reference``, eles proporcionam uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.

## As operações na Stream API podem ser classificadas em duas categorias principais

### Operações Intermediárias

- Operações Intermediárias são aquelas que retornam uma nova Stream e permitem encadear várias operações, formando um pipeline de processamento de dados.

  - ``filter``(Predicate<T> predicate): Filtra os elementos da Stream com base em um predicado. Retorna uma nova Stream contendo apenas os elementos que atendem ao critério do predicado. Exemplo:  stream.filter(n -> n > 5).
  - ``map``(Function<T, R> mapper): Transforma cada elemento da Stream usando a função especificada e retorna uma nova Stream contendo os elementos resultantes. Exemplo: stream.map(s -> s.toUpperCase())
  - ``sorted``(): Classifica os elementos da Stream em ordem natural (se os elementos forem comparáveis) ou de acordo com um comparador fornecido. Exemplo: stream.sorted()
  - ``distinct``(): Remove elementos duplicados da Stream, considerando a implementação do método equals() para comparação. Exemplo: stream.distinct()
  - ``limit``(long maxSize): Limita o número de elementos da Stream aos maxSize primeiros elementos Exemplo: stream.limit(10)
  - ``skip``(long n): Pula os primeiros n elementos da Stream e retorna uma nova Stream sem eles. Exemplo: stream.skip(5)

### Operações Terminais

- Operações Terminais são aquelas que encerram o pipeline e produzem um resultado final.

  - forEach(Consumer<T> action): Executa uma ação para cada elemento da Stream. Exemplo: stream.forEach(System.out::println)
  - toArray(): Converte a Stream em um array contendo os elementos da Stream. Exemplo: stream.toArray()
  - collect(Collector<T, A, R> collector): Coleta os elementos da Stream em uma estrutura de dados específica, como uma lista ou um mapa. Exemplo: stream.collect(Collectors.toList())
  - count(): Retorna o número de elementos na Stream. Exemplo: stream.count()
  - anyMatch(Predicate<T> predicate): Verifica se algum elemento da Stream atende ao predicado especificado. Exemplo: stream.anyMatch(s -> s.startsWith("A"))
  - allMatch(Predicate<T> predicate): Verifica se todos os elementos da Stream atendem ao predicado especificado. Exemplo: stream.allMatch(n -> n > 0)
  - noneMatch(Predicate<T> predicate): Verifica se nenhum elemento da Stream atende ao predicado especificado. Exemplo: stream.noneMatch(s -> s.isEmpty())
  - min(Comparator<T> comparator) e max(Comparator<T> comparator): Encontra o elemento mínimo e máximo da Stream, respectivamente, de acordo com o comparador fornecido. Exemplo: stream.min(Comparator.naturalOrder()) ou stream.max(Comparator.naturalOrder())
  - reduce(T identity, BinaryOperator<T> accumulator): Combina os elementos da Stream usando o acumulador especificado e retorna o resultado final. Exemplo: stream.reduce(0, (a, b) -> a + b)

## Lambda

- As expressões lambda permitem representar interfaces funcionais (interfaces com um único método abstrato) de forma mais concisa e possibilitam escrever código no estilo funcional.
- Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado.
- As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).

## Method Reference

- Method Reference é um novo recurso do Java 8 que permite fazer referência a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legível.
- Para utilizá-lo, basta informar uma classe ou referência seguida do símbolo “::” e o nome do método sem os parênteses no final.

## As interfaces funcionais

- desempenham um papel crucial na programação funcional em Java, especialmente no contexto do Stream API. Aqui está uma visão geral das principais interfaces funcionais relacionadas ao Stream:

  - Predicate: A interface Predicate é uma interface funcional que representa um predicado (uma condição que pode ser avaliada como verdadeira ou falsa) sobre um tipo de entrada. Na Stream API, é comumente usada em operações de filtragem, como filter() e allMatch(), para testar se os elementos satisfazem uma determinada condição.

  - Function: A interface Function representa uma função que aceita um argumento de entrada e retorna um resultado. Ela é frequentemente usada em operações de mapeamento, como map(), para transformar os elementos de uma stream em outros valores.

  - Consumer: A interface Consumer representa uma operação que aceita um argumento de entrada e não retorna nenhum resultado. Na Stream API, é comumente usada em operações de terminal, como forEach(), para consumir (ou seja, realizar uma ação) em cada elemento da stream.
    - Ela é usada principalmente para realizar uma ação em cada elemento de uma coleção, stream ou qualquer outro tipo de dado.
    - Por exemplo, você pode usar um Consumer para imprimir todos os elementos de uma lista

  - Supplier: A interface Supplier representa uma função que não aceita nenhum argumento de entrada, mas retorna um resultado. Na Stream API, é usada para fornecer elementos para uma stream, como em generate().
    - Por exemplo, você pode usar um Supplier para fornecer uma sequência de números aleatórios:

  - Comparator: Embora não seja exclusiva do Stream API, a interface Comparator é frequentemente utilizada em operações de classificação, como sorted(), para fornecer uma ordem personalizada para os elementos de uma stream.

## Class Optional

- O objetivo da classe Optional no Java é fornecer uma abordagem mais segura e expressiva para tratar casos em que um valor pode ser ausente (nulo).
- Ela foi introduzida a partir do Java 8 para evitar o temido NullPointerException (NPE) que é comum quando se trabalha com referências nulas.
- Optional permite encapsular um valor que pode ser nulo dentro de um objeto Optional.
- Isso indica explicitamente que o valor pode ou não estar presente e requer que o código que deseja acessá-lo faça uma verificação explícita.

### funções mais usada

- ``of(value)``: Cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção NullPointerException.

    ````
    Optional<String> optionalValue = Optional.of("Hello");
    System.out.println(optionalValue.get());
    ````

- ``ofNullable(value)``: Cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo.

    ````
    String nullableValue = null;
    Optional<String> optionalValue = Optional.ofNullable(nullableValue);
    System.out.println(optionalValue.isPresent());
    ````

- ``empty()``: Retorna um Optional vazio (sem valor).

    ````
    Optional<String> optionalValue = Optional.empty();
    System.out.println(optionalValue.isPresent());
    ````

- ``isPresent()``: Verifica se o Optional contém um valor não nulo.

    ````
    Optional<String> optionalValue = Optional.of("Hello");
    System.out.println(optionalValue.isPresent());
    ````

- ``isEmpty()`` (A partir do Java 11): Verifica se o Optional está vazio (não contém um valor não nulo).

    ````
    Optional<String> optionalValue = Optional.ofNullable(null);
    System.out.println(optionalValue.isEmpty());
    ````

- ``get()``: Obtém o valor contido no Optional. Se o valor for nulo, lançará uma exceção NoSuchElementException.

    ````
    Optional<String> optionalValue = Optional.of("Hello");
    System.out.println(optionalValue.get());
    ````

- ``orElse(defaultValue)``: Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio.

    ````
    Optional<String> optionalValue = Optional.ofNullable(null);
    String result = optionalValue.orElse("Default");
    System.out.println(result);
    ````

- ``orElseGet(supplier)``: Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio.

    ````
    Optional<String> optionalValue = Optional.ofNullable(null);
    String result = optionalValue.orElseGet(() -> "Value from Supplier");
    System.out.println(result);
    ````

- ``orElseThrow(exceptionSupplier)``: Obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.

    ````
    Optional<String> optionalValue = Optional.ofNullable(null);
    String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
    ````

- ``ifPresent(consumer)``: Executa uma ação fornecida por um Consumer se o Optional contiver um valor.

    ````
    Optional<String> optionalValue = Optional.of("Hello");
    optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
    ````

## Referências

- "Java Platform, Standard Edition 17 - Class Optional." Oracle. Disponível em: <https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Optional.html>.
- "Java 8 Functional Interfaces." Baeldung. Disponível em: <https://www.baeldung.com/java-8-functional-interfaces>.
- "Como utilizar uma classe anônima em Java." FAQ CartX. Disponível em: <https://faqcartx.info/programa%C3%A7%C3%A3o/40977-como-utilizar-uma-classe-an%C3%B4nima-em-java.html>.
- "Java Stream API - Oracle." Oracle Brasil. Disponível em: <https://www.oracle.com/br/technical-resources/articles/java-stream-api.html>.
- "Java Collections API Examples - cami-la." GitHub. Disponível em: <https://github.com/cami-la/collections-java-api-2023>.
- "Como usar funções functional_interface em Java - DevMedia." DevMedia. Disponível em: <https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826>.
- "Ganhando Produtividade com Stream API e Java - cami-la." GitHub. Disponível em: <https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java>
