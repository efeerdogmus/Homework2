
public class average
{
    int[] avr;
    public average (int[] arr){
        int length = arr.length;
        avr = new int[length];
        double sum = 0;
        int average;
        for (int num : arr) {
            sum += num;
        }
        average = (int)sum / length;
        for (int i = 0; i < arr.length; i++){
            avr[i] = average - arr[i];
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
}