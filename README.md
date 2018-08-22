# listaExercicio1
1. Implemente um programa com uma interface gráfica em Java que receba as medidas dos
lados de um triângulo e indique se ele é equilátero, isósceles ou escaleno. Sendo que:
• Triângulo Equilátero: possui os 3 lados iguais.
• Triângulo Isósceles: possui 2 lados iguais.
• Triângulo Escaleno: possui 3 lados diferentes.
A interface gráfica deve seguir o seguinte modelo:
2. Crie um programa com uma interface gráfica em Java que permita calcular o peso de uma
pessoa em vários planetas. O programa deve receber o peso do usuário na terra, o planeta
desejado (de acordo com a tabela abaixo) e exibir na tela o peso do usuário no respectivo
planeta.
A equação para calcular o peso em
outro planeta é:
Exemplo de interface: 
3. Escreva um programa em Java que implemente uma interface gráfica para o jogo pedra,
papel, tesoura. Neste jogo, o usuário e o computador escolhem entre pedra, papel ou
tesoura. Sabendo que pedra ganha de tesoura, papel ganha de pedra e tesoura ganha de
papel, exiba na tela o ganhador: usuário ou computador. Para essa implementação,
assuma que o número 0 representa pedra, 1 representa papel e 2 representa tesoura.
O seu programa deve permitir que o jogador possa escolher entre pedra, papel e tesoura
através de um grupo de RadioButtons. Exemplo:
Seja criativo para montar uma interface gráfica interessante para o jogo! Lembre-se que
para sortear a jogada do computador, você pode adicionar a seguinte função ao seu
programa:
public static int randInt(int min, int max)
{
java.util.Random rand = new java.util.Random();
int randomNum = rand.nextInt((max - min) + 1) + min;
return randomNum;
}
A função randInt gera aleatoriamente um número entre min e max. Por exemplo, para
sortear um número entre 0 e 2, a seguinte chamada deve ser realizada:
x = randInt(0, 2); /* A variável x recebe um numero entre 0 e 2 */  

#JAVA#WindowsBuider#SegurançadaInformação#IESB
