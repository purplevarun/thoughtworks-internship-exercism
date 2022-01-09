import java.util.*;
class PythagoreanTriplet{
    boolean check (int x){
        double sqrt = StrictMath.sqrt(x);
        return sqrt == StrictMath.floor(sqrt);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        PythagoreanTriplet obj = new PythagoreanTriplet();
        for (int i=1;i<n;++i){
            for (int j=1;j<i;++j){
                int k = i*i+j*j;
                if (obj.check(k) && (i+j+StrictMath.sqrt(k)==n)){
                    System.out.println(i+" "+j+" "+(int)Math.sqrt(k));
                }
            }
        }
    }
}