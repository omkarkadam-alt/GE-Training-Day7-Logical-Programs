import java.util.Scanner;

public class StopwatchSimulation {
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Give input as \"START\" to start the StopWatch");
        String currState = scannerObject.nextLine();


        if(!currState.equals("START")){
            System.out.println("Invalid Input.");
            System.out.println("Aborting !!");
            return;
        }

        long startTime = System.currentTimeMillis();

        currState = scannerObject.nextLine();

        if(!currState.equals("END")){
            System.out.println("Invalid Input.");
            System.out.println("Aborting !!");
            return;
        }

        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;

        System.out.println("Elapsed Time: " + timeElapsed + "ms");

        scannerObject.close();

    }    
}
