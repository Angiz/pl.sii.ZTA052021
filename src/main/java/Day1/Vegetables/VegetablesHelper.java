package Day1.Vegetables;

public class VegetablesHelper {


    public void weightChecker(int weight, String fruit, int difference) {
        if (weight < 0) {
            System.out.println("Please provide additive number!");
            }
        else if (weight > 100) {
            System.out.println("There is too much "+fruit+"s. Please remove "+(-1*difference)+" kg.");
            }
        else if (weight < 100) {
            System.out.println("We still have "+difference+ " kg place for "+fruit);
            }
        else {
            System.out.println("You achieved maximum of "+fruit);
            }
    }
}
