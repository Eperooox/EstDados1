#include <stdio.h>

// Função que calcula a soma de dois inteiros e retorna o resultado através de um ponteiro
void somar(int a, int b, int *resultado) {
    *resultado = a + b;
}

int main() {
    int num1, num2, resultado;

    printf("Digite o primeiro número inteiro: ");
    scanf("%d", &num1);

    printf("Digite o segundo número inteiro: ");
    scanf("%d", &num2);

    // Chama a função somar para calcular a soma dos números
    somar(num1, num2, &resultado);

    // Exibe o resultado
    printf("A soma de %d e %d é %d\n", num1, num2, resultado);

    return 0;
}
