import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

    Random rand = new Random();
    int[] numbers = new int[10];

    for(int i = 0; i < numbers.length; i++) {
        numbers[i] = rand.nextInt(1000000);
    }

    System.out.println("Before:");
    printArray(numbers);

    // Bubble Sorting Algorithm:
    bubbleSort(numbers);

    System.out.println("\nAfter:");
    printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static void bubbleSort(int[] inputArray) {
        boolean swappedSomething = true;

        while(swappedSomething) {
            swappedSomething = false;
            
            for(int i = 0; i < inputArray.length - 1; i++) {
                if(inputArray[i] > inputArray[i+1]) {
                    swappedSomething = true;
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = temp;
                }
            }
        }
    }
}

