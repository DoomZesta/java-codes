/*
EMMANUEL MWAMI
K63-10965-2024
 */
import java.util.Scanner;

class libraryfine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        String bookID = input.nextLine();
        System.out.print("Enter Due Date (number of days, e.g. 10): ");
        int dueDate = input.nextInt();
        System.out.print("Enter Return Date (number of days, e.g. 15): ");
        int returnDate = input.nextInt();
        int daysOverdue = returnDate - dueDate;
        if (daysOverdue < 0) {
            daysOverdue = 0;
        }
        int fineRate;
        if (daysOverdue <= 7) {
            fineRate = 20;
        } else if (daysOverdue <= 14) {
            fineRate = 50;
        } else {
            fineRate = 100;
        }
        int fineAmount = daysOverdue * fineRate;
        System.out.println("\nBook ID: " + bookID);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println("Fine Rate: Ksh. " + fineRate);
        System.out.println("Fine Amount: Ksh. " + fineAmount);
    }
}