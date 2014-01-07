//package com.Nightmare.MinecraftWidgets;
//
//import android.appwidget.AppWidgetManager;
//import android.content.BroadcastReceiver;
//import android.content.ComponentName;
//import android.content.Context;
//import android.content.Intent;
//import android.widget.RemoteViews;
//import android.widget.Toast;
//
//public class BedReceiver extends BroadcastReceiver {
//
//	@Override
//	public void onReceive(Context context, Intent intent) {
//		toastify("blah", context);
//		RemoteViews views = new RemoteViews(context.getPackageName(),
//				R.layout.bed_layout);
//		AppWidgetManager appWidgetManager = AppWidgetManager
//				.getInstance(context);
//		appWidgetManager.updateAppWidget(new ComponentName(context,
//				BedWidgetProvider.class), views);
//	}
//
//	public void toastify(String toDisplay, Context context) {
//		Toast.makeText(context, toDisplay, Toast.LENGTH_LONG).show();
//	}
//
//}
