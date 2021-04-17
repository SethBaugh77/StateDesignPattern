/**
 * Class that represents the TV used to control all the changes.
 * @author Seth Baugh
 */
public class TV {
    private State homeState;
    private State netflixState;
    private State HuluState;
    private State state;

    /**
     * Constructor to create the TV Object.
     */
    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = homeState;
    }

    /**
     * Method that calls the homeButtonMethod for the state.
     */
    public void pressHomeButton() {
        state.pressHomeButton();

    }

    /**
     * Method that calls the NetflixButton for the State.
     */
    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    /**
     * Method that calls the Hulu Button for the state.
     */
    public void pressHuluButton() {
        state.pressHuluButton();
    }

    /**
     * Method that calls the Movie Button for the State.
     */
    public void pressMovieButton() {

        state.pressMovieButton();
    }

    /**
     * Method that calls the TV Button for the state.
     */
    public void pressTVButton() {

        state.pressTVButton();
    }

    /**
     * Method that sets the State.
     * @param state State that is set
     */
    public void setState(State state) {

        this.state = state;

    }

    /**
     * Getter to return the HuluState.
     * @return HuluState
     */
    public State getHuluState() {
        return HuluState;
    }

    /**
     * Getter to return NeflixState.
     * @return netflixState
     */
    public State getNetflixState() {
        return netflixState;
    }

    /**
     * Getter to return homeState.
     * @return homeState
     */
    public State getHomeState() {
        return homeState;
    }

}
