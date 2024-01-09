
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldest = 0;

        while(true){
            String input = scanner.nextLine();

            if(input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            if(oldest < Integer.parseInt(pieces[1])){
                oldest = Integer.parseInt(pieces[1]);
                oldestName = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
