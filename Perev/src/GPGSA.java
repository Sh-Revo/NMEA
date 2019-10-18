public class GPGSA {
    private static String str7="$GPGSA,M,3,17,02,30,04,05,10,09,06,31,12,,,1.2,0.8,0.9*35";

    public GPGSA() {
        System.out.println(str7);
        str7=str7.replaceAll("\\,|\\$|\\*"," "); // удаление пробелов
        str7 = str7.trim(); //удаление 1 и последнего пробела

        String[] res1 = str7.split(" "); // выделение значения после пробела
        String name=res1[0];;
        char mode_ma=res1[1].equals("")? 0 : res1[1].charAt(0);
        int mode123=res1[2].equals("")? 0 : Integer.parseInt(res1[2]);
        int prn1=res1[3].equals("")? 0 : Integer.parseInt(res1[3]);
        int prn2=res1[4].equals("")? 0 : Integer.parseInt(res1[4]);
        int prn3=res1[5].equals("")? 0 : Integer.parseInt(res1[5]);
        int prn4=res1[6].equals("")? 0 : Integer.parseInt(res1[6]);
        int prn5=res1[7].equals("")? 0 : Integer.parseInt(res1[7]);
        int prn6=res1[8].equals("")? 0 : Integer.parseInt(res1[8]);
        int prn7=res1[9].equals("")? 0 : Integer.parseInt(res1[9]);
        int prn8=res1[10].equals("")? 0 : Integer.parseInt(res1[10]);
        int prn9=res1[11].equals("")? 0 : Integer.parseInt(res1[11]);
        int prn10=res1[12].equals("")? 0 : Integer.parseInt(res1[12]);
        int prn11=res1[13].equals("")? 0 : Integer.parseInt(res1[13]);
        int prn12=res1[14].equals("")? 0 : Integer.parseInt(res1[14]);
        double pdop=res1[15].equals("")? 0 : Double.parseDouble(res1[15]);
        double hdop=res1[16].equals("")? 0 : Double.parseDouble(res1[16]);
        double vdop=res1[17].equals("")? 0 : Double.parseDouble(res1[17]);

        int summa=res1[18].equals("")? 0 : Integer.parseInt(res1[18]);

        System.out.println("Название способа: " + name);
        System.out.println("Pежим МА: " + mode_ma);
        System.out.println("Pежим 123: " + mode123);
        System.out.println("Номер спутника PRN 1: " + prn1);
        System.out.println("Номер спутника PRN 2: " + prn2);
        System.out.println("Номер спутника PRN 3: " + prn3);
        System.out.println("Номер спутника PRN 4: " + prn4);
        System.out.println("Номер спутника PRN 5: " + prn5);
        System.out.println("Номер спутника PRN 6: " + prn6);
        System.out.println("Номер спутника PRN 7: " + prn7);
        System.out.println("Номер спутника PRN 8: " + prn8);
        System.out.println("Номер спутника PRN 9: " + prn9);
        System.out.println("Номер спутника PRN 10: " + prn10);
        System.out.println("Номер спутника PRN 11: " + prn11);
        System.out.println("Номер спутника PRN 12: " + prn12);
        System.out.println("Положение разбавления точности: " + pdop);
        System.out.println("Горизонтальное разбавление точности: " + hdop);
        System.out.println("Вертикальное разбавление точности: " + vdop);

        System.out.println("Контрольная сумма " + summa);
    }
}
