import java.util.Scanner;

//Add the following code snippet before calling the method
    //int modifiableInt = 0;
    //System.out.println("Do another action? Y/N");
    // char q = scan.next().charAt(0);

//Below is the method call
    //YesOrNo yesOrNo = new YesOrNo(q, modifiableInt);

//Below allows for converting user input with exception handling included
    //modifiableInt = yesOrNo.getInputIntOut(); //this sets modifiableInt to a new value (++) based on 'y' input

public class YesOrNo {

    Scanner scan = new Scanner(System.in);
    boolean anotherOperation = true;
    public int inputIntOut = 0;

    public YesOrNo(char inputYN, int inputInt){

        while (anotherOperation) {

            if (inputYN == 'y' || inputYN == 'Y') {
                inputInt++; //insert other logic if necessary
                inputIntOut = inputInt;
                anotherOperation = false;

            } else if (inputYN == 'n' || inputYN == 'N') {
                //insert logic
                anotherOperation = false;

            } else {
                System.out.println("Error: Please enter y or n");
                anotherOperation = true;
                inputYN = scan.next().charAt(0);

            }
            //scan.nextLine();
        }
        anotherOperation = true;
    }

    public int getInputIntOut(){
        return inputIntOut;
    }

}
