# ✨ Constantes `static final` em Java

Em Java, é muito comum ver a combinação `static final` ao declarar constantes. Essa junção tem um propósito importante. Vamos entender o motivo!

---

## **📌 Por que **`static`** é usado com **`final`**?**

A palavra-chave `final` significa que o valor da variável **não pode ser alterado depois de ser atribuído**. Isso faz com que a variável se torne uma **constante**.

A palavra-chave `static` significa que o valor pertence **à classe e não a um objeto específico**.

### **🔹 Motivo principal da junção **

Quando queremos declarar uma **constante global** (um valor fixo que não muda e pode ser acessado sem precisar criar um objeto da classe), usamos `static final`. Isso evita que cada instância da classe tenha sua própria cópia da constante, economizando memória e tornando o código mais eficiente.

### **🚀 Exemplo prático**

```java
public class Config {
    public static final double PI = 3.14159;
    public static final String NOME_APP = "Meu Aplicativo";
}
```

👉 **Acesso sem precisar criar um objeto:**

```java
System.out.println(Config.PI);  // Saída: 3.14159
System.out.println(Config.NOME_APP); // Saída: Meu Aplicativo
```

---

### **⚡ O que acontece se **`final`** for usado sem **`static`**?**

Se usarmos **apenas**`final`, cada objeto terá sua **própria cópia** da variável, o que pode ser ineficiente para constantes globais.

Exemplo:

```java
public class Exemplo {
    public final int valor = 100;  // Cada objeto terá sua própria cópia de "valor"
}
```

Cada vez que criarmos um novo objeto `final`, a variável `valor` existirá separadamente para cada instância.

---

## **📝 Resumo Rápido**

| Modificador    | O que faz?                                                        |
| -------------- | ----------------------------------------------------------------- |
| `final`        | Torna a variável **imutável** após a atribuição.                  |
| `static`       | Faz com que a variável pertença **à classe e não aos objetos**.   |
| `static final` | **Cria uma constante global**, acessível diretamente pela classe. |


