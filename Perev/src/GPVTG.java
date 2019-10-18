public class GPVTG {
    private static String str5="$GPVTG,134.395,T,134.395,M,0.019,N,0.035,K,A*33";

    public GPVTG() {
        System.out.println(str5);
        str5 = str5.replaceAll("\\,|\\$|\\*"," "); // удаление пробелов
        str5 = str5.trim(); //удаление 1 и последнего пробела

        String[] res1 = str5.split(" "); // выделение значения после пробела
        String name=res1[0];;
        double track_true=res1[1].equals("")? 0 : Double.parseDouble(res1[1]);
        char t=res1[2].equals("")? 0 : res1[2].charAt(0);
        double track_mag=res1[3].equals("")? 0 : Double.parseDouble(res1[3]);
        char m=res1[4].equals("")? 0 : res1[4].charAt(0);
        double speed_kn=res1[5].equals("")? 0 : Double.parseDouble(res1[5]);
        char n=res1[6].equals("")? 0 : res1[6].charAt(0);
        double speed_km=res1[7].equals("")? 0 : Double.parseDouble(res1[7]);
        char k=res1[8].equals("")? 0 : res1[8].charAt(0);
        char mode_ind=res1[9].equals("")? 0 : res1[9].charAt(0);
        int summa=res1[10].equals("")? 0 : Integer.parseInt(res1[10]);

        System.out.println("Название способа: " + name);
        System.out.println("Дорожка трассы: " + track_true);
        System.out.println("Индикаторы следа: " + t);
        System.out.println("Дорожка трассы, градусы магнитные: " + track_mag);
        System.out.println("Индикатор магнитной дорожки: " + m);
        System.out.println("Скорость над землей: " + speed_kn);
        System.out.println("Индикатор морской скорости: " + n);
        System.out.println("Скорость км/час: " + speed_km);
        System.out.println("Индикатор скорости: " + k);
        System.out.println("Индикатор режима системы позиционирования: " + mode_ind);
        System.out.println("Контрольная сумма " + summa);
    }
}
