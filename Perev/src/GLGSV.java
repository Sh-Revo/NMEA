public class GLGSV {
    private static String str2="$GLGSV,2,2,08,84,63,225,,83,58,039,,67,08,037,,85,17,223,*68";

    public GLGSV() {

            System.out.println(str2);
            str2=str2.replaceAll("\\,|\\$|\\*"," "); // удаление пробелов
            str2 = str2.trim(); //удаление 1 и последнего пробела

            String[] res1 = str2.split(" "); // выделение значения после пробела
            String name=res1[0];;
            int number_posts=res1[1].equals("")? 0 : Integer.parseInt(res1[1]);
            int message_number=res1[2].equals("")? 0 : Integer.parseInt(res1[2]);
            int satellite=res1[3].equals("")? 0 : Integer.parseInt(res1[3]);
            int satellite_number=res1[4].equals("")? 0 : Integer.parseInt(res1[4]);
            int angle=res1[5].equals("")? 0 : Integer.parseInt(res1[5]);
            int azimuth=res1[6].equals("")? 0 : Integer.parseInt(res1[6]);
            int signal_strength=res1[7].equals("")? 0 : Integer.parseInt(res1[7]);

            int satellite_number2=res1[8].equals("")? 0 : Integer.parseInt(res1[8]);
            int angle2=res1[9].equals("")? 0 : Integer.parseInt(res1[9]);
            int azimuth2=res1[10].equals("")? 0 : Integer.parseInt(res1[10]);
            int signal_strength2=res1[11].equals("")? 0 : Integer.parseInt(res1[11]);

            int satellite_number3=res1[12].equals("")? 0 : Integer.parseInt(res1[12]);
            int angle3=res1[13].equals("")? 0 : Integer.parseInt(res1[13]);
            int azimuth3=res1[14].equals("")? 0 : Integer.parseInt(res1[14]);
            int signal_strength3=res1[15].equals("")? 0 : Integer.parseInt(res1[15]);

            int satellite_number4=res1[16].equals("")? 0 : Integer.parseInt(res1[16]);
            int angle4=res1[17].equals("")? 0 : Integer.parseInt(res1[17]);
            int azimuth4=res1[18].equals("")? 0 : Integer.parseInt(res1[18]);
            int signal_strength4=res1[19].equals("")? 0 : Integer.parseInt(res1[19]);

            int summa=res1[20].equals("")? 0 : Integer.parseInt(res1[20]);

            System.out.println("Название способа " + name);
            System.out.println("Количество сообщений " + number_posts);
            System.out.println("номер сообщений: " + message_number);
            System.out.println("Количество спутников: " + satellite);

            System.out.println("Номер спутника " + satellite_number);
            System.out.println("Угол возвышения " + angle);
            System.out.println("Азимут в градусах " + azimuth);
            System.out.println("Уровень сигнала " + signal_strength);

            System.out.println("Номер спутника " + satellite_number2);
            System.out.println("Угол возвышения " + angle2);
            System.out.println("Азимут в градусах " + azimuth2);
            System.out.println("Уровень сигнала " + signal_strength2);

            System.out.println("Номер спутника " + satellite_number3);
            System.out.println("Угол возвышения " + angle3);
            System.out.println("Азимут в градусах " + azimuth3);
            System.out.println("Уровень сигнала " + signal_strength3);

            System.out.println("Номер спутника " + satellite_number4);
            System.out.println("Угол возвышения " + angle4);
            System.out.println("Азимут в градусах " + azimuth4);
            System.out.println("Уровень сигнала " + signal_strength4);

            System.out.println("Контрольная сумма " + summa);

    }
}
