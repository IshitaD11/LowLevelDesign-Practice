package LowLevelDesign.Java_Fundamentals.LLD8_Semaphores.AdditionalProblem4;

public class Client {
    public static void main(String[] args) {
        H2O h2o = new H2O();
        int n = 5;

        Thread tH = new Thread(
            () -> {
                try{
                    for(int i=0;i<2*n;i++){
                        h2o.hydrogen(
                            () -> System.out.println("H")
                        );
                    }
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        );

        Thread tO = new Thread(
            () -> {
                try{
                    for(int i=0;i<n;i++){
                        h2o.oxygen(
                            () -> System.out.println("O")
                        );
                    }
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        );

        tH.start();
        tO.start();
    }
}
