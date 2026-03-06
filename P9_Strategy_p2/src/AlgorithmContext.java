package P9_Strategy_p2.src;

import java.util.List;

public class AlgorithmContext {

    private AlgorithmStrategy algorithmStrategy;

    public AlgorithmContext(AlgorithmStrategy algorithmStrategy){
        this.algorithmStrategy = algorithmStrategy;
    }

    public void setStrategy(AlgorithmStrategy algorithmStrategy){
        this.algorithmStrategy = algorithmStrategy;
    }

    public long processSorting(List<Integer> numbers){

        long startTime = System.nanoTime();
        algorithmStrategy.processSorting(numbers);
        long endTime = System.nanoTime();
        return endTime - startTime;

    }
    
}
