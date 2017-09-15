package com.example.siwei.s2;



        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        final EditText e1 = (EditText)findViewById(R.id.E1) ;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent I = new Intent(Activity.this,Activity2.class);
                //I.putExtra("name","vvii");
                //I.putExtra("age",20);
                //startActivityForResult(I,0);

                Intent x = new Intent(MainActivity.this,Main2Activity.class);
                x.putExtra("xinxi",e1.getText().toString());
                startActivityForResult(x,0);
            }
        });

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0 && resultCode==0){
            //String str=data.getStringExtra("结果");
            String str2=data.getStringExtra("xinxi2");
            Toast.makeText(this,str2,Toast.LENGTH_LONG).show();
        }
    }
}