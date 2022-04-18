package pl.codegym.task.task14.task1408;

/* 
Ferma drobiu
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            switch (continent) {
                case "Europa" :hen =  new EuropeanHen();break;
                case "Ameryka Północna" :hen =  new NorthAmericanHen();;break;
                case "Azja" :hen =  new AsianHen();;break;
                case "Afryka" :hen =  new AfricanHen();;break;
                default : hen = null;;break;

            };
            return hen;
        }
    }



}
