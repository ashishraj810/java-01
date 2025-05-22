class Exception_Handling{
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("We cannot divide by zero.");
        }

        System.out.println("Exception handling is useful.");
    }
}