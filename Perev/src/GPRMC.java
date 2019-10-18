public class GPRMC {
    private static String str4="$GPRMC,144326.00,A,5107.0017737,N,11402.3291611,W,0.080,323.3,210307.00,0.0,E,A*20";

    public GPRMC() {
        System.out.println(str4);
        str4=str4.replaceAll("\\,|\\$|\\*"," "); // удаление пробелов
        str4 = str4.trim(); //удаление 1 и последнего пробела

        String[] res1 = str4.split(" "); // выделение значения после пробела

        String name=res1[0];;
        String str = res1[1];
        String[] res3=str.split("[.]"); //получение секунд
        str = str.replaceAll("(.{2})", "$1 "); //разделение массива для времени
        String[] res2 = str.split(" "); // выделение значения после пробела
        int hour=res2[0].equals("") ? 0 : Integer.parseInt(res2[0]);
        int minute=res2[1].equals("") ? 0 : Integer.parseInt(res2[1]);
        int second=res2[2].equals("") ? 0 : Integer.parseInt(res2[2]);
        int msecond=res3[0].equals("") ? 0 : Integer.parseInt(res3[0]);
        char pos_status=res1[2].equals("")? 0 : res1[2].charAt(0);
        double latitude=res1[3].equals("")? 0 : Double.parseDouble(res1[3]);
        char latitude_direction=res1[4].equals("")? 0 : res1[4].charAt(0);
        double longitude=res1[5].equals("")? 0 : Double.parseDouble(res1[5]);
        char longitude_direction=res1[6].equals("")? 0 : res1[6].charAt(0);
        double speed=res1[7].equals("")? 0 : Double.parseDouble(res1[7]);
        double track=res1[8].equals("")? 0 : Double.parseDouble(res1[8]);
        String strt = res1[9];
        strt = strt.replaceAll("(.{2})", "$1 "); //разделение массива для времени
        String[] res4 = strt.split(" "); // выделение значения после пробела
        int day=res4[0].equals("") ? 0 : Integer.parseInt(res4[0]);
        int month=res4[1].equals("") ? 0 : Integer.parseInt(res4[1]);
        int year=res4[2].equals("") ? 0 : Integer.parseInt(res4[2]);
        double mag_var=res1[10].equals("")? 0 : Double.parseDouble(res1[9]);
        char var_dir=res1[11].equals("")? 0 : res1[6].charAt(0);
        char mode_ind=res1[12].equals("")? 0 : res1[6].charAt(0);

        int summa=res1[13].equals("")? 0 : Integer.parseInt(res1[13]);

        System.out.println("Название способа: " + name);
        System.out.println("время статус положения: " + hour+":"+minute+":"+second+":"+msecond); // часы, минуты, секунды, милисекунды
        System.out.println("Статус позиции: " + pos_status);
        System.out.println("Широта: " + latitude);
        System.out.println("Направление широты: " + latitude_direction);
        System.out.println("Долгота: " + longitude);

        System.out.println("Направление долготы (E = Восток, W = Запад): " + longitude_direction);
        System.out.println("Скорость над землей: " + speed);
        System.out.println("Трасса: " + track);
        System.out.println("Дата: " + day+"/"+month+"/"+year);
        System.out.println("Магнитное отклонение: " + mag_var);
        System.out.println("Магнитное направление: " + var_dir);
        System.out.println("Индикатор режима: " + mode_ind);

        System.out.println("Контрольная сумма " + summa);
    }
}
