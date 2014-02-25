package com.arcticdev.ribbit.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        Parse.initialize(this, "AYpvudiCdcDbYa9QYyliwzrq9f3pA34E7jNd5EoS", "WDNDkB9ax6TUG63ezzVw3kd9bbPfGzDzbvX75ZWg");
    }

}
