class Arithematic implements test{
    public int square(int n){
        return n*n;
    }
}
public class ToTestInt{
    public static void main(String[] args) {
        Arithematic ob = new Arithematic();
        System.out.println(ob.square(5));
    }
}
