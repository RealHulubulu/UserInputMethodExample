import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int modifiableInt = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("Do another action? Y/N");
        char q = scan.next().charAt(0);
        YesOrNo yesOrNo = new YesOrNo(q, modifiableInt);

        System.out.println(yesOrNo.getInputIntOut());
        System.out.println("The original int: " + modifiableInt);
        System.out.println("The modified int: " + (modifiableInt = yesOrNo.getInputIntOut()));

        if (modifiableInt > 0) {
            System.out.println("Would do operation taking in new int value");
        }else if(modifiableInt == 0){
            System.out.println("Would not do operation as int value remained 0");

        }

    }
}
