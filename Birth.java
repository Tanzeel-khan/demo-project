import java.util.Scanner;
class Card{
    String greet;
    void greetings(){
        System.out.println(greet);
    }
}
class valentine extends Card{
    valentine(String t){
        greet=t;
    }
}
class holiday extends Card{
    holiday(String a){
        greet=a;
    }
} 
class birthday extends Card{
    birthday(String b){
        greet=b;
    }
}
public class Birth {    
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
     System.out.println("sir/mam i have three cards here");
     System.out.print("1: valentine card\n 2: holiday card\n 3: birthday card\n");
     System.out.println("press 1 for valentine card");
     System.out.println("press 2 for holiday card");
     System.out.println("press 3 for birthday card");
     int selection=Input.nextInt();
     switch(selection){
         case 1:
            valentine v=new valentine("happy valentines day dear");
            v.greetings();
            break;
         case 2:
             holiday h=new holiday("season's greetings dear");
             h.greetings();
             break;
         case 3:
             birthday b=new birthday("happy birthday dear");
             b.greetings();
             break;
     }
   }
}