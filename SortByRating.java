package comparator.product;
import java.util.*;

public class SortByRating implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.rating>o2.rating){
            return 1;
        } else if (o1.rating==o2.rating) {
            return 0;

        }else {
            return -1;
        }
    }
}
