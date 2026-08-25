class Complexity {
    //O(n)
    public void Linearloop(int n){
        for (int i=0; i<=n; i++){
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