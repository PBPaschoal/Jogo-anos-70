# JOGO ESTILO ANOS 70 - MAS INSPIRADO NO RAGNAROK ONLINE

Estou desenvolvendo esse jogo em Java, inspirado nos jogos antigos dos anos _70~90_ onde a historia e interação do usuário eram apenas por textos.
Para desenvolver esse jogo, me inspirei também no meu jogo de RPG MMO favorito, o Ragnarok Online.
Por isso, desenvolvi algumas classes (Profissões), estilo do jogo, equipes, mapas, monstros, quests e tudo mais. 

* A ideia desse projeto é praticar **POO** e entender melhor alguns conceitos. Conforme vou avançando o meu aprendizado com curso e livro sobre Java, vou desenvolvendo o jogo e aplicando tudo que aprendi.


* O jogo será atualizado até eu decidir que está pronto, pois por ser apenas textos, não precisar ser um jogo grande. Mas a ideia aqui é usar **Encapsulamento, Herança, Polimorfismo, Métodos, Objetos, Atributos, Pacotes, Classes** e tudo mais.


* **Para o futuro do jogo:**
Para o futuro do jogo: Planejo desenvolver uma versão mais avançada deste jogo utilizando C# com .NET e Unity, fazendo a transição de uma interface apenas textual para uma experiência gráfica.


### Anotações do desenvolvimento do jogo:
- Última atualização: _Data: 25 de outubro de 2024_

_Jogo anos 70 - Inspirado em Ragnarok Online_

**Pacote:** jogo<br>
**Classe Principal:** Jogo

Até o momento criei um objeto chamado _'personagem'_ da classe Personagem e um objeto chamado _'raca'_ da Classe Raca, ambas do pacote jogador;
_Locale.setDefault_ e _Scanner_ importados.

É apresentado na tela informando uma mensagem de boas vindas e de inicialização do jogo.
Após a mensagem, utilizei o objeto personagem para chamar o método _'CriarPersonagem'_ da Classe Personagem.java, do pacote jogador;
Após chamar o objeto _'CriarPersonagem'_ e concluido o mesmo, eu uso o objeto _'raca'_ para chamar o método _'tipoDeRaca'_ da classe Raca, do pacote jogador.
Após concluido, apresento as saídas de dados na tela para teste, informando:

_Nome do personagem;<br>
Sexo do personagem;<br>
Idade do personagem;<br>
Tamanho do cabelo do personagem;<br>
Cor do cabelo do personagem;<br>
Tamanho da barba do personagem;<br>
Cor da barba do personagem;<br>
Raça do personagem._

No pacote jogador, a Classe Personagem.java
Criei os atributos: String nome, String cabeloTamanho, String barbaTamanho, String cabeloCor, String barbaCor, char sexo, int idade, double altura. Todos do tipo private.

Criei um construtor padrão e outro construtor com todos os atributos.
Criei o get e set de todos os atributos.

Depois criei os métodos.

Método void CriarPersonagem:
Ele informa as mensagens de saída de tela, solicitando o nome, sexo, idade e altura do personagem. Sendo armazenados nos set de cada um em especifico.

Após o mesmo, criei um método chamado _'CorDoCabelo'_, onde informa uma mensagem solicitando para escolher 10 tipos de cores de cabelos.
Nesse método também usei o switch-case.

Depois criei o método _'CorDaBarba'_, solicitando que escolha a cor da barba, também com 10 tipos de cores de barbas.
Também usei o _switch-case_

Depois criei um método chamado _'CabeloEBarba'_. Onde é informado uma mensagem solicitando que seja escolhido uma tipo de cabelo: 1 = Longo, 2 = Curto e 3 = Careca.
Depois usei o switch-case para tratar dessa escolha.
Após terminar, é chamado o método _'CorDoCabelo'_ para o usuário escolher.
Após o termino, criei uma opção com a estrutura condiciona if-else junto com a estrutura de repetição do-while. Se o usúario for Masculino, é chamada a solicitação para escolher o tamanho da barba e após o método para escolher a cor da barba. Se escolher uma opção invalida, ele repete (assim como nas switch-case, se errar, repete o código, mas não com estrutura de repetição, mas sim em chamando o proprio método de novo).
Caso seja feminino, é ignorada essa opção sem precisar escolher o tamanho e cor da barba.
No mesmo pacote jogador, criei a Classe Raca.java
Onde criei os atributos String raca e int _'idRaca'_.
Criei um construtor padrão e um construtor usando os dois atributos.
Criei os get e set de ambos.
Após, criei o método _'tiposDeRaca'_, onde é apresentada as raças na saída de dados e depois é chamado o outro método que criei, _'escolhaRaca'_, onde o mesmo é feita a entrada de dados para selecionar a raça desejada e após a opção criada com switch-case for escolhida, é feita armazenada a escolha em _'setRaca'_ e _'setIdRaca'_.
Atualizações para fazer:

Organizar nas ordens corretas os métodos da classe Personagem.java e criar os IDs de tipo de cabelo, cor do cabelo, tipo de barba, cor de barba.