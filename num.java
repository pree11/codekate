Scanner input = new Scanner(System.in);

int array[] = new int[10];

System.out.println("Enter the numbers now.");

for (int i = 0; i < array.length; i++) {
    int next = input.nextInt();

    if (next == 999) {
        break;
    }
    array[i] = next;
    
    getMaxValue(array);
    
    getMinValue(array);
}

System.out.println("These are the numbers you have entered.");
printArray(array);


public static int getMaxValue(int[] array) {
    int maxValue = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > maxValue) {
            maxValue = array[i];
        }
    }
    return maxValue;
}
public static int getMinValue(int[] array) {
    int minValue = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] < minValue) {
            minValue = array[i];
        }
    }
    return minValue;
}



public static void printArray(int arr[]) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
