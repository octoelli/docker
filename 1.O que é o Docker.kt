Com certeza você já ouviu uma famosa frase 'Na minha máquina funciona'... então se na sua máquina funciona, por que não enviar ela para produção?

Pois bem, o que o Docker faz é parecido com isto. Em termos gerais ele abstrai a infraestrutura das aplicações através de imagens prontas.

O que temos são basicamente 'máquinas virtuais' de baixo custo rodando somente com a infraestrutura das nossas aplicações.

Por exemplo, uma das imagens mais famosas que temos no Docker é a Alpine, que contém apenas 5MB.

Esta imagem contém apenas o Core do sistema operacional, no caso Linux, que a maioria das aplicações precisam para serem executadas.

A ideia é que a partir dela, você possa adicionar o que mais precisar, como a SDK do .NET, Node, PHP e depois fazer um pacote disto.

Com este pacote montado, você envia ele completo, do jeito que está, para produção, assim não corre o risco de dar algo errado.
