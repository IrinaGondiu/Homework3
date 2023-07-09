package hw3;

public class Main {

    public static void main(String[] args) {

        String simpleString = new String("I study basic Java!");

        System.out.println(simpleString);


        System.out.println(simpleString.charAt(18));


        System.out.println(simpleString.contains("Java"));

        System.out.println(simpleString.replace('a', 'o'));

        System.out.println(simpleString.toUpperCase());

        System.out.println(simpleString.toLowerCase());


        System.out.println(simpleString.substring(0,13) + "!");

        /** int index = simpleString.indexOf("Java");
        // System.out.println(simpleString.substring(index));**/







        //_________________________________________________________







        System.out.println(sum(15,2));
        System.out.println(substraction(15,2));
        System.out.println(multiplication(20,3));
        System.out.println(devision(15,3));
    }

    public static int sum(int a,int b){
        return a+b;
    }
    public static int substraction(int a, int b){
        return a-b;
    }
    public static int multiplication (int a, int b){
        return a*b;
    }

    public static int devision(int a, int b){
        return a/b;
    }
}
