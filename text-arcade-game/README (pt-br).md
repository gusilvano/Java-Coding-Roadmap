# **Text Arcade Game** - Simulação de Game Loop em texto
Este projeto implementa um game loop simples em texto, com o objetivo de simular um cenário de combate dinâmico, no qual o jogador precisa derrotar inimigos continuamente.

O foco principal é a criação de um sistema de combos, onde o jogo incentiva o jogador a realizar longas sequências de abates por meio de recompensas.
## Mecânicas
A mecânica do game se baseia em:
- O jogador escolhe o idioma.
- O game loop é executado continuamente enquanto houver abates de inimigos.
- A cada interação, o código interpreta se houve um abate e qual foi a quantidade.
- Ao atingir uma sequência pré-definida de eliminações, o jogador recebe um bônus.

O sistema de bônus funciona da seguinte forma: 
- Sequências maiores ou iguais a 10 eliminações concedem mais 500 pontos de bônus.
- Sequências maiores ou iguais a 20 eliminações concedem mais 1000 pontos de bônus.

## Condição de encerramento
O jogo termina imediatamente quando o jogador não consegue derrotar nenhum inimigo, ou seja, quando o número de abates é igual a zero.

## Conclusão
Este projeto tem como objetivo o desenvolvimento de conceitos fundamentais de programação, como estruturas condicionais, laços de repetição, controle de pontuação e seleção de idiomas.