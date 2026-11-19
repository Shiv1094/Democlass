package comparator.product;
import java.util.*;
public class SortById implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.id>o2.id){
            return 1;
        } else if (o1.id==o2.id) {
            return 0;

        }else {
            return -1;
        }
    }
}
