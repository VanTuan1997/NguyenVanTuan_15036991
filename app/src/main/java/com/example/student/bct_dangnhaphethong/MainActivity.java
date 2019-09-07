package com.example.student.bct_dangnhaphethong;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Dangnhap;
    EditText Taikhoan,Taikhoan1;
    CheckBox Luuthongtin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Taikhoan=findViewById(R.id.editText1);
        Taikhoan1=findViewById(R.id.editText2);
        Luuthongtin=findViewById(R.id.checkedTextView1);
        Dangnhap=findViewById(R.id.button1);
        Luuthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",Toast.LENGTH_SHORT).show();
            }
        });
        Dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu",Toast.LENGTH_SHORT).show();
            }
    });

    }
}
