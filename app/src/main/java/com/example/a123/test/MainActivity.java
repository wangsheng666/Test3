package com.example.a123.test;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.RadioButton;
        import android.widget.TextView;
        import android.widget.Toast;

        ;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView)findViewById(R.id.textView2);
        Button bn = (Button) findViewById(R.id.button);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"3");
            }
        });

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonMale:
                if (checked)
                    textView.setText("您的性别为男");
                break;
            case R.id.radioButtonFemale:
                if (checked)
                    textView.setText("您的性别为女");
                break;
        }
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);

        switch(view.getId()) {
            case R.id.checkBox:
                if(checked){

                }else{

                }
                break;
            case R.id.checkBox2:
                if(checked){

                }else{

                }
                break;
            case R.id.checkBox3:
                if(checked){

                }else{

                }

        }
    }

}


