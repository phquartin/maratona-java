package phquartin.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // if / else
        if (true){
            System.out.println("Java eh lindo!");
        }
        else{
            System.out.println("Java eh feio!");
        }

        // else if
        int pessoaIdade = 60;
        if (pessoaIdade <= 13){
            System.out.println("Kid!");
        }
        else if (pessoaIdade <= 17){
            System.out.println("Teenager!");
        }
        else if (pessoaIdade <= 59){
            System.out.println("Adulto!");
        }
        else{
            System.out.println("Idoso!");
        }
    }
}
