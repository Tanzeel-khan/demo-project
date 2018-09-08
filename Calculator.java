import java.util.Scanner;
class Demo{
    int add(int num1,int num2){
        int z;
        z=num1+num2;
        return z;
    }
    double add(double num1,double num2){
        double z;
        z=num1+num2;
        return z;
    }
    char add(char num1,char num2){
        int z;
        z=num1+num2;
        char u=(char)z;
        return u;
    }
    int subtract(int num1,int num2){
        int z;
        z=num1-num2;
        return z;
    }
    double subtract(double num1,double num2){
        double z;
        z=num1-num2;
        return z;
    }
    char subtract(char num1,char num2){
        int z;
        z=num1-num2;
        char u=(char)z;
        return u;
    }   
    }
public class Calculator{
    public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  Demo ob=new Demo();
  System.out.println("press 1 for addition in integer");
  System.out.println("press 2 for addition in double");
  System.out.println("press 3 for addition in character");
  System.out.println("press 4 for subtraction in integer");
  System.out.println("press 5 for subtraction in double");
  System.out.println("press 6 for subtraction in character");
  int selection=input.nextInt();
  switch(selection){
      case 1:
     System.out.println("enter two numbers");
     int a=input.nextInt();
     int b=input.nextInt();
     int c=ob.add(a,b);
      System.out.println(c);
    break;
      case 2:
           System.out.println("enter two numbers");
       double d=input.nextDouble();
       double e=input.nextDouble();
       double f=ob.add(d,e);
        System.out.println(f);
        break;
      case 3:
           System.out.println("enter two characters");
           char g=input.next().charAt(0);
           char h=input.next().charAt(0);
           char i=ob.add(g,h);
            System.out.println(i);
            break;
      case 4:
           System.out.println("enter two numbers");
           int j=input.nextInt();
           int k=input.nextInt();
           int l=ob.subtract(j,k);
            System.out.println(l);
            break;
      case 5:
           System.out.println("enter two numbers");
           double m=input.nextDouble();
           double n=input.nextDouble();
           double o=ob.subtract(m,n);
            System.out.println(o);
            break;
      case 6:
           System.out.println("enter two numbers");
           char p=input.next().charAt(0);
           char q=input.next().charAt(0);
           char r=ob.subtract(p,q);
            System.out.println(r);
            break;
  }
    }
}
