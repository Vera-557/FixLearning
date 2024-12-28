import java.time.LocalTime;

class Timer {
   LocalTime time = LocalTime.now();
   int minutes = time.getMinute();
   int seconds = time.getSecond();
   int hours = time.getHour();


   int timeFixer(){
       System.out.println("Старт/конец обучения");
       System.out.println(hours + " часов " + minutes + " минут " + seconds + " секунд");
       return 0;
   }

}
