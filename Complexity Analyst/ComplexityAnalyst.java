class Complexity {
    //O(n)
    public void Linearloop(int n){
        for (int i=0; i<=n; i++){
            int a=0;
        }
    }
    //O(2n)=O(n)
    public void twoLoop(int n){
        Linearloop(n);
        Linearloop(n);
    }
    //O(n**2)
    public void loopInLoop(int n){
         for (int i=0; i<=n; i++){
            Linearloop(n);
        }
    } 
    //O(log(n))
    public void logLoop(int n){
        int i=1;
        while (i<=n){
            i*=2;
        }
    }
    //O(nlog(n))
    public void nlogLoop(int n){
        for (int i=0; i<=n; i++){
            logLoop(n);
        }
    }
}
public class ComplexityAnalyst {
    public static void measure(String name, Runnable action) {
        long start = System.nanoTime();
        action.run();
        long end = System.nanoTime();
        System.out.println("\n" + name + ": " + (end - start) / 1_000_000.0 + " ms");
    }

    public static void main(String[] args) {
        Complexity complexity = new Complexity();

        measure("Linearloop", () -> complexity.Linearloop(10000));
        measure("twoLoop",    () -> complexity.twoLoop(10000));
        measure("loopInLoop", () -> complexity.loopInLoop(10000));
        measure("logLoop",    () -> complexity.logLoop(10000));
        measure("nlogLoop",   () -> complexity.nlogLoop(10000));
    }
}