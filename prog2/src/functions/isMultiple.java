package functions;

public class isMultiple {

    public static boolean isMultiple(int num, int div) {
        return num%div==0;
    }
    public static boolean isDivisor(int div,int num){
        return isMultiple(num,div);
    }
    public static boolean isEven(int num) { return isDivisor(2, num); }

}
