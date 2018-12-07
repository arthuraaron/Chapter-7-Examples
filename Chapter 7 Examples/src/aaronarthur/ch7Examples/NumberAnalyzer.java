package aaronarthur.ch7Examples;

// Aaron Arthur 12/18 Number analyzer

public class NumberAnalyzer {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Get array
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		
		double[] numbers = new double[n];
		double sum = 0;
		
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			System.out.print((i+1)+ ": ");
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		// Sort array
		double temp;
		for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
                
            }
            
        }
		
		// Find average
		double avg = sum / numbers.length;
		int belowAvg = 0;
		int aboveAvg = 0;
		
		// Below and above average
		for (double element:numbers) {
			if (element < avg) {
				belowAvg += 1;
			}
			else {
				aboveAvg += 1;
			}
			
		}	
		
		// Min and max
		double min = numbers[0];
		double max = numbers[0];
		for (double element:numbers) {
			if (element > max) {
				max = element;
			}
			if (element < min) {
				min = element;
			}
			
		}
		
		// Find median
		double median;
		int middleEven = 0, middleOdd = 0;
		
		// Determine if list is even or odd
		if (n % 2 == 0) {
			middleEven = n / 2;
		}
		else {
			middleOdd = (n - 1) / 2;
		}
		
		// Get median
		if (middleOdd != 0) {
			median = numbers[middleOdd];
		}
		else {
			double mid1 = numbers[middleEven];
			double mid2 = numbers[middleEven-1];
			median = (mid1 + mid2) / 2;
			
		}
		
		
		
		// Find mode
		double mode = numbers[0];
		int maxCount = 0;
		
		for (int i = 0; i < n; i++) {
	        double value = numbers[i];
	        int count = 1;
	        for (int j = 0; j < n; j++) {
	            if (numbers[j] == value) count++;
	            if (count > maxCount) {
	                mode = value;
	                maxCount = count;
	            }
	        }
	    }
		
		
		System.out.println("\nStats: ");
		System.out.println("Average: " + avg);
		System.out.println("Numbers below average: " + belowAvg);
		System.out.println("Numbers above average: " + aboveAvg);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Mean: " + avg);
		System.out.println("Median: " + median);
		System.out.println("Mode: " + mode);
		
	}

}
