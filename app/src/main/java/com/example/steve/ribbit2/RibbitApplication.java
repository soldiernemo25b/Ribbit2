package com.example.steve.ribbit2;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Steve on 2/12/2015.
 */
public class RibbitApplication extends Application {
    // Enable Local Datastore.
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "tOtbU8RvQUBVvXU6SbcS7Rx3cm2CpBCNjfpBblqN", "CRkthyfg5ys2jThJ3yuBfM0SQvdjCAxVtDNmVfqN");

        /*
        //Testing Parse object
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
        */
    }
}
