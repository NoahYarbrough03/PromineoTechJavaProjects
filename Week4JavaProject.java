
public class Week4JavaProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Task 1: Created an array of integers
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
        // Task 1: Subtract the first element from the last element without directly using ages[7]
        int result = ages[0] - ages[ages.length - 1];
        
        // Task 1: Print the result to the console
        System.out.println("Result of the first element minus the last element: " + result);
        
        // Task 1: Create a new array with one more element than the 'ages' array
        int[] newAges = new int[ages.length + 1];
        
        // Task 1: Copy the elements from the 'ages' array to the new array
        for (int i = 0; i < ages.length; i++) {
            newAges[i] = ages[i];
        }
        
        // Task 1: Calculate and store the result again
        result = newAges[0] - newAges[newAges.length - 1];
        
        // Task 1: Print the result to the console
        System.out.println("Result of the first element minus the last element in the new array: " + result);
        
        // Task 1: Use a loop to calculate the average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        
        // Task 1: Calculate the average
        double average = (double) sum / ages.length;

        // Task 1: Print the average age to the console
        System.out.println("Average age: " + average);

                  // Task 2: Create an array of strings called 'names'
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
                  // Task 5: Create an array to store name lengths
        int[] nameLengths = new int[names.length];

        // Task 5: Loop to calculate and store name lengths
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

                  // Task 6: Calculate and print the sum of name lengths
        int sumOfNameLengths = calculateSum(nameLengths);
        System.out.println("Sum of name lengths: " + sumOfNameLengths);

                 // Task 7: Method to concatenate a word n times
        String concatenatedWord = concatenateWord("Hello", 3);
        System.out.println("Concatenated word: " + concatenatedWord);

                 // Task 8: Method to create a full name
        String fullName = createFullName("John", "Doe");
        System.out.println("Full name: " + fullName);

                 // Task 9: Method to check if the sum of an array of ints is greater than 100
        int[] numbers = {30, 40, 35};
        boolean sumGreaterThan100 = isSumGreaterThan100(numbers);
        System.out.println("Sum greater than 100: " + sumGreaterThan100);

                // Task 10: Method to calculate the average of an array of doubles
        double[] values = {12.5, 20.0, 17.5};
        double avg = calculateAverage(values);
        System.out.println("Average value: " + avg);

                // Task 11: Method to compare the averages of two arrays of doubles
        double[] array1 = {12.5, 20.0, 17.5};
        double[] array2 = {10.0, 15.0, 20.0};
        boolean avgComparison = compareAverages(array1, array2);
        System.out.println("Average of array1 > Average of array2: " + avgComparison);

               // Task 12: Method to determine if a person will buy a drink
        boolean hotOutside = true;
        double moneyInPocket = 12.0;
        boolean willBuyDrink = willBuyDrink(hotOutside, moneyInPocket);
        System.out.println("Will buy a drink: " + willBuyDrink);
    }

                // Task 1: Method to calculate the sum of an array of ints
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

                // Task 7: Method to concatenate a word n times
    public static String concatenateWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

               // Task 8: Method to create a full name
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

              // Task 9: Method to check if the sum of an array of ints is greater than 100
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = calculateSum(array);
        return sum > 100;
    }

              // Task 10: Method to calculate the average of an array of doubles
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Task 11: Method to compare the averages of two arrays of doubles
    public static boolean compareAverages(double[] array1, double[] array2) {
        double avg1 = calculateAverage(array1);
        double avg2 = calculateAverage(array2);
        return avg1 > avg2;
    }

    // Task 12: Method to determine if a person will buy a drink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
}


