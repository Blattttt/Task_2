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
	Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
	super.onRestoreInstanceState(savedInstanceState);
	setContentView(R.layout.main);
	if (savedInstanceState != null && savedInstanceState.containsKey("count"))
	{
		count = savedInstanceState.getInt("count");
	}
	Log.d(TAG, "onRestoreInstanceState");
	Toast.makeText(this, "onRestoreInstanceState", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onRestart(){
	super.onRestart();
	Log.d(TAG, "onRestart");
	Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onStart(){
	super.onStart();
	Log.d(TAG, "onStart");
	Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
	resetUI();
	}

	@Override
	public void onResume(){
	super.onResume();
	Log.d(TAG, "onResume");
	Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();

	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
	super.onSaveInstanceState(savedInstanceState);
	outState.putInt("count", count);
	Log.d(TAG, "onSaveInstanceState");
	Toast.makeText(this, "onSaveInstanceState", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onPause(){
	super.onPause();
	Log.d(TAG, "onPause");
	Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onStop(){
	super.onStop();
	Log.d(TAG, "onStop");
	Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onDestroy(){
	super.onDestroy();
	Log.d(TAG, "onDestroy");
	Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
	}
}
