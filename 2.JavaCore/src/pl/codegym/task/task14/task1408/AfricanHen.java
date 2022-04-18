package pl.codegym.task.task14.task1408;


 class AfricanHen extends Hen
{
    int getMonthlyEggCount()
    {

        return 1;
    }
    String getDescription()
    {

        return (super.getDescription()+ " Pochodze z "+Continent.AFRICA+". Znosze "+this.getMonthlyEggCount()+" jaj na miesiąc.");
    }
}