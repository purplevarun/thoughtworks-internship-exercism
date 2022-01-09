import java.util.*;
class PythagoreanTriplet{
    private int a, b, c;
    private int n;
    PythagoreanTriplet (int a, int b, int c){
        int [] arr = {a, b, c};
        Arrays.sort (arr);
        this.a = arr[0];
        this.b = arr[1];
        this.c = arr[2];
    }
    void makeTripletsList(){
        return;
    }
    void withFactorsLessThanOrEqualTo(int n){
        return;
    }
    void thatSumTo(int n){
        this.n = n;
    }
    
    public static void main (String args []){
        // System.out.println(new PythagoreanTriplet(4,2,1).a);
        List<PythagoreanTriplet> expected
                = Collections.singletonList(new PythagoreanTriplet(200, 375, 425));

        System.out.println(expected);
    }
}