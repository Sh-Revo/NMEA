
import java.util.Scanner;
public class trans {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag=true;

         while (flag){
             System.out.println("Введите i: ");
             String i = in.nextLine();
            switch (i) {
                case "1": {
                    GPGSV GPGSV = new GPGSV();
                    flag=false;
                    break;
                }
                case "2": {
                    GLGSV GLGSV= new GLGSV();
                    flag=false;
                    break;
                }
                case "3": {
                    GPGLL GPGLL = new GPGLL();
                    flag=false;
                    break;
                }
                case "4": {
                    GPRMC GPRMC = new GPRMC();
                    flag=false;
                    break;
                }
                case "5": {
                    GPVTG GPVTG = new GPVTG();
                    flag=false;
                    break;
                }
                case "6": {
                    GNGGA GNGGA = new GNGGA();
                    flag=false;
                    break;
                }
                case "7": {
                    GPGSA GPGSA = new GPGSA();
                    flag=false;
                    break;
                }
                default:
                    System.out.println("Введите другое i");
                }
            }
        System.out.println("Конец");
    }
}
