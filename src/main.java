import java.util.ArrayList;
import java.util.Arrays;

class Main
{
    public static void main( String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>( Arrays.asList( 100, 500, 900));
        ArrayList<Integer> b = new ArrayList<Integer>( Arrays.asList( 800, 600, 300));
        ArrayList<Integer> c = new ArrayList<Integer>( Arrays.asList( 400, 700, 200));

        ArrayOrganizer org = new ArrayOrganizer();

        System.out.println( org.concatAndSort(a, b, c));
        System.out.println( "------------------------------------");



        Player tom = new Player( "Tom");
        Player john = new Player( "John");
        Player james = new Player( "James");
        Player henry = new Player( "Henry");

        Die die = new Die();

        for(int i = 0; i < 5; i++) {
            tom.addScore(die.rollDie());
            john.addScore(die.rollDie());
            james.addScore(die.rollDie());
            henry.addScore(die.rollDie());
        }

        System.out.println(tom.toString());
        System.out.println(john.toString());
        System.out.println(james.toString());
        System.out.println(henry.toString());
    }
}