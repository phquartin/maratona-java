package phquartin.maratonajava.javacore.Xserialization.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {
    private int id;
    private String nome;
    private transient String password;
    private transient Turma turma;

    public Aluno(int id, String nome, String password, Turma turma) {
        this.id = id;
        this.nome = nome;
        this.password = password;
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", turma=" + turma +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
