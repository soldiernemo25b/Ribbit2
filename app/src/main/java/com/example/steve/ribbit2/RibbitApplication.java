package com.example.steve.ribbit2;

import android.app.Application;

import com.example.steve.ribbit2.ui.MainActivity;
import com.example.steve.ribbit2.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

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

        PushService.setDefaultPushCallback(this, MainActivity.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();

        /*
        //Testing Parse object
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
        */
    }
    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
}
