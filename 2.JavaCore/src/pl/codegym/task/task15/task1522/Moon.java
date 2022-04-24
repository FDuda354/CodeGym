package pl.codegym.task.task15.task1522;

public class Moon implements Planet
{

    private static volatile Moon instance = null; //volatile robi zmienna ulotna czyli przed skorzystaniem z tej zmiennej musi sprawdzic co aktualnie sie w niej znajduje

    private Moon() //prywatny konstruktor uniemozliwia stworzneie normalne obiektu
    {
        if (instance != null)
            throw new RuntimeException("Not allowed. Please use getInstance() method");

    }

    public static Moon getInstance() //utworzenie obiektu poprzez metode
    {
        if (instance == null)
            synchronized (Moon.class) //klilka watków nie moze naraz wykonac tej metody tylko ten najszybszy a pozostale czekają aż skonczy
            {
                if (instance == null)
                    instance = new Moon();

            }
        return instance;
    }
}