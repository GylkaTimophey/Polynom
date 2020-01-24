package My_Polynom;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double ar[] = new double[]{7, 3, -6, 1, -8};
        Polynom p = new Polynom(ar);
        System.out.print("Создание вашего полинома: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько разрядов вы хотите использовать?");
        int b = in.nextInt();
        int b2 = b-1;
        double ar1[] = new double[b];
        for (int i = b2; i >=0; i--) {
            System.out.println("Введите коэфициент перед х^" + i);
            b = in.nextInt();
            ar1[b2-i] = b;
        }
        System.out.print("Исходный полином: ");
        p.show();
        Polynom p1 = new Polynom(ar1);
        System.out.print("Вводимый полином: ");
        p1.show();
        if (p.equals(p1)) System.out.println("p=p1");
        else System.out.println("p!=p1");
        Polynom res = p.sum(p1);
        System.out.print("p+p1 = ");
        res.show();
        Polynom res2 = p.dif(p1);
        System.out.print("p-p1= ");
        System.out.print("p-p1= ");
        res2.show();
        System.out.println("Введите х для подстановки");
        int x = in.nextInt();
        System.out.println("If x=" + x + ", p= " + p.whatx(x) +
                " and p1= " + p1.whatx(x));
        Polynom res3 = p.multipl(p1);
        System.out.print("p*p1= ");
        res3.show();
        Polynom res4 = p.div(p1);
        System.out.print("p/p1=");
        res4.show();
        Polynom res5 = p.divost(p1);
        System.out.print("Остаток от деления p/p1= ");
        res5.show();
        System.out.println("Искомый коэффициент: " + p.getCoefficient(3));
    }
}