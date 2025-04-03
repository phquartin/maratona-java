package phquartin.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        int[] numeros = {12, 10, 8, 3, -1};

        int temp;

        for (int i = 0; i < numeros.length; i++){
            for (int j = i+1; j < numeros.length; j++){
                if (numeros[i] > numeros[j]){
                    temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
