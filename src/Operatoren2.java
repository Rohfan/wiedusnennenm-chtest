public class Operatoren2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int n = 20;

        a += b;
        System.out.println(a);

        boolean c = a > b;   // true, weil a neu definiert ( a = a + b)
        System.out.println(c);

        boolean d = a == b;  //false
        System.out.println(d);

        boolean e = d && c; // false, weil d = false => nur d geprüft nicht c (doppeltes &&)
        System.out.println(e);

        boolean f = ! d; //Negation von d => true
        System.out.println(f);

        boolean g = f || c; //True => nur f geprüft und schon true
        System.out.println(g);

        String y = (b > n) ? "b ist größer als n" : "n ist größer als b";
        System.out.println(y);

        String z = (b != n) ? "b ist ungleich n" : "n ist gleich b";
        System.out.println(z);

        int s = b++; //s = 10 , b = 11 (b wird nachträglich um 1 erhöht, davor übernimmt s 10 von b)
        int t = ++n; //t = 21 , n = 21
        System.out.println("b: " + b + ", s: " + s + ", t: " + t + ", n: " + n);









    }



}
