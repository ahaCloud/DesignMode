package yu.personal.com.agentmodel;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by YuHengYi on 2016/3/8.
 */
public class PersonA implements Person {
    @Override
    public void run(Context mContext) {
        Toast.makeText(mContext,"run-----",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void laugh(Context mContext) {
        Toast.makeText(mContext,"laugh-----",Toast.LENGTH_SHORT).show();
    }
}
