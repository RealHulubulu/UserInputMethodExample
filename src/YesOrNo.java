import java.util.ArrayList;
import java.util.Scanner;


public class YesOrNo {

    private Scanner scan = new Scanner(System.in);
    private boolean anotherOperation = true;
    private ArrayList inputArrayListOut = new ArrayList(1);


    public YesOrNo(char inputYN, ArrayList inputArrayList) {

        while (anotherOperation) {

            if (inputYN == 'y' || inputYN == 'Y') {

                inputArrayListOut = new ArrayList<>(inputArrayList);
                //insert logic
                for (int i = 0; i < inputArrayListOut.size(); i++) {
                    if (inputArrayListOut.get(i) instanceof Double) {
                        //insert logic
                        inputArrayListOut.set(i, 3.0);
                    } else if (inputArrayListOut.get(i) instanceof String) {
                        //insert logic
                        inputArrayListOut.set(i, "NewString");
                    } else if (inputArrayListOut.get(i) instanceof Integer) {
                        //insert logic
                        inputArrayListOut.set(i, 2);
                    }
                }
                anotherOperation = false;

            } else if (inputYN == 'n' || inputYN == 'N') {
                //insert logic
                inputArrayListOut = inputArrayList;
                anotherOperation = false;

            } else {
                System.out.println("Error: Please enter y or n");
                anotherOperation = true;
                inputYN = scan.next().charAt(0);

            }
        }
        anotherOperation = true;
    }


    public ArrayList getInputArrayListOut() {
        return inputArrayListOut;
    }

}
