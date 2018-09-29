package joserafael.peralta.com.peraltajoserafaellab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITF", "OnCreate has executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITF","OnStart has executed");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITF","OnResume has executed");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITF","OnRestart has executed");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITF","OnStop has executed");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITF","OnDestroy has executed");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITF","OnPause has executed");

    }

    public void next(View view){
        Snackbar.make(view, "Next button has been clicked", Snackbar.LENGTH_SHORT).show();
        Log.d("4ITF","Next button has been clicked.");
    }

    public void back(View view){
        Toast.makeText(this,"Back button has been clicked",Toast.LENGTH_SHORT).show();

    }
}
