package com.pluralsight;

import java.util.Scanner;

public class neighborhoodLibary {
    private static books[] Goodbooks = new books[20];
    private static int numGoodbooks = 7;
    public static void main(String[] args) {

        Goodbooks[0] = new books(73281, "3213-3213-3213-3213", "the lightnig Theif", false, "" );
        Goodbooks[1] = new books(64324, "6436-3432-3213-3213", "Charletts Web", false, "" );
        Goodbooks[2] = new books(86547, "3213-3523-5364-3213", "The boy in the stripped pajamas", false, "" );
        Goodbooks[3] = new books(23145, "3213-3213-8865-2353", "The Sea of monsters", false, "" );
        Goodbooks[4] = new books(74353, "3213-3213-3253-8657", "Wonder over yonder", false, "" );
        Goodbooks[5] = new books(97654, "3213-6765-7434-3213", "Five dollar foot long", false, "" );
        Goodbooks[6] = new books(12324, "8657-7643-3213-3213", "Murder mystery", false, "" );

        Scanner scan = new Scanner(System.in);

        boolean done = false;

        while (!done){
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("3 - Exit");

            int command = scan.nextInt();
            System.out.println("Choose an option: ");
            scan.nextLine();

            switch (command){
                case 1:
                    listAvailableBooks();
                    checkOutBook(scan);
                    break;

                case 2:
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    done = true;
                default:
                    System.out.println("Not an option BUB");
                    break;
            }
        }





    }
    public static void listAvailableBooks() {
        System.out.println("Available Books:");

        for (int i = 0; i < numGoodbooks; i++) {
            if (Goodbooks[i] != null && !Goodbooks[i].isCheckedOut()) {
                System.out.println(Goodbooks[i]);
            }
        }
    }
    public static void checkOutBook(Scanner scan) {

        System.out.print("Enter an ID to check out, or 0 to go back: ");
        int bookId = scan.nextInt();
        scan.nextLine();

        if (bookId == 0) {
            return;
        }

        for (int i = 0; i < numGoodbooks; i++) {
            if (Goodbooks[i] != null &&
                    //Compare book in arry to whats entered
                    Goodbooks[i].getBookid() == bookId &&
                    //if book is not checked out
                    !Goodbooks[i].isCheckedOut()) {
                System.out.print("Enter your name: ");
                String name = scan.nextLine();
                //entered name moved inte "checkerOut" from class
                Goodbooks[i].checkOut(name);
                //getTitle grabs title from whatever arry selected
                System.out.println(Goodbooks[i].getTitle() + " is checked out to " + name + ".");
                return;
            }
        }

        System.out.println("Book not found or already checked out.");
    }
}
