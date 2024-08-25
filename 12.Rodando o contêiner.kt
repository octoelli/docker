A última coisa que precisamos fazer é pegar esta imagem gerada e executar ela como um contêiner, e isto é feito pelo comando docker container run.

Novamente, certifique-se que você está na raiz da API, a pasta docker-sample-api e execute o seguinte comando.

docker container run --publish 8080:3000 --detach --name api dockerapi:1.0
O primeiro parâmetro que temos no comando é o --publish, que vai fazer o redirecionamento do tráfego para a porta onde nossa API está rodando.

Neste caso, vamos rodar nosso contêiner na porta 8080, ou seja, acessaremos nossa API no Browser pela URL http://localhost:8080, porém, internamente nossa API está rodando na porta 3000.

O --publish cuidará exatamente deste redirecionamento de tráfego para nós. Você também pode alterar a porta de execução para outra qualquer, diferente da 8080 se quiser.

O --detach diz para o Docker executar este contêiner em background, e não vai travar o processo do nosso terminal ou Visual Studio Code que acabamos de executar.

O --name especifica o nome do contêiner, e fica a seu critério colocar qualquer nome que quiser, desde que não tenha espaços ou caracteres especiais.

Neste momento você pode abrir o browser no endereço http://localhost:8080 para ver a mensagem 'Docker Node API Running' na tela, o que significa que nossa API está rodando.

Por fim temos o nome da imagem especificado, que no caso é a que acabamos de criar. Agora você pode usar os comandos docker container ls para ver este contêiner em execução, além do docker container start ID e docker container stop ID para iniciar ou parar ele.
