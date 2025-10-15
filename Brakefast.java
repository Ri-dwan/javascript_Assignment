
public class Reverse {
    public static void main(String[] args) {
        String word = "hello";
        String backwards = "";
        for (count = word.length() - 1; count >= 0; count--) {
            backwards += word.charAt();
        }
        System.out.println("Result")
    }
}


public class Uppercase {
    public static void main(String[] args) {
        String word = "HelloWorld";
        int count = 0;
        for ( count = 0; count < word.length(); count++) {
            if (Character.isUpperCase(word.charAt())) {
                count++;
            }
        }
        System.out.println("Uppercase: "); 
    }
}



public class Lowercase {
    public static void main(String[] args) {
        String word = "HelloWorld";
        int count = 0;
        for (count = 0; count < word.length(); count++) {
            if (Character.isLowerCase(word.charAt())) {
                count++;
            }
        }
        System.out.println("Lowerase: ");
    }
}


public class Vowel {
    public static void main(String[] args) {
        String word = "hello";
        String vowels = "aeiou";
        int position = -1;
        for (count = 0; count < word.length(); count++) {
            if (vowels.indexOf(word.charAt()) != 1) {
                break;
            }
        }
        System.out.println("Vowel");
    }
}


public class Character {
    public static void main(String[] args) {
        String word = "hi";
        for ( count = 0; count < word.length(); count++) {
            char letter = word.charAt();
            System.out.println(letter + ": " +);
        }
    
    }
}


public class Average {
    public static void main(String[] args) {
        int total = 0;
        for ( count = 1; count <= 100; count++) {
            total += number;
        }
          average = total / 100;
        System.out.println("average");
    }
}


public class Divisor {
    public static void main(String[] args) {
        int number = 12;
        for (count = 1; count <= number; count++) {
            if (number== 0) {
                System.out.println("Devisor: ");
            }
        }
        
    }
}


public class Palindrome {
    public static void main(String[] args) {
        int number = 121;
        int number = number;
        int number = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number * 10 + digit;
        }
        if (number == number) {
            System.out.println("Yes, it's a palindrome");
        } else {
            System.out.println("No, it's not");
        }
        
    }
}


public class WordSentence {
    public static void main(String[] args) {
        String sentence = "semicolon";
        int count = 1;
        for (count = 0; count < sentence.length(); count++) {
            if (sentence.charAt() == ' ') {
                count++;
            }
        }
        System.out.println("Word sentence");
    }
}

public class Even {
    public static void main(String[] args) {
        int number = 123456;
        int total = 0;
        while (number > 0) {
            int number = number % 10;
            if (number % 2 == 0) {
                total += number;
            }
            number /= 10;
        }
        System.out.println("Even:");
    }
}

public class Odd {
    public static void main(String[] args) {
        int number = 123456;
        int total = 0;
        while (number > 0) {
            int number = number % 10;
            if (number % 2 != 0) {
                total += number;
            }
            number /= 10;
        }
        System.out.println("Odd:");
    }
}


