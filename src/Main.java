public class Main {

    public static void main(String[] args) {
        //abstrac sınıflar asla newlenemez
//
//        GameCalculator gameCalculator=new WomanGameCalculator();
//        gameCalculator.gameOver();
//        gameCalculator.hesapla();

        GameCalculator gameCalculator2=new ManGameCalculator();
        gameCalculator2.hesapla();
        gameCalculator2.gameOver();

        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();


    }
}
