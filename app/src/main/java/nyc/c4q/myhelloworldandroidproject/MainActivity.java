package nyc.c4q.myhelloworldandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final private static String TAG ="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Running code in on create");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"running code in on start");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"running code in on resume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"running code in on pause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"running code in on stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"running code in on stop");
    }


}
