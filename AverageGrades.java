/*
Name: Joshua Boswell
Class CS 3305 #2
Term: Spring 2022
Instructor: Dr. Haddad
Assignment 1
 */
import java.util.Scanner;
public class AverageGrades {
    static Scanner sc = new Scanner(System.in);

    public static double findAverage(int[] x, int y, int size){
        if(y == x.length - 1){
            return x[y];//base case for recursion to end.
        }
        return x[y] + findAverage(x,y+1 , size) / size; // recursive call to add all grades together and ten divides by number of grades
    }

    public static void main(String[] args){
        int menu;
        int userInput;
        int classSize = 0;
        int[] classList = new int[0];
        //classList array is created

        do {
            System.out.println("---------MAIN MENU---------\n" + "1. Read class size\n" + "2. Read class grades\n" + "3. Compute class average\n" + "4. Exit Program\n" +"Enter option number");
            userInput = sc.nextInt();
            menu = userInput;

            switch (menu) {
                case 1:
                    System.out.println("Enter class size:");
                        classSize= sc.nextInt();
                            sc.nextLine();
                            classList = new int[classSize];
                            //size of array is adjusted to match the class size
                    break;
                case 2:
                    System.out.println("Enter class grades:");
                    for (int i: classList) {
                        classList[i] = sc.nextInt();
                            sc.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Class average:");
                    double classSum = findAverage(classList, 0, classSize);
                        System.out.println(classSum);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error: Please enter valid input");
                    menu = 0;
                    break;
            }
        } while (menu != 4);
    }
}
