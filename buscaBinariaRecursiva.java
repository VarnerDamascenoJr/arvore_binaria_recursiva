package BuscaBinaria;

import java.util.Arrays;

public class BuscaBinariaRecursiva {
    public static void main(String[] args){
        int array [] = {1, 4, 45, 54, 6, 2, 76, 44, 78, 90}; //aqui está dado o array de valores a serem percorridos.
    //Nota-se que para o bom funcionamento da busca, o vetor deve estar devidamente ordenado.
    //Aqui cabe a liberdade em usar algum algoritmo de ordenação ou mesmo alguma biblioteca.    
        Arrays.sort(array);
        int elemento = 90; //Aqui está dado o elemento que busco dentro do meu conjunto índices no array
        int resultado = buscaBinariaRecursiva(array, elemento); //o valor do índice será armazenado nesta variável

    //Esta estrutura bem simples. Caso o resultado da busca retorne-me valor negativo,
    //valor este que é pego a partir do primeiro if dado na função buscaRecursiva.
    //Ou seja, se o meu vetor tenha sido percorrido por completo  e não foi achando.
        if (resultado < 0 ){
            System.err.println("O elemento a ser encontrado não foi localizado!");
        }else{
    //Se o valor foi diferente de 0 isso quer dizer que algo foi encontrado e será
    //armazenado na variável resultado.
            System.out.println("Elemento encontrado na posição: "+ resultado );
        }

    }
    // Nesta função tenho que será dado um vetor de qualquer tamanho e um elemento
    // que quero buscar. Assim será chamada a função recursiva percorrendo desde o
    // primeiro elemento do vetor até o último elemento do array numérico dado.
    public static int buscaBinariaRecursiva(int []array, int elemento){
        return buscaRecurvisa(array, elemento, 0, array.length - 1);
    }



    public static int buscaRecurvisa(int [] array, int elemento, int menor, int maior){
        int media = (menor + maior)/2; //primeiro eu divido minha árvore em duas partes logicamente.

        if (menor > maior){
            return -1;
        }
        if (array[media] == elemento){
            return media;
        }
    //Neste primeiro caso o meu vetor irá percorrer um lado do array
        if (array[media] < elemento){
            return buscaRecurvisa(array, elemento, media + 1, maior);
        }
    //senao ele percorrerá o outro lado.
        else{
            return buscaRecurvisa(array, elemento, menor, media - 1);
        }

    }
}
