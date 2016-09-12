import java.util.ArrayList;
import java.util.Scanner;



public class YesOrNo {

    Scanner scan = new Scanner(System.in);
    boolean anotherOperation = true;
    public ArrayList inputArrayListOut = new ArrayList(1);



    public YesOrNo(char inputYN, ArrayList inputArrayList) {

        while (anotherOperation) {

            if (inputYN == 'y' || inputYN == 'Y') {
                //insert logic

                inputArrayListOut = new ArrayList<>(inputArrayList);

                for(int i = 0; i < inputArrayListOut.size(); i++){
                    if(inputArrayListOut.get(i) instanceof Double){
                        inputArrayListOut.set(i, 3.0);
                    }else if(inputArrayListOut.get(i) instanceof String){
                        inputArrayListOut.set(i,"New String");
                    }else if(inputArrayListOut.get(i) instanceof Integer){
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
