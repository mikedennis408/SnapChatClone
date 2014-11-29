package com.AbyssSoftware.michael.ribbit;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Michael on 11/22/2014.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "jdc9HgVLPVJqAK9ESORoJGjMCpRkB7c8vUBWHu3i", "vGxhMmyVNIUOFwjxst4pCoxyPBGOiws2tQM8ngx7");

//        ParseObject testObject = new ParseObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground();
    }
}
