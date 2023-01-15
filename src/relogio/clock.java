package relogio;

import java.text.SimpleDateFormat;
import java.util.Date;



public class clock extends Thread {
    public void run() {
        while (true) {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            System.out.println(dateFormat.format(date));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        clock clock = new clock();
        clock.start();
    }
}
