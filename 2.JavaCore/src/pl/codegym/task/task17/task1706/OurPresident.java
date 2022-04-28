package pl.codegym.task.task17.task1706;

public class OurPresident {
    private static volatile OurPresident president= null;

    static
    {
        if (president == null)
            synchronized (OurPresident.class) //klilka watków nie moze naraz wykonac tej metody tylko ten najszybszy a pozostale czekają aż skonczy
            {
                if (president == null)
                    president = new OurPresident();

            }

    }

    private OurPresident() {

        if (president != null)
            throw new RuntimeException("Not allowed. Please use getInstance() method");
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
