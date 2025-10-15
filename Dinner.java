public class EvenNumbers {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number += 2) {
	System.out.print("This are even numbers from 1 to 100: " + even + " ");
        }
    }
}

public class OddNumbers {
    public static void main(String[] args) {
        for (int number = 51; number <= 100; number += 2) {
          System.out.println("This are odd numbers from 50 to 100: " + odd + " ");
        }
    }
}


public class DownNumbers {
    public static void main(String[] args) {
        for (int number = 100; number >= 1; number--) {
        System.out.print("This are numbers from 1 to 100: " + numbers + " ");
        }
    }
}



public class Squares {
    public static void main(String[] args) {
        for (int number = 1; number <= 20; number++) {
  	System.out.print("This are the square of numbers from 1 to 200: " + square + " ");
        }
    } 
}


public class MultiplesOfThree {
    public static void main(String[] args) {
        for (int number = 3; number <= 50; number += 3) {
	System.out.println("This are the multiples of 3 between 1 and 50: " + number + " ");
        }
    }
}



public class Divisible {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("number");
            }
        }
    }
}



public class CountDivisibleBySeven {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 1; number <= 100; number++) {
            if (number % 7 == 0) {
                count++;
            }
        }
        System.out.println("number");
    }
}



public class SumFirstFifty {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 50; number++) {
            sum += number;
        }
        System.out.println("sum");
    }
}


public class ProductFirstTen {
    public static void main(String[] args) {
        int product = 1;
        for (int number = 1; number <= 10; number++) {
            product *= number;
        }
        System.out.println("product");
    }
}

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int number = 1; number <= 10; number++) {
            System.out.println(num + "  " + number + " = " + (num * number));
        }
        
    }
}


import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String number = scanner.nextLine().toLowerCase();
        int count = 0;
        for (int count = 0; count < str.length(); count++) {
            char c = str.charAt();
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);
        
    }
}




