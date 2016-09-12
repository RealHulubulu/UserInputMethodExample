import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Object object1 = 1.5; //change this to String, Integer, or Double
        Object object2 = "OldString";
        Object object3 = 1;
        //...

        ArrayList modifiableArrayList = new ArrayList();
        modifiableArrayList.add(object1);
        modifiableArrayList.add(object2);
        modifiableArrayList.add(object3);
        //...

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome \nThis program converts a user input of Y or N into user made logic. \nFor instance, changing an int from 0 to 1");
        System.out.println("The original ArrayList: " + modifiableArrayList);
        System.out.println("Operation of adding all three array elements: " + modifiableArrayList.get(0) + modifiableArrayList.get(1) + modifiableArrayList.get(2));
        System.out.println("\nChange the array values? Y/N");
        char inputYesNo = scan.next().charAt(0);

        YesOrNo yesOrNo = new YesOrNo(inputYesNo, modifiableArrayList);
        System.out.println("\nThe modified ArrayList: " + (modifiableArrayList = yesOrNo.getInputArrayListOut()));
        System.out.println("Operation of adding all three array elements: " + modifiableArrayList.get(0) + modifiableArrayList.get(1) + modifiableArrayList.get(2));


    }
}
