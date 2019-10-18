public class pots {
    public static void main(String[] args) {

        int a=31;
        int b=a%7;
        if (b==0) {
            System.out.println("Monday:");
        } else if (b==1) {
            System.out.println("Tuesday:");
        } else if (b==2) {
            System.out.println("Wednesday:");
        } else if (b==3) {
            System.out.println("Thursday:");
        } else if (b==4) {
            System.out.println("Friday:");
        } else if (b==5) {
            System.out.println("Saturday:");
        } else {
            System.out.println("Sunday:");
        }
    }
}
