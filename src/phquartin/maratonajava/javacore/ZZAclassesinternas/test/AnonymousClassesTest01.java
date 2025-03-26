package phquartin.maratonajava.javacore.ZZAclassesinternas.test;

class Animal{
    public void walk(){
        System.out.println("Walking...");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            public void walk(){
                System.out.println("Anonymous walking...");
            }
        };
        animal.walk();
    }
}
