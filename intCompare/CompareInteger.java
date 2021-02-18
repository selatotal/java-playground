public class CompareInteger {

    public static void main(String[] args) {
        
        // It does not compile
        // System.out.println(1 == null);

        Integer i = null;

        // It will cause NullPointerException
        // System.out.println(1 == i);

        // It works
        System.out.println(Integer.valueOf(1).equals(i));

    }

    
}