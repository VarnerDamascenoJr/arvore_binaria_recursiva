package BuscaBinaria;

public class BuscaBinariaRecursiva {
    public static void main(String[] args){
        int array[] = {1, 4, 45, 54, 6, 2, 76, 44, 78, 90};
        //Arrays.sort(array);
        int elemento = 2;
        int resultado = buscaBinariaRecursiva(array, elemento);


        if (resultado < 0 ){
            System.err.println("O elemento a ser encontrado não foi localizado!");
        }else{
            System.out.println("Elemento encontrado na posição "+ resultado );
        }

    }

    public static int buscaBinariaRecursiva(int []array, int elemento){
        return buscaRecurvisa(array, elemento, 0, array.length -1);
    }



    public static int buscaRecurvisa(int []array, int elemento, int menor, int maior){
        int media = (menor + maior)/2;

        if (menor > maior){
            return -1;
        }
        if (array[media] == elemento){
            return media;
        }
        if (array[media] < elemento){
            return buscaRecurvisa(array, elemento, media + 1, maior);
        }
        else{
            return buscaRecurvisa(array, elemento, menor, media - 1);
        }

    }
}
