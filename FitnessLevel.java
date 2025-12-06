import java.util.Scanner;

public class FitnessLevel {
    int steps;

    public FitnessLevel(int steps) {
        this.steps = steps;
    }

    void getFitnessLevel() {
        if (steps >= 10000) {
            System.out.println("Excellent");
        } else if (steps >= 7000 && steps < 10000) {
            System.out.println("Good");
        } else if (steps >= 4000 && steps < 7000) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }
    }

    public static void main(String[] args) {
        int steps;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of steps for today: ");
        steps = input.nextInt();
        FitnessLevel fit = new FitnessLevel(steps);
        fit.getFitnessLevel();
        input.close();
    }
}