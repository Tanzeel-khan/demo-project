class Point{
    int x=2,y=3;
    int manipulate(){
        return y= x*2;
    }
    int mani(){
        return x=y*3;
    }
     void prop(){
         System.out.println("x is"+x+"& y is"+y);
         System.out.println("x^2 is"+x*x);
         System.out.println("y^3 is"+y*y*y);
     }    
    Point(int i,int j){
        x=i;
        y=j;
    }
    boolean equ(Point o){
        if(o.x==x&&o.y==y){
            return true;
        }
        else{
            return false;
        }
    }
    }
public class properties {
    public static void main(String[]args) {
    Point ob4=new Point(4,5);
    int a=ob4.manipulate();
    System.out.println("now y is"+a);
    int b= ob4.mani();
    System.out.println("now x is "+b);
    ob4.prop();
     Point ob1=new Point(100,22);
    Point ob2=new Point(100,22);
    Point ob3=new Point(2,3);
    System.out.println("now ob1==ob2"+ob1.equ(ob2));
    System.out.println("ob1==ob3"+ob1.equ(ob3));
    }
}

