package ques_2;

class Outer {
    public void display(){
        System.out.println("In Outer class...");
    }
    public class Inner{
        public void display(){
            System.out.println("In Inner class...");
        }
    }
}
public class Tester{
    public static void main(String[] args) {
        Outer ob = new Outer();
        Outer.Inner obj = ob.new Inner();
        ob.display();
        obj.display();
    }
}

