class StringValueOf {

    public static void main(String[] args) {
        String test = String.valueOf("null");
        if (test == null){
            System.out.println("STRING VALUE NULL");
        } else {
            System.out.println("String test " + test);
        }

        Boolean active = null;
        test = String.valueOf(active);
        if (test == null){
            System.out.println("STRING VALUE NULL");
        } else {
            System.out.println("String test " + test);
        }

        active = Boolean.TRUE;
        test = String.valueOf(active);
        if (test == null){
            System.out.println("STRING VALUE NULL");
        } else {
            System.out.println("String test " + test);
        }


    }
}