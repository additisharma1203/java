public class Bitwise {
    public static void main(String[] arg){
        Byte a=5;
        Byte b=6;
        System.out.println("(a and b) a&b: "+(a&b));
        System.out.println("(a or b) a|b: "+(a|b));
        System.out.println("(a xor b) a^b: "+(a^b));
        System.out.println("Not of a : "+(~a));
        System.out.println(("Left shift  a<<2: ")+(a<<2));
        System.out.println(("Right shift  a>>2: ")+(a>>2));
        System.out.println(("Left shift of b by 1 bit(b<<1) "+(b<<1)));
        System.out.println(("Right shift of b by 1 bit(b>>1) "+(b>>1)));
    }
}
