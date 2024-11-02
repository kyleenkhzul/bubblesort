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
            
            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] > numbers[i+1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
    }
}

