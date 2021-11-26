package ques_3;

public class Point {
    private int x,y;
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        x=0;y=0;
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point ob = new Point();
        ob.setXY(5,4);
        Point ob1 = new Point(8,9);
        System.out.println(ob.x+" "+ob.y);
        System.out.println(ob1.x+" "+ob1.y);
    }
}
