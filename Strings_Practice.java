import java.util.Scanner;
public class Main {
    static Scanner myReader = new Scanner (System.in);
    public static void main(String[] args) {
      repeatTillStop();
    }

    public static void repeatTillStop()
    {
        String text = myReader.nextLine();
        String stopper = "";
        int i = 0;
        while (!(stopper.equalsIgnoreCase("stop")))
        {
            i++;
            System.out.println(i + ". " + text);
            stopper = myReader.nextLine();
        }
    }
}
