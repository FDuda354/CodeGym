package pl.codegym.task.task14.task1408;

 class NorthAmericanHen extends Hen
{
    int getMonthlyEggCount()
    {

        return 3;
    }
    String getDescription()
    {

        return (super.getDescription()+ " Pochodze z "+Continent.NORTHAMERICA+". Znosze "+this.getMonthlyEggCount()+" jaj na miesiąc.");
    }
}