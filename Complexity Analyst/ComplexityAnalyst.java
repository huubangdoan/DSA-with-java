
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