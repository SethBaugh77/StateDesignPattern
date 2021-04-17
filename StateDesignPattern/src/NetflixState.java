/**
 * Class that represents the state of a TV being in Netflix.
 * @author Seth Baugh
 */
public class NetflixState implements State {
    private TV tv;

    /**
     * Constructor to create the object.
     * @param tv reference to TV found in driver.
     */
    NetflixState(TV tv) {
        this.tv = tv;
    }

    /**
     * Method to switch State to Home.
     */
    public void pressHomeButton() {
        System.out.println("Loading Home Screen");
        System.out.println();

        tv.setState(tv.getHomeState());
    }

    /**
     * Method to Switch State to Hulu.
     */
    public void pressHuluButton() {
        System.out.println("Loading Hulu");
        System.out.println();
        tv.setState(tv.getHuluState());
    }

    /**
     * Method to print out TV shows related to Netflix.
     */
    public void pressTVButton() {
        System.out.println("Netflix TV Shows:");
        System.out.println("-Hannah Montana");
        System.out.println("-Lost");
        System.out.println("-Walking Dead");
        System.out.println("-Series of Unfortunate Events");
        System.out.println("-The Flash");
        System.out.println();
    }

    /**
     * Method to print out movies related to Neflix.
     */
    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        System.out.println("-The Conjuring");
        System.out.println("-Spider Man 3");
        System.out.println("-Shawshank Redemption");
        System.out.println("-Men In Black");
        System.out.println("-Forest Gump");
        System.out.println();
    }

    /**
     * Method to tell user he/she is already in Netflix state.
     */
    public void pressNetflixButton() {
        System.out.println("You are already on Netflix");
        System.out.println();
    }
}
