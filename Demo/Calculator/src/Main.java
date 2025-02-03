//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to our calculator project!");

        int number = 5;
        Calculator abc = new Calculator();

        System.out.println(abc.add(2,5));
        System.out.println(abc.subtract(21, 5));
        System.out.println(abc.multiply(22, 5));
        System.out.println(abc.divide(20, 5));
    }
}