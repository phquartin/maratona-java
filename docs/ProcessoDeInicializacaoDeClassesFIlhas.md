# 🏗️ Processo de Inicialização de uma Classe Filha em Java

Quando um objeto de uma classe filha é criado, o Java segue uma ordem específica para inicializar a classe pai e depois a filha. Essa ordem envolve blocos de inicialização estáticos, não estáticos e construtores.

## 🛠️ Ordem de Inicialização
1. **Blocos de inicialização estáticos da classe pai** (executados apenas uma vez quando a classe é carregada).
2. **Blocos de inicialização estáticos da classe filha** (também são executados apenas uma vez).
3. **Blocos de inicialização não estáticos da classe pai** (executados toda vez que um objeto é instanciado).
4. **Construtor da classe pai** (chamado antes do construtor da classe filha).
5. **Blocos de inicialização não estáticos da classe filha**.
6. **Construtor da classe filha**.

## 📌 Exemplo de Código
```java
class Pai {
    static {
        System.out.println("Bloco estático da classe Pai");
    }
    {
        System.out.println("Bloco de inicialização não estático da classe Pai");
    }
    public Pai() {
        System.out.println("Construtor da classe Pai");
    }
}

class Filha extends Pai {
    static {
        System.out.println("Bloco estático da classe Filha");
    }
    {
        System.out.println("Bloco de inicialização não estático da classe Filha");
    }
    public Filha() {
        System.out.println("Construtor da classe Filha");
    }
}

public class TesteInicializacao {
    public static void main(String[] args) {
        System.out.println("Criando objeto da classe Filha...");
        Filha filha = new Filha();
    }
}
```

## 🖥️ Saída esperada no console
```
Bloco estático da classe Pai
Bloco estático da classe Filha
Criando objeto da classe Filha...
Bloco de inicialização não estático da classe Pai
Construtor da classe Pai
Bloco de inicialização não estático da classe Filha
Construtor da classe Filha
```

## 🔍 Explicação do Processo
1. Quando a classe `Filha` é carregada, o **bloco estático da classe Pai** é executado primeiro.
2. Em seguida, o **bloco estático da classe Filha** é executado.
3. O `main` imprime "Criando objeto da classe Filha...".
4. Como `Filha` herda de `Pai`, primeiro os blocos **não estáticos da classe Pai** são executados.
5. Depois, o **construtor da classe Pai** é chamado.
6. Então, os **blocos não estáticos da classe Filha** são executados.
7. Por fim, o **construtor da classe Filha** é chamado.

