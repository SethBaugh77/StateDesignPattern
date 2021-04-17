/**
 * Class that represents the state of a TV being in Hulu.
 * @author Seth Baugh
 */
public class HuluState implements State {
    private TV tv;

    /**
     * Constructor to Hulu State Object.
     * @param tv reference to instance of TV found in driver.
     */
    HuluState(TV tv) {
        this.tv = tv;
    }

    /**
     * Method to switch state to home.
     */
    public void pressHomeButton() {
        System.out.println("Loading Home Screen");
        System.out.println();
        tv.setState(tv.getHomeState());
    }

    /**
     * Method to tell user he/she is in Hulu State.
     */
    public void pressHuluButton() {
        System.out.println("You are already on Hulu");
        System.out.println();
        tv.setState(tv.getHuluState());
    }

    /**
     * Method to print out TV shows related to Hulu.
     */
    public void pressTVButton() {
        System.out.println("Hulu TV Shows: ");
        System.out.println("-The Office");
        System.out.println("-Bear in the big blue house");
        System.out.println("-Criminal Minds");
        System.out.println("-Stranger Things");
        System.out.println("-Barely Alive");
        System.out.println();
    }

    /**
     * Method to print out movies related to Hulu.
     */
    public void pressMovieButton() {
        System.out.println("Hulu Movies: ");
        System.out.println("-The Revanant");
        System.out.println("-Murder on the Orient Express");
        System.out.println("-Spy Kids");
        System.out.println("-Lion King");
        System.out.println("-Harry Potter");
        System.out.println();
    }

    /**
     * Method to switch State to Netflix.
     */
    public void pressNetflixButton() {
        System.out.println("Loading Netflix");
        System.out.println();
        tv.setState(tv.getNetflixState());
    }
}
