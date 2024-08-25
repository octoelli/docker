Ao instalar o Docker automaticamente fazemos a instalação do seu CLI, que disponibiliza o comando docker em nosso terminal.

Desta forma, abra um terminal e digite o seguinte comando para ver a versão do Docker instalada.

docker --version
Se estiver no Windows, recomendamos fortemente o Windows Terminal ou Power Shell.

Vamos então executar nosso famoso Hello World, que vai baixar e executar um contêiner para testarmos se tudo está funcionando corretamente.

docker run hello-world
Ao executar o comando, veremos a mensagem 'Unable to find image hello-world:latest locally', o que significa que ele não conseguiu encontrar nenhuma imagem chamada hello-world localmente.

Faz todo sentido, afinal não fizemos download de nada ainda, mas mesmo assim, ele fará uma busca online e encontrará esta imagem.

Seguindo adiante ele fará o download e execução da imagem, exibindo a mensagem 'This message shows that your installation appears to be working correctly.' caso tudo tenha dado certo.
