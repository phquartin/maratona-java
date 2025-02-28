## 🔒 Modificadores de Acesso em Java

Os modificadores definem o nível de visibilidade de atributos, métodos e classes. São quatro:

| Modificador          | Dentro da Classe | Dentro do Mesmo Pacote | Subclasse (Herança) | Fora do Pacote |
|----------------------|------------------|------------------------|---------------------|----------------|
| `public`             | ✅ Sim            | ✅ Sim                  | ✅ Sim               | ✅ Sim          |
| `protected`          | ✅ Sim            | ✅ Sim                  | ✅ Sim               | ❌ Não          |
| *sem nada* (default) | ✅ Sim            | ✅ Sim                  | ❌ Não               | ❌ Não          |
| `private`            | ✅ Sim            | ❌ Não                  | ❌ Não               | ❌ Não          |

