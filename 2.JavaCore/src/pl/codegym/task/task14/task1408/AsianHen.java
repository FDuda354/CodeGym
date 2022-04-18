package pl.codegym.task.task14.task1408;

 class AsianHen extends Hen
{
    int getMonthlyEggCount()
    {

        return 14;
    }
    String getDescription()
    {

        return (super.getDescription()+ " Pochodze z "+Continent.ASIA+". Znosze "+this.getMonthlyEggCount()+" jaj na miesiąc.");
    }
}