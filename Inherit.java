import java.util.Scanner;
class card{
 String greetings(String a){   
 String z=a;
 return z;
 }
}
class valentine extends card{
    String greetings(String b){
       String z=b;
       return z;
            }
}
class holiday extends card{
    String greetings(String c){
        String y=c;
        return y;
    }
}
class birthday extends card{
    String greetings(String d){
        String t=d;
        return t;
    }
}
public class Inherit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int selection;
       valentine ob1=new valentine();
        holiday ob2=new holiday();
        birthday ob3=new birthday();
        System.out.println("sir/mam which card you want to open i have three cards here");
        System.out.print("which card you want to open?\n 1: valentine card \n 2: holiday card \n 3: birthday card \n");
        System.out.println("press 1 for valentine card");
        System.out.println("press 2 for holiday card");
        System.out.println("press 3 for birthday card");
        selection=input.nextInt();
        switch(selection){
            case 1:
        String f=ob1.greetings("happy valentines day dear");
        System.out.println(f);
        break;
            case 2:
        String g=ob2.greetings("season's greetings dear");
        System.out.println(g);
        break;
            case 3 :
        String h=ob3.greetings("happy birthday dear");
        System.out.println(h);
        break;
    }
    }
}
