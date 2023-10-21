import java.util.Scanner;

public class Console {
    public static Scanner scanner = new Scanner(System.in);

    public static int getInput(String prompt){
        System.out.println(prompt);
        int intValue =  scanner.nextInt();
        scanner.nextLine(); // added to avoid problem with new line (storing of value) when scanner.nextLine is being used
        return intValue;
    }

    public static String getStringInput(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }



}
