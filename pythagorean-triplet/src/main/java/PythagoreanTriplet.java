import java.util.*;
class PythagoreanTriplet{
    private int a, b, c;
    private int n;
    PythagoreanTriplet (int a, int b, int c){
        int [] arr = {a, b, c};
        Arrays.sort (arr); // big brain time
        this.a = arr[0];
        this.b = arr[1];
        this.c = arr[2];
    }
    public List<PythagoreanTriplet> build (){  // so, basically this returns an instance of itself
        return Collections.singletonList(this);
    }

    @Override
    public final String toString (){
        return String.valueOf(a)+" "+String.valueOf(b)+" "+String.valueOf(c);
    }
    public static void main (String args []) {
        List<PythagoreanTriplet> expected
                = Collections.singletonList(new PythagoreanTriplet(3, 4, 5));
        System.out.println("expected = " + expected);
        System.out.println("actual = " + new PythagoreanTriplet(1,2,3).build());
    }
}