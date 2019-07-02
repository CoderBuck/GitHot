package me.buck.githot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import me.buck.githot.bean.Lang;
import me.buck.githot.util.RetrofitUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
