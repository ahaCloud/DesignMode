package yu.personal.com.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yu.personal.com.agentmodel.DynamicProxy;
import yu.personal.com.agentmodel.Person;
import yu.personal.com.agentmodel.PersonA;
import yu.personal.com.agentmodel.StaticProxy;
import yu.personal.com.factory.Product;
import yu.personal.com.factory.ProductB;
import yu.personal.com.factory.ProductFactory;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    private Button btn_factory,btn_staticproxy,btn_dynamicproxy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_factory:
                Product p = ProductFactory.createProduct(ProductB.class);
                p.create(this);
                break;
            case R.id.btn_staticproxy:
                Person p1= new PersonA();
                StaticProxy proxy = new StaticProxy(p1);
                proxy.run(MainActivity.this);
                break;

            case R.id.btn_dynamicproxy:
                Person p2 = new PersonA();
                DynamicProxy dynamicProxy = new DynamicProxy(p2);
                ClassLoader loader = p2.getClass().getClassLoader();
                Person p3=  (Person) Proxy.newProxyInstance(loader, new Class[]{Person.class}, dynamicProxy);
                p3.laugh(MainActivity.this);
                break;
        }
    }

    private void initView(){
        btn_factory = (Button)findViewById(R.id.btn_factory);
        btn_factory.setOnClickListener(this);
        btn_staticproxy = (Button)findViewById(R.id.btn_staticproxy);
        btn_staticproxy.setOnClickListener(this);

        btn_dynamicproxy = (Button)findViewById(R.id.btn_dynamicproxy);
        btn_dynamicproxy.setOnClickListener(this);
    }
}
