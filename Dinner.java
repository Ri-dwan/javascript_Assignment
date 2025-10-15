public class EvenNumbers {
    public static void main(String[] args) {
        for (count = 2; count <= 100; count += 2) {
	System.out.print("This are even numbers from 1 to 100: " + even + " ");
        }
    }
}

public class OddNumbers {
    public static void main(String[] args) {
        for (count = 51; count <= 100; count += 2) {
          System.out.println("This are odd numbers from 50 to 100: " + odd + " ");
        }
    }
}


public class DownNumbers {
    public static void main(String[] args) {
        for (count = 100; count >= 1; count--) {
        System.out.print("This are numbers from 1 to 100: " + numbers + " ");
        }
    }
}



public class Squares {
    public static void main(String[] args) {
        for (count = 1; count <= 20; count++) {
  	System.out.print("This are the square of numbers from 1 to 200: " + square + " ");
        }
    } 
}


public class MultiplesOfThree {
    public static void main(String[] args) {
        for (count = 3; count <= 50; count += 3) {
	System.out.println("This are the multiples of 3 between 1 and 50: " + number + " ");
        }
    }
}



public class Divisible {
    public static void main(String[] args) {
        for (count = 1; count <= 100; count++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("number");
            }
        }
    }
}



public class CountDivisibleBySeven {
    public static void main(String[] args) {
        int count = 0;
        for (count = 1; count <= 100; count++) {
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
        for (count = 1; count <= 50; count++) {
            sum += number;
        }
        System.out.println("sum");
    }
}


public class ProductFirstTen {
    public static void main(String[] args) {
        int product = 1;
        for (count = 1; count <= 10; count++) {
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
        for (count = 1; count <= 10; count++) {
            System.out.println(number + "  " + number + " = " + (number * number));
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
        for ( count = 0; count < str.length(); count++) {
            char c = str.charAt();
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);
        
    }
}




