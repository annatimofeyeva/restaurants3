package com.epicodus.myrestaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = RestaurantsActivity.class.getSimpleName();
    @Bind(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @Bind(R.id.locationEditText) EditText mLocationEditText;
    @Bind(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "The OnCreate Method Fired");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrichregular.ttf");
        mAppNameTextView.setTypeface(ostrichFont);

        mFindRestaurantsButton.setOnClickListener(this);
    }

//    @Override
//    protected void onStart(){
//        super.onStart();
//        Log.v(TAG, "The OnStart Method Fired");
//    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "The OnStart Method Fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "The OnStop Method Fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "The OnDestroy Method Fired");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.v(TAG, "The OnPostResume Method Fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "The OnPause Method Fired");
    }

    @Override
    public void onClick(View v) {
        if(v == mFindRestaurantsButton) {
            String location = mLocationEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}

