public class NetflixState extends State{
    private TV tv;

    public void pressHomeButton()
    {
        System.out.println("Loading Home Screen");
        State netflixState = new NetflixState();
        tv.setState();
    }

    public void pressHuluButton()
    {
        System.out.println("Loading Hulu");
    }

    public void pressTVButton()
    {
        System.out.println("The Office");
        System.out.println("Bear in the big blue house");
        System.out.println("Criminal Minds");
        System.out.println("Stranger Things");
        System.out.println("Barely Alive");
    }

    public void pressMovieButton()
    {
        System.out.println("The Revanant");
        System.out.println("Murder on the Orient Express");
        System.out.println("Spy Kids");
        System.out.println("Lion King");
        System.out.println("Harry Potter");
    }

    
    public void pressNetflixButton()
    {
        System.out.println("You are already on Netflix");
    }
}
