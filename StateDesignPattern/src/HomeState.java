/**
 * Class that represents the state of a TV being in its home.
 * @author Seth Baugh
 */
public class HomeState implements State {
    private TV tv;

    /**
     * Constructor to make the object
     * @param tv reference to instance of TV in driver
     */
    HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * Method that tells user its already in its HomeState.
     */
    public void pressHomeButton() {
        System.out.println("TV is already on the Home screen");
        System.out.println();

    }

    /**
     * Method to change State to Hulu.
     */
    public void pressHuluButton() {
        System.out.println("Loading Hulu");
        System.out.println();
        tv.setState(tv.getHuluState());
    }

    /**
     * Method to print out TV shows related to Home.
     */
    public void pressTVButton() {
        System.out.println("Home: You must pick an app to display tv shows");
        System.out.println();
    }

    /**
     * Method to print movies related to Home.
     */
    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to display movies");
        System.out.println();
    }

    /**
     * Method to change state to Netflix.
     */
    public void pressNetflixButton() {
        System.out.println("Loading Netflix");
        System.out.println();

        tv.setState(tv.getNetflixState());
    }

}
