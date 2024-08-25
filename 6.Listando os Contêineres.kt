Para listar os contêineres podemos utilizar o comando abaixo, porém neste caso o hello-world não aparecerá.

docker container ls
Isto ocorre pelo hello-world ser um contêiner de testes apenas, então para vê-lo listado, precisamos executar o comando com --all no final.

docker container ls --all
Desta forma você verá todos os contêineres que estão na máquina.
