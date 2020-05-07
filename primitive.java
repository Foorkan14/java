public class primitive {
    public static void main(String[] args){
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("integer min value = " + myMinIntValue);
        System.out.println("integer max value = " + myMaxIntValue);
        System.out.println("busted max value = " + (myMaxIntValue +1) );
        System.out.println("busted min value = " + (myMinIntValue -1) );
    }

 }