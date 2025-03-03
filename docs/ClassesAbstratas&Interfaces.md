# ⚖️ Diferença entre Classes Abstratas e Interfaces em Java

Tanto **classes abstratas** quanto **interfaces** são usadas para definir contratos e compartilhamento de comportamento, mas possuem diferenças fundamentais.

---

## 🔹 **Diferenças Principais**

| Característica     | **Classe Abstrata**                                                                       | **Interface**                                                                                                          |
|--------------------|-------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|
| Herança            | Pode ter métodos concretos (implementados) e abstratos (sem implementação).               | Todos os métodos eram abstratos antes do Java 8, mas agora podem ter métodos com implementação (`default` e `static`). |
| Estado (Atributos) | Pode ter atributos com qualquer modificador de acesso (`private`, `protected`, `public`). | Pode ter apenas atributos `public static final` (constantes).                                                          |
| Construtores       | Pode ter construtores (chamados pela subclasse).                                          | Não pode ter construtores.                                                                                             |
| Herança Múltipla   | Uma classe só pode herdar de **uma** classe abstrata.                                     | Uma classe pode implementar **várias** interfaces.                                                                     |
| Uso Principal      | Para **compartilhar comportamento** entre classes relacionadas.                           | Para definir um **contrato** que outras classes devem seguir.                                                          |

---

## 🛠️ **Quando usar cada uma?**

- **Use uma classe abstrata** quando:
    - Você quer compartilhar **implementações** comuns entre várias classes.
    - Precisa de **atributos que não sejam constantes** (exemplo: um contador de instâncias).
    - As classes que herdam dela têm um **relacionamento forte** (exemplo: `Animal` → `Cachorro`).

- **Use uma interface** quando:
    - Você quer definir apenas um **contrato** para outras classes seguirem.
    - Precisa de **herança múltipla** (pois uma classe pode implementar várias interfaces).
    - Vai trabalhar com **comportamentos que podem ser adicionados a várias classes** sem relação direta (exemplo: `Voador` pode ser implementado por `Pássaro` e `Avião`).

---

## 💡 **Exemplo Prático**

### 🟢 **Classe Abstrata**
```java
abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void fazerSom(); // Método abstrato (obrigatório implementar)

    public void dormir() { // Método concreto (opcional implementar)
        System.out.println(nome + " está dormindo...");
    }
}
```

```java
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " está latindo!");
    }
}
```

---

### 🔵 **Interface**
```java
interface Voador {
    void voar(); // Método abstrato (obrigatório implementar)
}

class Passaro extends Animal implements Voador {
    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " está cantando!");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando!");
    }
}
```

---

## 📝 **Resumo**
- `Animal` é uma **classe abstrata** porque tem **métodos concretos e abstratos**.
- `Voador` é uma **interface** porque apenas define um **contrato** (`voar()`).
- `Passaro` herda `Animal` e implementa `Voador`, ou seja, pode tanto **fazer som** quanto **voar**.

