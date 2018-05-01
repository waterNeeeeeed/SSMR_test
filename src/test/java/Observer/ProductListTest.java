package Observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lenovo on 2018/5/1.
 */
class ProductListTest {
    @Test
    void addProduct() {
        ProductList observable = ProductList.getInstance();
        JDObserver jdObserver = new JDObserver();
        TBObserver tbObserver = new TBObserver();

        observable.addObserver(jdObserver);
        observable.addObserver(tbObserver);

        observable.addProduct("【云同款内裤】");
    }

}