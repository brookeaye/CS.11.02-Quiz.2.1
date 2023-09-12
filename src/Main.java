public class Main {
    public static void main(String[] args) {

        int result = add(5, 8);
        System.out.println(result);

        String resultTwo = greeting("Mr. Ewing");
        System.out.println(resultTwo);

        int resultThree = add(5, 6, 7, 8);
        System.out.println(resultThree);

        printMe("I'm light as a feather and I'm fresh as the air");
    }

    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }

    public static String greeting(String name){
        return "Bonjour, " + name + "!";

    }

    public static int add(int numOne, int numTwo, int numThree, int numFour){
        return add(add(numOne, numTwo), add(numThree, numFour));

    }

    public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);
    }

}
