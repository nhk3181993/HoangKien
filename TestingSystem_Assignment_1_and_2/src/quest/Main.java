package quest;

import java.sql.Array;
import java.sql.Date;
import java.sql.Time;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Assignment1 assign1 = new Assignment1();
            Assignment2 assign2 = new Assignment2();
            try {
                int choice;
                do {
                    int[] arr = {1, 2, 3};

                    Scanner sc = new Scanner(System.in);
                    System.out.printf("Enter choice: ");

                    choice = sc.nextInt();

                    
                        switch (choice) {
                            // Assignment 1
                            case 1: {
                                assign1.A1();
                                continue;
                            }
                            // Assignment 2.1
                            case 2: {
                                assign2.A2_18();
                                
                                continue;
                            }
                            // Assignment 2.2
                            case 3: {
                            	assign2.A2_26();
                            	continue;
                            }
                            //check bai tap khac
                            case 4: {
                            	assign2.A2_35();
                            	continue;
                            }
                            

                            default: {
                            	System.out.println("Done!");
                                System.exit(0);
                            }

                        }
                    
                } while (true);

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}
