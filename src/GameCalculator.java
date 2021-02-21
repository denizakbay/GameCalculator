public abstract class GameCalculator {
    public abstract void hesapla();//bu classı inheratence etmiş sınıflar kullanabilir.
    //ama override etmeli(herkes keni yapsın.)
    public final void gameOver(){//override edilemez burda neyse o.bitmiştir!!
        System.out.println("oyun bitti.");
    }
}