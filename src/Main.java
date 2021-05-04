public class Main {

    public static void main(String[] args) {
        System.out.println(findSmallestValue());
    }
    public final static int findSmallestValue(){
        int[] array = {3,5,7,2,9,10};
        int smallestValue = Integer.MAX_VALUE;
        for (int currentInt : array) {
            if (currentInt < smallestValue){
                smallestValue = currentInt;
            }
        }
        return smallestValue;
    }
}
