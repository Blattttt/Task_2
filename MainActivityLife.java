package ita.example.activitylife;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
	Log.d(TAG, "onCreate");
	setContentView(R.layout.activity_main);
	Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
	super.onRestoreInstanceState(savedInstanceState);
	if (savedInstanceState != null && savedInstanceState.containsKey("count"))
	{
		count = savedInstanceState.getInt("count");
	}
	Log.d(TAG, "onRestoreInstanceState");
	}

	@Override
	public void onRestart(){
	super.onRestart();
	Log.d(TAG, "onRestart");
	}

	@Override
	public void onStart(){
	super.onStart();
	Log.d(TAG, "onStart");
	resetUI();
	}

	@Override
	public void onResume(){
	super.onResume();
	Log.d(TAG, "onResume");

	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
	super.onSaveInstanceState(savedInstanceState);
	outState.putInt("count", count);
	Log.d(TAG, "onSaveInstanceState");
	}

	@Override
	public void onPause(){
	super.onPause();
	Log.d(TAG, "onPause");
	}

	@Override
	public void onStop(){
	super.onStop();
	Log.d(TAG, "onStop");
	}

	@Override
	public void onDestroy(){
	super.onDestroy();
	Log.d(TAG, "onDestroy");
	}
}
