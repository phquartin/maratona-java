package phquartin.maratonajava.javacore.Oexception.test;

import phquartin.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
    private static void logar() throws LoginInvalidoException {
        String dbUser = "Pedro";
        String dbSenha = "admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu senha: ");
        String senha = sc.nextLine();
        if(!nome.equals(dbUser) || !senha.equals(dbSenha)){
            System.out.println("Usuario ou senha incorretos");
            throw new LoginInvalidoException();
        }
        System.out.println("Logado com sucesso!");
    }
}
