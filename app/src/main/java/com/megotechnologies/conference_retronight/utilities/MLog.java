package com.megotechnologies.conference_retronight.utilities;

import android.util.Log;

import com.megotechnologies.conference_retronight.MainActivity;

public class MLog {
	
	public static void log(String str) {
		
		if(MainActivity.LOG) {
			
			Log.i("mego", str);
			
		}
		
	}
	

}
