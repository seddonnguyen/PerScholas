package module._303.pa._5._1;

public class PredictFutureTuition {
    public static void main(String[] args) {
/*
        Task 3: Predict Future Tuition
        Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
        In how many years will the tuition be doubled?
*/
        double tuition = 10000; // Year 0
        int year = 0;
        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.println("Tuition will be $" + tuition);
    }
}
