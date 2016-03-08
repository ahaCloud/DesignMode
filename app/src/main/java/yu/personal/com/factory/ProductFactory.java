package yu.personal.com.factory;

/**
 * Created by YuHengYi on 2016/3/8.
 */
public class ProductFactory {
    public static  <T extends Product >T createProduct(Class<T> cls){
        Product product= null;
        try {
             product = (Product)Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
