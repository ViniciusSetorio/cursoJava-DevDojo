package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        long longP = 10L;
        int intP = 1;
        float floatP = 1;
        double doubleP = 1;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Long longW = 10L;
        Integer intW = 1; // autoboxing
        Float floatW = 1F;
        Double doubleW = 1D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TruE");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('a'));

    }
}
