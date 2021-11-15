import java.util.Scanner;
public class hg {

    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);

        System.out.println("Введите первое число:");
        while (!num.hasNextInt()) {
            System.out.println("Ошибка");
            num.next();
        }
        int a = num.nextInt();
        System.out.println("Введите второе число:");
        while (!num.hasNextInt()) {
            System.out.println("Ошибка");
            num.next();
        }
        int b = num.nextInt();
        System.out.println("Введите третье число:");while (!num.hasNextInt()) {
            System.out.println("Ошибка");
            num.next();
        }
        int c = num.nextInt();
        System.out.println("Введите четвертое число:");while (!num.hasNextInt()) {
            System.out.println("Ошибка");
            num.next();
        }
        int d = num.nextInt();
        int smallest;
        if (a <= b && a <= c && a <= d) {
            smallest = a;
        } else if ( b <= a && b <= c && b <= d) {
            smallest = b;
        } else if (c <= a && c <= b && c <= d) {
            smallest = c;
        } else {
            smallest = d;

        }
        System.out.println("Наименьшее число =" + smallest);


    }
}
