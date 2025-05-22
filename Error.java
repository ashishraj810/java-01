public class Error {
    public static void main(String[] args) {
        int arr[]={2,4,5,3};
        try{
            
            System.out.println(arr[6]);
        }
        catch(Exception e){
            System.out.println("We cannot access out of bound index.");
        }
        finally{
            System.out.println("Programme executed successfully.");
        }
    }
    
}
