import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer>{
    private final Random random;
    private final int minItem;
    private final int maxItem;

    public Randoms(int min, int max){
        this.minItem = min;
        this.maxItem = max;
        random = new Random();

    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                    return minItem + random.nextInt(maxItem-minItem+1);
            }
        };
    }
}
