package pl.codegym.task.task14.task1408;


  class EuropeanHen extends Hen
{
    int getMonthlyEggCount()
    {

        return 25;
    }
    String getDescription()
    {

        return (super.getDescription()+ " Pochodze z "+Continent.EUROPE+". Znosze "+this.getMonthlyEggCount()+" jaj na miesiąc.");
    }
}