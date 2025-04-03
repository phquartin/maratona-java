package phquartin.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Pedro";

    void print(){
        class LocalClass {
            public void printOuterClassAtribute(){
                System.out.println(name);
            }
        }
        new LocalClass().printOuterClassAtribute();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print();
    }
}
