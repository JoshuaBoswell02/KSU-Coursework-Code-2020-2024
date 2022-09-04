/*
Name: Joshua Boswell
Class CS 3305 #2
Term: Spring 2022
Instructor: Dr. Haddad
Assignment 1
 */
import java.util.Scanner;
public class Vowels {
    static Scanner sc = new Scanner(System.in);
//This method counts the vowels in a string input
    public static int countVowel(String x){
        char c = x.charAt(0);
            c = Character.toLowerCase(c);//this set of code turns the char into a lowercase char so it can be compared
        int vowelTotal;

        if(c =='a'||c=='e'|| c=='i'||c=='o'||c=='u'){
            vowelTotal = 1;//if that char matches, the vowel total is changed to 1;
        }else{
            vowelTotal = 0;//if the char is not a vowel, vowel total is changed to 0;
        }
        if(x.length() == 1){
            return vowelTotal;//after comparison, if the length of the string is 1, the base case is met and the vowel total is returned
        }
        return countVowel(x.substring(1)) + vowelTotal;
        //Recursive call that slowly removes the first char of the string and makes the rest a substring.
        //This is done to slowly check each char of the string and once the base case is met, the vowel totals are added together.
    }

    public static void main(String[] args){
        int menu;
        int userInput;
        String userString = "";

        do {
            System.out.println("---------MAIN MENU---------\n" + "1. Read input string\n" + "2. Compute number of vowels\n" + "3. Exit program\n" + "Enter option number");
            userInput = sc.nextInt();
            menu = userInput;

            switch (menu) {
                case 1:
                    System.out.println("Enter input string:");
                        userString = sc.next();
                        sc.nextLine();
                        //User string is read in and stored
                    break;
                case 2:
                    System.out.println("You entered:" + userString);
                    int totalVowels = countVowel(userString);//Method call is made to our recursive method and this call passes in the user's string.
                                                             //Once the method finishes, the vowel total is stored as a variable
                    System.out.println("Number of vowels: " + totalVowels);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error: Please enter valid input");
                    menu = 0;
                    break;
            }
        } while (menu != 3);//This switch case menu runs as long as menu does not equal 3 in a do while loop.
    }
}
