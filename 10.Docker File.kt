Chegou a hora do desafio final, vamos publicar uma API criada utilizando Node/JavaScript em um contêiner e torná-la acessível pelo nosso Browser.

Para executar esta parte do artigo você precisará do Git e do Visual Studio Code instalados em sua máquina.

Abra um terminal e navegue para uma pasta segura, sem caracteres especiais ou com caminho muito longo e execute o seguinte comando.

git clone https://github.com/andrebaltieri/docker-sample-api.git
Este comando fará o download do código fonte de uma API de exemplo que está no nosso GitHub, gerando assim uma nova pasta chamada docker-sample-api.

Docker File
Com o código baixado, precisamos gerar um contêiner para nossa aplicação, e neste processo informar alguns detalhes.

O Docker File é o arquivo de instruções que o Docker utilizará para saber como publicar nossa aplicação em um contêiner, bem como qual imagem ele deve utilizar.

Abra pasta docker-sample-api com o Visual Studio Code e vamos criar um arquivo chamado Dockerfile na raiz.

Note que este arquivo não tem extensão alguma, é apenas Dockerfile mesmo.

O primeiro passo que precisamos fazer neste arquivo é definir qual imagem vamos utilizar em nossa aplicação.

Lembre-se que a imagem é a base para construção, contendo apenas o necessário do SO para execução da nossa aplicação.

Neste caso, vamos utilizar a imagem oficial do Node para Docker. Você pode encontrar imagens oficiais de diversas empresas no Docker Hub.

Para definir que estamos utilizando uma imagem como base, utilizamos a palavra FROM, seguida da imagem que queremos utilizar.

FROM node:current-slim
Note que após o nome da imagem temos dois pontos e current-slim. Na verdade o que vem depois dos dois pontos é a TAG da imagem.

As tags são utilizadas para definir versões destas imagens e no caso, current diz que estamos pegando a versão mais atual do Node (LTS - Long Term Support) e slim diz que é a versão enxuta.

Cada imagem tem suas tags, então você deve sempre olhar no Docker Hub pela versão que precisa utilizar.

A segunda definição que iremos fazer em nosso arquivo será o caminho, dentro da imagem, onde ficará o código fonte da nossa aplicação.

Isto é feito utilizando a palavra WORKDIR, como mostrado abaixo.

WORKDIR /usr/src/app
Agora precisamos copiar o arquivo Package.json, que contém os pacotes necessários para execução da nossa API.

Lembre-se que no caso do Node, não precisamos instalar uma SDK ou algo do tipo, porém toda aplicação tem a pasta node_modules com as bibliotecas que utilizamos durante a construção do App.

Para executar esta cópia vamos utilizar a palavra COPY, como mostrado abaixo.

COPY package.json .
Note que no fim do comando há um '.', definindo que o arquivo será copiado para raiz da nossa aplicação definido no WORKDIR.

Com tudo pronto, vamos executar o comando NPM INSTALL para instalar todos os pacotes que precisamos, e isto é feito utilizando a palavra RUN.

RUN npm install
Até o momento temos o código da nossa aplicação sendo copiado para a imagem e em seguida sendo instalados os pacotes que a API precisa para rodar.

Porém, precisamos definir em qual porta esta API irá rodar, e isto é feito pela palavra EXPOSE, como mostrado abaixo.

EXPOSE 8080
Neste caso, estamos expondo a API na porta 8080, porém fique à vontade em alterar esta porta.

É importante lembrar que nossa API, internamente (Dentro da imagem) roda na porta 3000. Isto está definido na linha 15 do arquivo bin/www.

Embora tenhamos copiado os arquivos e instalado os pacotes, nossa API ainda não está executando, e para isto precisamos de fato executar o comando NPM START.

Desta forma, vamos utilizar a palavra CMD que nos permite passar uma lista de comandos a serem executados.

CMD ['npm', 'start']
Por fim, vamos executar mais um COPY para copiar o resto da nossa aplicação para a imagem.

COPY . .
Note que utilizamos o mesmo esquema anterior, copiando os arquivos da raiz ('.') da nossa aplicação para a raiz ('.') da imagem.

O arquivo final Dockerfile fica com o seguinte conteúdo.

# Copy the file from your host to your current location
COPY package.json .

# Run the command inside your image filesystem
RUN npm install

# Inform Docker that the container is listening on the specified port at runtime.
EXPOSE 8080

# Run the specified command within the container.
CMD [ "npm", "start" ]

# Copy the rest of your app's source code from your host to your image filesystem.
COPY . .
