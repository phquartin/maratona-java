package phquartin.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Oie";


    // Top Level
    static class Nested{

        void print(){
            System.out.println(new OuterClassesTest03().name);
        }

    }

    public static void main(String[] args) {
        new Nested().print();
    }
}
