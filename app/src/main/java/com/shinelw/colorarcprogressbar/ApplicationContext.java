package com.shinelw.colorarcprogressbar;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import com.zxy.tiny.Tiny;

/**
 * 
 * @author Administrator
 *
 */
public class ApplicationContext extends Application  implements Application.ActivityLifecycleCallbacks{
	//
	private static final String TAG = ApplicationContext.class.getSimpleName();

	/**
	 *
	 */
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Tiny.getInstance().init(this);
	}

	@Override
	public void onTerminate() {
		super.onTerminate();
		Log.i(TAG, "onTerminate");
	}

	@Override
	public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

	}

	@Override
	public void onActivityStarted(Activity activity) {

	}

	@Override
	public void onActivityResumed(Activity activity) {
	}

	@Override
	public void onActivityPaused(Activity activity) {
//		ToastUtils.getInstances().cancel();// activity死的时候，onActivityPaused(Activity activity)
		//ToastUtils.getInstances().cancel();
	}

	@Override
	public void onActivityStopped(Activity activity) {

	}

	@Override
	public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

	}

	@Override
	public void onActivityDestroyed(Activity activity) {

	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();
		Log.i("info", "demo onLowMemory..");
//		_BluetoothOpration.disconnect();
//		_BluetoothOpration.onDestroy();
	}


	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
	}
}
