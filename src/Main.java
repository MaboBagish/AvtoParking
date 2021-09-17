import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println ("\n_______________Лабораторная работа: симулятор парковки___________" );
        int kolichestvoTachek = 200;
        int nashaParkovka = 20;
        Date date = new Date (  );
        System.out.println ("\n Время начала тестирования программы "+date.toString () );

        long fiveMinutes =measureTime (() -> {
                    try {
                        Thread.sleep (5000);
                    } catch (InterruptedException e) {
                    }
                }

        );
        double coefCenZaParkovku = fiveMinutes/5;

     double cenaFiveMinutes = coefCenZaParkovku*10;

        LocalDateTime ldtStart = LocalDateTime.now ();
        LocalDateTime ldtFinish = ldtStart.plusDays (30);
        System.out.println (ldtStart );
        System.out.println (ldtFinish );






}
    public static long measureTime(Runnable codeToMeasure) {
        Long startTime = System.nanoTime ( );
        codeToMeasure.run ( );
        return (System.nanoTime ( ) - startTime) / 1000000000;
    }
}