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

    public static int sumEvenIndexes(int[] randomNumbers){
        int sum = 0;
        for(int i = 0; i < randomNumbers.length; i++){
            if(i % 2 == 0){
                sum += randomNumbers[i];
            }
        }
        return sum;
    }
    public static int sumOddIndexes(int[] randomNumbers){
        int sum = 0;
        for(int i = 0; i < randomNumbers.length; i++){
            if(i % 2 == 1){
                sum += randomNumbers[i];
            }
        }
        return sum;
    }
    int[] avr;
    public static average (int[] randomNumbers){
        int length = randomNumbers.length;
        avr = new int[length];
        double sum = 0;
        int average;
        for (int num : randomNumbers) {
            sum += num;
        }
        average = (int)sum / length;
        for (int i = 0; i < randomNumbers.length; i++){
            avr[i] = average - randomNumbers[i];
        }
    }
    public void display() {
        System.out.print("{");
        for (int i = 0; i < avr.length; i++) {
            System.out.print(avr[i]);

            if (i < avr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
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
                System.out.print("differnce from average is:")
                    display();
            }

            if (chosenOption == 2){
                System.out.println("Sum of elements at even-numbered indexes: " + sumEvenIndexes(randomNumbers));
                System.out.println("Sum of elements at odd-numbered indexes: " + sumOddIndexes(randomNumbers) );
            }


        } while (chosenOption != 3);
    }
  
}
