Durante a execução destes primeiros comandos, duas coisas muito importante aconteceram, o download da imagem e a criação do contêiner.

Uma imagem é a informação crua que temos enquanto o contêiner é uma representação desta imagem local.

Os contêineres se baseiam nas imagens, mas nunca executamos as imagens, sempre os contêineres.

Desta forma, temos uma imagem do hello-world, que é uma base que temos para construir diversos contêineres.

Para listar as imagens que temos localmente é só executar o comando abaixo.

docker image ls
Como você deve imaginar, estas imagens ocupam espaço em disco, e podemos removê-las e baixá-las novamente a qualquer momento.

No caso, para remover uma imagem baixada, podemos utilizar o comando abaixo.

docker image rmi ID_DA_IMAGEM
É importante frisar que uma imagem não poderá ser apagada caso esteja em uso.
