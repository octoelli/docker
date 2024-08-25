Nosso desafio agora é criar uma imagem customizada a partir desta API/'Dockerfile que criamos. Vamos juntar a imagem padrão definida no Dockerfile com o restante da execução do script.

Dentre os comandos que podemos executar, temos o docker image build, para criar uma imagem, e vamos utilizá-lo para gerar o que precisamos aqui.

Certifique-se que você está na raiz da API, a pasta docker-sample-api e execute o seguinte comando.

docker image build -t dockerapi:1.0 .
Para facilitar futuras execuções, vamos dar um nome para esta imagem, adicionando o parâmetro -t, seguido pelo nome:versão da imagem.

Por fim, devemos especificar o diretório onde está nosso Dockerfile, que no caso é a raiz da nossa API, definido no comando pelo ".".

Para verificar se tudo deu certo, basta executar o comando docker image ls para listar as imagens que temos na máquina.
