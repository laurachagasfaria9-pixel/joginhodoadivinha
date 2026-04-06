#  Jogo de Adivinhação em Java

Um jogo de adivinhação desenvolvido em Java para rodar no terminal. O objetivo é acertar um número secreto gerado aleatoriamente, com base em dicas e número limitado de tentativas.

---

##  Funcionalidades

- Sistema de jogo via terminal
- Escolha de dificuldade (Fácil, Médio, Difícil)
- Número aleatório entre 1 e 100
- Dicas ao jogador (maior ou menor)
- Sistema de pontuação
- Opção de salvar nome e pontuação
- Possibilidade de jogar novamente

---

##  Como funciona

1. O jogador inicia o jogo pressionando ENTER
2. Escolhe a dificuldade:
   - Fácil → 10 tentativas
   - Médio → 7 tentativas
   - Difícil → 5 tentativas
3. O sistema gera um número secreto
4. O jogador tenta adivinhar:
   - Recebe dicas a cada erro
   - Perde pontos a cada tentativa errada
5. O jogo termina quando:
   - O jogador acerta
   - Ou as tentativas acabam

---

##  Pontuação

| Dificuldade | Pontos Iniciais | Perda por erro |
|------------|----------------|----------------|
| Fácil      | 50             | 0.5            |
| Médio      | 70             | 1              |
| Difícil    | 100            | 2              |

---

##  Como executar

### Pré-requisitos
- Java JDK 8 ou superior

### Passos

```bash
git clone https://github.com/seu-usuario/jogo-adivinhacao-java.git
cd jogo-adivinhacao-java
javac jogoAdivinhacaoCompleto4/JogoAdivinhacaoCompleto.java
java jogoAdivinhacaoCompleto4.JogoAdivinhacaoCompleto
