package pl.codegym.task.task15.task1522;

public class Sun implements Planet
{

    private static volatile Sun instance = null; //volatile robi zmienna ulotna czyli przed skorzystaniem z tej zmiennej musi sprawdzic co aktualnie sie w niej znajduje

    private Sun() //prywatny konstruktor uniemozliwia stworzneie normalne obiektu
    {
        if (instance != null)
            throw new RuntimeException("Not allowed. Please use getInstance() method");

    }

    public static Sun getInstance() //utworzenie obiektu poprzez metode
    {
        if (instance == null)
            synchronized (Sun.class) //klilka watków nie moze naraz wykonac tej metody tylko ten najszybszy a pozostale czekają aż skonczy
            {
                if (instance == null)
                    instance = new Sun();

            }
        return instance;
    }
}