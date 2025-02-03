//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows -i; j++) {
                System.out.println(" ");
            }
                for (int k = 1; k <= i; k++) {
                    System.out.println("*");
                }
                System.out.println();
        }
    }
}