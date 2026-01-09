package com.example.koszykowka;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.koszykowka.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //private TextView text;
    //private Button button1, button2, button3;
    //private int punkty;
    private PunktyViewModel punktyViewModel;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        punktyViewModel = new ViewModelProvider(this).get(PunktyViewModel.class);
        //setContentView(R.layout.activity_main);

        //text = findViewById(R.id.textView);
        //button1 = findViewById(R.id.button1);
        //button2 = findViewById(R.id.button2);
        //button3 = findViewById(R.id.button3);
        //if(savedInstanceState != null){
        //    punkty = savedInstanceState.getInt("PUNKTY",0);
        //}
       binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));

        binding.button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(1);
                        binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(2);
                        binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(3);
                        binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
    }

    //@Override
    //protected void onSaveInstanceState(@NonNull Bundle outState) {
    //    super.onSaveInstanceState(outState);
    //    outState.putInt("PUNKTY",punktyViewModel.getPunkty());
    //}
}