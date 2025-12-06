public class Vacationcost {
    double accomodationCost;
    double mealCost;
    double activityCost;

    public Vacationcost(double accomodationCost, double mealCost, double activityCost) {
        this.accomodationCost = accomodationCost;
        this.mealCost = mealCost;
        this.activityCost = activityCost;
    }

    double calculateTotalCost() {
        return accomodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        Vacationcost trip = new Vacationcost(1256.87, 257.34, 28727.34);
        // trip.calculateTotalCost();
        System.out.println("Total Vacation Cost: = $" + trip.calculateTotalCost());
    }
}
