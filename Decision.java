public class Decision {
    public static void main(String args[]) {
       int x = 45;

       if(x > 95){
           System.out.println("Student is brilliant");
       }else if(x < 30){
           System.out.println("Student is poor");
       }else if(x < 95 && x > 30){
           System.out.println("Student is average");
       }
    }
}
