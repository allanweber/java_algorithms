package testdome;

import java.util.ArrayList;
import java.util.List;

public class UniqueProduct {
    public static String firstUniqueProduct(String[] products) {

        List<String> unique = new ArrayList<>();
        for (String product : products) {
            if (unique.contains(product)) {
                unique.remove(product);
            } else {
                unique.add(product);
            }
        }

        return unique.size() > 0 ? unique.get(0): null;

    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[]{"Apple", "Computer", "Computer", "Apple", "Bag"}));
    }
}
