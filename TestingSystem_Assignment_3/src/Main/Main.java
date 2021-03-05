package Main;

import java.sql.Array;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            InputValue input = new InputValue();
            Controller ctrl = new Controller();
            
            try {
                int choice;
                do {
                    int[] arr = {1, 2, 3};

                    Scanner sc = new Scanner(System.in);
                    System.out.printf("Enter choice: ");

                    choice = sc.nextInt();

                    
                        switch (choice) {
                           
                            case 1: {
                            	ctrl.Q1_1();
                                continue;
                            }
                            
                            case 2: {
                                ctrl.Q1_2();
                                
                                continue;
                            }
                           
                            case 3: {
                            	ctrl.Q5_6();
                            	continue;
                            }

                            default: {
                            	System.out.println("Done!");
                                System.exit(0);
                            }

                        }
                    
                } while (true);

            } catch (Exception e) {
                System.out.println("Enter number.");
            }

        }

    }
}
