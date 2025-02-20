package phquartin.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        if (true){
            System.out.println("Java eh lindo!");
        }
        else{
            System.out.println("Java eh feio!");
        }

        int idade = 18;
        if (idade >= 18){
            System.out.println("Pode comprar bebidas!");
        } else if (idade <= 18) {
            System.out.println("Nao pode comprar bebidas!");
        }
    }
}
