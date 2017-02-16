/**
 *
 */
package org.crazyit.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

 
public class FirstService extends Service
{
	// 蹇呴』瀹炵幇鐨勬柟娉�
	@Override
	public IBinder onBind(Intent arg0)
	{
		return null;
	}
	// Service琚垱寤烘椂鍥炶皟璇ユ柟娉曘��
	@Override
	public void onCreate()
	{
		super.onCreate();
		Log.e("service","Service is Created");
	}
	// Service琚惎鍔ㄦ椂鍥炶皟璇ユ柟娉�
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		 Log.e("service","Service is Started");
		return START_STICKY;
	}
	// Service琚叧闂箣鍓嶅洖璋冦��
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		 Log.e("service","Service is  Destroyed   ");
	}
}
