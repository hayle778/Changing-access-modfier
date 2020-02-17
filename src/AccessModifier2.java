
public class AccessModifier2 {

public static void main (String[]args){

    AccessModifier1 a = new AccessModifier1();

    System.out.println( a.hours );
    System.out.println( a.minutes );

    AccessModifier3 b = new AccessModifier3();
    System.out.println( a.getHours() );
    System.out.println( a.minutes );




}

}
