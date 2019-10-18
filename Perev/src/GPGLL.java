public class GPGLL {
    private static String str3="$GPGLL,5107.0013414,N,11402.3279144,W,205412.00,A,A*73";

    public GPGLL() {
        System.out.println(str3);
        str3=str3.replaceAll("\\,|\\$|\\*"," "); // удаление пробелов
        str3 = str3.trim(); //удаление 1 и последнего пробела

        String[] res1 = str3.split(" "); // выделение значения после пробела
        String name=res1[0];;
        double latitude=res1[1].equals("")? 0 : Double.parseDouble(res1[1]);
        char latitude_direction=res1[2].equals("")? 0 : res1[2].charAt(0);
        double longitude=res1[3].equals("")? 0 : Double.parseDouble(res1[3]);
        char longitude_direction=res1[4].equals("")? 0 : res1[4].charAt(0);

        double time_status=res1[5].equals("")? 0 : Double.parseDouble(res1[5]);
        String str = res1[5];
        String[] res3=str.split("[.]"); //получение секунд
        str = str.replaceAll("(.{2})", "$1 "); //разделение массива для времени
        String[] res2 = str.split(" "); // выделение значения после пробела

        char data_status=res1[6].equals("")? 0 : res1[6].charAt(0);
        char indicator=res1[7].equals("")? 0 : res1[7].charAt(0);
        int summa=res1[8].equals("")? 0 : Integer.parseInt(res1[8]);

        System.out.println("Название способа: " + name);
        System.out.println("Широта: " + latitude);
        System.out.println("Направление широты: " + latitude_direction);
        System.out.println("Долгота: " + longitude);
        System.out.println("Направление долготы (E = Восток, W = Запад): " + longitude_direction);
        System.out.println("время статус положения: " + res2[0]+":"+res2[1]+":"+res2[2]+"."+res3[1]); // часы, минуты, секунды, милисекунды
        System.out.println("Статус данных: A = Данные действительны, V = Данные неверны: " + data_status);
        System.out.println("Индикатор режима системы позиционирования: " + indicator);

        System.out.println("Контрольная сумма " + summa);
    }
}
