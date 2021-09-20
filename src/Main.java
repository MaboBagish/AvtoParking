import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

    Avto avto = new Avto ( );


    public static void  main(String[] args) {
        Check check = new Check ();
        Random random = new Random ( );
        System.out.println ("\n_______________Лабораторная работа: симулятор парковки___________");
        int kolichestvoTachek = 200;
        int nashaParkovka = 20;
        ArrayList<Integer> carVputi = new ArrayList<> (200);
        for (int i = 1; i <= 200; i++) {
            carVputi.add (i);
        }
        ArrayList<Integer> carNaParkovke = new ArrayList<> (200);

        Date date = new Date ( );
        System.out.println ("\n Время начала тестирования программы " + date.toString ( ));

        long fiveMinutes = measureTime (() -> {
                    try {
                        Thread.sleep (5000);
                    } catch (InterruptedException e) {
                    }
                }

        );
        double coefCenZaParkovku = fiveMinutes / 5;

        double cenaFiveMinutes = coefCenZaParkovku * 10;

        LocalDateTime ldtStart = LocalDateTime.now ( );
        LocalDateTime ldtFinish = ldtStart.plusDays (30);
        System.out.println (ldtStart);
        System.out.println (ldtFinish);
        LocalDateTime changeJobParkovka = LocalDateTime.now ( );
int b=0;


        for (LocalDateTime a = ldtStart; a.isBefore (ldtFinish); a = a.plusMinutes (5)) {


            LocalTime now = LocalTime.now ();
            LocalTime polChasa = now.plusMinutes (30);
            System.out.println ("\n"+b+"  день работы парковки " + a);
            System.out.println ("###########################################################\n");

            List<Integer> sravnenie = new ArrayList<> (  );

            if (changeJobParkovka.getHour ( ) > 9 & changeJobParkovka.getHour ( ) < 21)
            {

                System.out.println ("Включен режим платной парковки.\nПервые 30 минут парковки бесплатные.\nПосле 30 минут включается тариф 10 центов за 5 минут");






                    for (int i = 1; i < carVputi.size ( ); i++) {

                        if (random.nextDouble ( ) < 0.03) {
                            carNaParkovke.add (carVputi.get (i));
                            carVputi.remove (i);
                        }
                    }

                    for (int i = 1; i < carNaParkovke.size ( ); i++) {

                        if (random.nextDouble ( ) < 0.03) {
                            carVputi.add (carNaParkovke.get (i));

                            carNaParkovke.remove (i);

if (a==ldtStart){
    sravnenie.add (carNaParkovke.size ());
}
                        }

                    }

                System.out.println ("++++++++++++++++++++"+sravnenie );
                check.setVseAvtoNaParkovke (carNaParkovke) ;
                System.out.println ("xxxxxxxxxxxxxxxx"+check.getVseAvtoNaParkovke () );

                    System.out.println ("Машины на парковке " + carNaParkovke);
                    System.out.println ("Машины в движении " + carVputi);
                    int kolichestvoAvtoNaParkovke = carNaParkovke.size ( );
                    System.out.println ("Количество машин на парковке "+kolichestvoAvtoNaParkovke);
if(polChasa.isBefore (now)){

            }

            }else {
                System.out.println ("Режим бесплатной парковки. С учетом состояния машин" );
                for (int i = 1; i < carVputi.size ( ); i++) {

                    if (random.nextDouble ( ) < 0.03) {
                        carNaParkovke.add (carVputi.get (i));
                        carVputi.remove (i);
                    }
                }

                for (int i = 1; i < carNaParkovke.size ( ); i++) {

                    if (random.nextDouble ( ) < 0.03) {
                        carVputi.add (carNaParkovke.get (i));

                        carNaParkovke.remove (i);
                        if (a==ldtStart.plusMinutes (20)){
                            sravnenie.addAll (carNaParkovke);
                        }

                    }

                }
                System.out.println ("++++++++++++++++++++"+sravnenie );
                System.out.println ("Машины на парковке " + carNaParkovke);
                System.out.println ("Машины в движении " + carVputi);
                int kolichestvoAvtoNaParkovke = carNaParkovke.size ( );
                System.out.println ("Количество машин на парковке "+kolichestvoAvtoNaParkovke);

            }
        }

    }


    public static long measureTime(Runnable codeToMeasure) {
        Long startTime = System.nanoTime ( );
        codeToMeasure.run ( );
        return (System.nanoTime ( ) - startTime) / 1000000000;
    }

}
