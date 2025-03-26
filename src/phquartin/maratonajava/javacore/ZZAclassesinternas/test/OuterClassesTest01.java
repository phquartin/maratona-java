package phquartin.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Pedro";

    class Inner{
        public void printOuterClassAtribute(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClasses = new OuterClassesTest01();
        Inner inner = outerClasses.new Inner();
        inner.printOuterClassAtribute();
    }
}
