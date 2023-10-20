import java.util.Scanner;

public class Console {
    public static Scanner scanner = new Scanner(System.in);

    public static int getInput(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }


}
