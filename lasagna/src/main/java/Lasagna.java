public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    int remainingMinutesInOven(int n){
        return this.expectedMinutesInOven() - n;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    int preparationTimeInMinutes(int n){
        return n*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    int totalTimeInMinutes(int n, int m){
        return this.preparationTimeInMinutes(n) + this.remainingMinutesInOven(m);
    }
}
