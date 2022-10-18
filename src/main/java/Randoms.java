import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer>{
    private final Random random;
    private final int minItem;
    private final int maxItem;
    private final List<Integer> list = new ArrayList<>();
    private int nextItem;

    public Randoms(int min, int max){
        this.minItem = min;
        this.maxItem = max;
        random = new Random();
        list.add(minItem + random.nextInt(maxItem-minItem+1));
        nextItem = 0;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return !list.isEmpty();
            }

            @Override
            public Integer next() {
                if (nextItem >= list.size()){
                    list.add(minItem + random.nextInt(maxItem-minItem+1));
                }
                int currentItem = list.get(nextItem);
                nextItem++;
                return currentItem;
            }
        };
    }
}
