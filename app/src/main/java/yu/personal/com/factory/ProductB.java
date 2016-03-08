package yu.personal.com.factory;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by YuHengYi on 2016/3/8.
 */
public class ProductB extends Product {
    @Override
    public void create(Context mContext) {
        Toast.makeText(mContext, "ProductBBBBB", Toast.LENGTH_SHORT).show();
    }
}
