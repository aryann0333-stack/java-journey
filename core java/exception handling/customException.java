class customException extends Exception {
    @SuppressWarnings("unused")
    private String customMsg;

    public customException(String message) {
        /*
         * super is used as it standard way as exception handles the string message
         * otherwise we have to define ourselves getter and setter to retriev it
         */
        super(message);

        // this.customMsg = message;
    }
    /*
     * in case you want to handel by yourself constructor message
     * 
     * @Override
     * public String getMessage() {
     * return this.customMsg;
     * }
     */

    public static void main(String[] args) {
        int i = 20; // normal statement
        int j;
        try {
            j = 18 / i; // critical statement due to zero
            if (j == 0) {
                throw new customException("failed");
            }
            System.out.println(j);
        } catch (customException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Exception handeld !!");

    }
}