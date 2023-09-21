import java.util.Scanner;

/**
 * Homework2
 */
public class Homework2 {

    public static int randomNumbers[]={1,2,3,12,23,32,51,56,59,62,64,69,71,88,89,94};

    public static int getMinimum(int[] randomNumbers){
        int minimum= randomNumbers[0];
        for(int i=0; i<randomNumbers.length;i++){
            if(minimum>randomNumbers[i]){
                minimum=randomNumbers[i];
            }
        }
        return minimum;
    }
    public static int getMaximum(int[] randomNumbers){
        int maximum= randomNumbers[0];
        for(int i=0; i<randomNumbers.length;i++){
            if(maximum<randomNumbers[i]){
                maximum=randomNumbers[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {

        int chosenOption;
        do {

            System.out.println("0.Find the minimum and the maximum of the array");
            System.out.println("1.Find the average of array");
            System.out.println("2.Find the sum of elements");
            System.out.println("3.Exit");
            System.out.print("Enter a choice: ");

            Scanner input = new Scanner(System.in);
            chosenOption = input.nextInt();

            if (chosenOption == 0){
                // FIND THE MINIMUM AND THE MAXIMUM OF THE ARRAY
                System.out.println("Minimum value of array : " +getMinimum(randomNumbers));
                System.out.println("Maximum value of array : " +getMaximum(randomNumbers));

            }

            if (chosenOption == 1){
                // FIND THE AVERAGE OF ARRAY
            }

            if (chosenOption == 2){
                // FIND THE SUM OF ELEMENTS
            }


        } while (chosenOption != 3);
    }
}