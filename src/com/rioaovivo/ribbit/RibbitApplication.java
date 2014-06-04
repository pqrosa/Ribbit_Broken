package com.rioaovivo.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "VXDt1ODxOW5cJraoRtL0mZ87vzZHhd6PDBfAufsh", "1CkGxHI7Wkmc90nSEghdUwzjKAElXQ8u07el5uNT");
	}
	
}
