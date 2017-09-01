public class Operatoren {
    public static void main(String[] args) {

        int a = 3;    // 00000011
        int b = 9;    // 00001001

        int c = a | b;       //Oder => 11 (00001011)
        int d = a & b;       //Und => 1 (00000001)
        int e = a ^ b;       //ExkOder => 10 (00001001) ?
        int f = ~ b;         //Negation => 246 (11110110)
        int g = a << 1;      //LinksVerschieben1 => 6 (00000110)
        int h = a << 2;      //LinksVerschieben2 => 12 (00001100)
        float i = b >> 1;    //RechtsVershcieben1 => 4 (00000100)
        float j = b >> 2;    //RechtsVerschieben2=> 2 (00000010)
        float k = b >>> 2;   //""
        int l = - a;         //Negation

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);


    }
}
