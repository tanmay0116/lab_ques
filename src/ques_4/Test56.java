package ques_4;
class Box {
    private int length;
    private int breadth;

    public Box ( )
    {
        length =0;
        breadth =0;
    }
    public Box (int x, int y)
    {
        length = x;
        breadth =y;
    }
    public void setval (int x, int y) {
        length = x;
        breadth = y;
    }
    public int area ( )
    {
        return (length * breadth);
    }
}
class Box3d extends Box
{
    private int height;
    public Box3d ( )
    {
        super( );
        height  = 0;
    }
    public Box3d(int x, int y, int z)
    {
        super (x, y);
        height = z;
    }
    public void setval (int x, int y, int z)
    {
        setval(x, y);
        height = z;
    }
    public int volume ( )
    {
        return (area ( ) * height );
    }
}
public class Test56 {
    public static void main(String arga [ ])
    {
        Box obj1=new Box();
        obj1.setval (10,20);
        Box3d obj2 = new Box3d(30,40,50);
        System.out.println(obj1.area());
        System.out.println(obj2.volume());
    }
}