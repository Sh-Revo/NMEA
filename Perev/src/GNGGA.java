public class GNGGA {
    private static String str6="$GNGGA,054157.13,2307.1261,N,12016.4308,E,1,6,1.93,34.9,M,17.8,M,,*76";

    public GNGGA() {
        System.out.println(str6);
        str6 =str6.replaceAll("\\,|\\$|\\*"," "); // удаление пробелов
        str6 = str6.trim(); //удаление 1 и последнего пробела
        String[] res1 = str6.split(" "); // выделение значения после пробела

        String name=res1[0];;
        String str = res1[1];
        String[] res3=str.split("[.]"); //получение секунд
        //   System.out.println("res3="+res3[1]);
        str = str.replaceAll("(.{2})", "$1 "); //разделение массива для времени
        String[] res2 = str.split(" "); // выделение значения после пробела
        int hour=res2[0].equals("") ? 0 : Integer.parseInt(res2[0]);
        int minute=res2[1].equals("") ? 0 : Integer.parseInt(res2[1]);
        int second=res2[2].equals("") ? 0 : Integer.parseInt(res2[2]);
        int msecond=res3[0].equals("") ? 0 : Integer.parseInt(res3[0]);
        //char pos_status=res1[2].equals("")? 0 : res1[2].charAt(0);
        double latitude=res1[2].equals("")? 0 : Double.parseDouble(res1[2]);
        char latitude_direction=res1[3].equals("")? 0 : res1[3].charAt(0);
        double longitude=res1[4].equals("")? 0 : Double.parseDouble(res1[4]);
        char longitude_direction=res1[5].equals("")? 0 : res1[5].charAt(0);
        int quality=res1[6].equals("")? 0 : Integer.parseInt(res1[6]);
        int sats=res1[7].equals("")? 0 : Integer.parseInt(res1[7]);

        double hdop=res1[8].equals("")? 0 : Double.parseDouble(res1[8]);
        double alt=res1[9].equals("") ? 0 : Double.parseDouble(res1[9]);
        char a_units=res1[10].equals("") ? 0 : res1[10].charAt(0);
        double undulation=res1[11].equals("") ? 0 : Double.parseDouble(res1[11]);
        char u_units=res1[12].equals("")? 0 : res1[12].charAt(0);
        int age=res1[13].equals("")? 0 : Integer.parseInt(res1[13]);
        int stn_ID=res1[14].equals("")? 0 : Integer.parseInt(res1[14]);

        int summa=res1[15].equals("")? 0 : Integer.parseInt(res1[15]);

        System.out.println("Название способа: " + name);
        System.out.println("время статус положения: " + hour+":"+minute+":"+second+":"+msecond); // часы, минуты, секунды, милисекунды
        // System.out.println("Статус позиции: " + pos_status);
        System.out.println("Широта: " + latitude);
        System.out.println("Направление широты: " + latitude_direction);
        System.out.println("Долгота: " + longitude);

        System.out.println("Направление долготы (E = Восток, W = Запад): " + longitude_direction);
        System.out.println("Качество: " + quality);
        System.out.println("Количество используемых спутников: " + sats);
        System.out.println("Горизонтальное разбавление точности: " + hdop);
        System.out.println("Высота антенны: " + alt);
        System.out.println("Единицы высоты антенны: " + a_units);
        System.out.println("Волнистость: " + undulation);
        System.out.println("Единицы волнистости: " + u_units);
        System.out.println("Данные о возрасте коррекции: " + age);
        System.out.println("Дифференциальный идентификатор базовой станции: " + stn_ID);

        System.out.println("Контрольная сумма " + summa);
    }
}
