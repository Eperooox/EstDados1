package br.com.newtonpaiva.dominio.quest1.quest2;
import java.util.Random;
public class Quest2
{
    public static void main(String[] args)
    {
        int tamanho = 10;
        int[] vetor = new int[tamanho];
        Random random = new Random();


        for (int i = 0; i < tamanho; i++)
        {
            vetor[i] = random.nextInt(100) + 1;
        }


        System.out.print("Vetor: ");
        for (int i = 0; i < tamanho; i++)
        {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        int elementoBuscado = 42;
        int posicaoEncontrada = -1;
        for (int i = 0; i < tamanho; i++)
        {
            if (vetor[i] == elementoBuscado)
            {
                posicaoEncontrada = i;
                break;
            }
        }

        if (posicaoEncontrada != -1)
        {
            System.out.println("Elemento " + elementoBuscado + " encontrado na posição " + posicaoEncontrada);
        } else
        {
            System.out.println("Elemento " + elementoBuscado + " não foi localizado no vetor.");
        }
    }
}
