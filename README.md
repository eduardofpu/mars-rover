Mars Rover
==========
```sh

Um esquadrão de robotic rovers deve ser desembarcado pela NASA em um planalto em Marte. Este planalto, que é curiosamente retangular, deve ser navegado pelos rovers para que suas câmeras de bordo possam ter uma visão completa do terreno circundante para enviar de volta à Terra.

A posição e localização do rover é representada por uma combinação de coordenadas x e y e uma carta que representa um dos quatro pontos cardinais da bússola. O planalto é dividido em uma grade para simplificar a navegação. Um exemplo de posição pode ser 0, 0, N, o que significa que o rover está no canto inferior esquerdo e virado para o norte.

Para controlar um rover, a NASA envia uma simples sequência de letras. As letras possíveis são 'L', 'R' e 'M'. 'L' e 'R' fazem o rover girar 90 graus para a esquerda ou para a direita, respectivamente, sem se mover do seu ponto atual. "M" significa avançar um ponto de grade e manter o mesmo título.

Suponha que o quadrado diretamente Norte de (x, y) seja (x, y + 1).

Entrada: A primeira linha de entrada é a coordenada superior direita do platô, as coordenadas inferior esquerda são assumidas como sendo 0,0.

O restante da entrada é informação relativa aos rovers que foram implantados. Cada rover tem duas linhas de entrada. A primeira linha dá a posição do rover, e a segunda linha é uma série de instruções dizendo ao rover como explorar o planalto.

A posição é composta por dois inteiros e uma letra separada por espaços, correspondente às coordenadas x e y e à orientação do rover.

Cada rover será terminado sequencialmente, o que significa que o segundo rover não começará a se mover até que o primeiro termine de se mover.

Saída: a saída para cada rover deve ser suas coordenadas e cabeçalho finais.

Entrada e saída

Entrada de teste:

5 5 

1 2 N
 
LMLMLMLMM
 
3 3 E

MMRMMRMRRM

Saída esperada:

1 3 N

5 1 E

```


Premissas
===========
```
- Quando um Planalto é criado, as coordenadas inferiores estão sempre (0, 0)
- O quadrado diretamente norte de (x, y) é (x, y + 1)

```
Para executar o projeto é necessário a instalação das seguintes ferramentas:
=======================
```sh

    1. JDK 1.8
    3. Maven
```

Execução
=========

Após baixar o projeto, para executá-lo é necessário rodar os seguintes comandos dentro da pasta raiz.

```sh
$ mvn clean install
$ mvn spring-boot:run

ou

Importe e configure o projeto no IDE escolhido
Execute os ciclos de vida 'Clean' e 'install' da Maven, isso executará todos os testes no Maven e criará um .jar
Execute a classe MarsRover, isso testará a entrada e saída na linha de comando

```
Input 
===================
```sh
- A classe principal MarsRover 
- fará a leitura do arquivo input.txt o qual  possui as quatro linha de entrada para facilitar a avaliação
- src/main/resources/input.txt

```
