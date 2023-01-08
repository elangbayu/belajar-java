package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
         sampleError();
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    public static void sampleError(){
        try {
            String[] name = {
                    "Elang", "Bayu", "Segara"
            };
            System.out.println(name[100]);
        } catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
