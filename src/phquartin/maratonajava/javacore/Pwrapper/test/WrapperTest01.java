package phquartin.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 2;
        int intP = 3;
        long longP = 4L;
        float floatP = 5F;
        double doubleP = 6D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 2;
        Integer intW = 3; // boxing
        Long longW = 4L;
        Float floatW = 5F;
        Double doubleW = 6D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW;  // unboxing

        Boolean verdade = Boolean.parseBoolean("trUe");
        System.out.println(verdade);

        Character.UnicodeBlock ub = Character.UnicodeBlock.of(charW);
        System.out.println(ub);



    }
}
