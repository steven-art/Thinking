package com.tanguysteven.thinking;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button ButtonIdea = (Button) findViewById(R.id.activity_main_idea_btn);
       ButtonIdea.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
// Click event trigger here
        }
    });
}