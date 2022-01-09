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
    
}