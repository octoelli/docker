Docker - Instalação, Configuração e Primeiros Passos
O Docker é uma forma de abstração da nossa infraestrutura que nos beneficia tanto em tempo de desenvolvimento quanto em produção.

***Índice
** O que é o Docker?
** Docker para Desenvolvedores
** Requisitos
** Versões do Docker
** Criando a Conta
** Instalando o Docker
** Executando o Docker
** Testando a Instalação
** Listando as Imagens
** Listando os Contêineres
** Publicando uma API
** Criando uma Imagem
** Rodando o Contêiner

** Acessando os Logs
Para visualizar os logs de execução da API você pode clicar no ícone do Docker e ir na opção Dashboard. Uma nova tela se abrirá listando o contêiner que acabamos de criar.

Clique sobre o contêiner e em seguida clique na opção LOGS para visualizar tudo que está sendo executado neste contêiner.

** WSL 2 (Somente Windows)
O WSL é um subsistema Linux que roda dentro do Windows, permitindo que o Docker seja executado mais rápido e de forma otimizada.

Recomendamos fortemente que utilize o WSL 2 caso possível. Isto vai garantir uma performance e estabilidade melhor.

O ideal é habilitar o WSL 2 antes de instalar o Docker, para isto basta acessar este link e realizar a instalação:

Desta forma, ao realizar a instalação do Docker, na primeira tela irá aparecer a opção abaixo, que deve ficar marcada.

Enable WSL 2 Windows features
Caso já tenha o Docker instalado e queria apenas habilitar a opção de rodá-lo via WSL, você pode alterar as opções em Settings > Resources > WSL Integration > Enable integration with my default WSL Distro.
