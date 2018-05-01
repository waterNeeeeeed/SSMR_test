package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import static java.lang.Thread.sleep;

/**
 * Created by lenovo on 2018/5/1.
 */
public class ProductList extends Observable {
    private List<String> productList = null;
    private static ProductList instance;
    private ProductList(){}

    public static ProductList getInstance(){
        if (instance == null){
            instance = new ProductList();
            instance.productList = new ArrayList<String>();
        }
        return instance;
    }

    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    public void addProduct(String newProduct){
        productList.add(newProduct);
        System.out.println("产品列表增加了新产品：" + newProduct);
        /*try{
            sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }*/
        this.setChanged();
        this.notifyObservers(newProduct);
    }
}
