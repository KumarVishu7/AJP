package Day4;

class HillStations {
    // Method to print location
    public void location() {
        System.out.println("Location: Hill Station.");
    }

    // Method to print famous for
    public void famousFor() {
        System.out.println("Famous for: Natural Beauty.");
    }
}

// Subclass Manali extends HillStations
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Manali, Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Snow-capped mountains, adventure sports.");
    }
}

// Subclass Mussoorie extends HillStations
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Mussoorie, Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Scenic beauty, colonial heritage.");
    }
}

// Subclass Gulmarg extends HillStations
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Gulmarg, Jammu & Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Skiing and snowboarding.");
    }
}
public class HillStation {
    public static void main(String[] args) {
        // 1. Calling the methods by using the Parent class reference
        HillStations  hillStation1 = new Manali();
        hillStation1.location();
        hillStation1.famousFor();

        System.out.println();

        // Referring to the Mussoorie object
        HillStations hillStation2 = new Mussoorie();
        hillStation2.location();
        hillStation2.famousFor();

        System.out.println();

        // Referring to the Gulmarg object
        HillStations hillStation3 = new Gulmarg();
        hillStation3.location();
        hillStation3.famousFor();

        System.out.println();

        // 2. Calling the methods by using subclass objects directly
        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        System.out.println();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        System.out.println();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}
