import java.util.Collections;
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
        System.out.println( "Successfully reverted in Git");
    }
}