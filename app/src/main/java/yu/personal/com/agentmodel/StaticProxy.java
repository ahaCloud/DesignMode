package yu.personal.com.agentmodel;

import android.content.Context;

/**
 * Created by YuHengYi on 2016/3/8.
 */
public class StaticProxy implements Person {

    private Person p;
    public StaticProxy(Person p){
        this.p = p;
    }
    @Override
    public void run(Context mContext) {
        p.run(mContext);
    }

    @Override
    public void laugh(Context mContext) {
        p.laugh(mContext);
    }
}
