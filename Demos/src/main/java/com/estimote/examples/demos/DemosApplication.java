package com.estimote.examples.demos;

import android.app.Application;
import com.estimote.sdk.EstimoteSDK;

/**
 * Main {@link Application} object for Demos. It configures EstimoteSDK.
 *
 * @author wiktor@estimote.com (Wiktor Gworek)
 */
public class DemosApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    //i Initializes Estimote SDK wth your App ID and App Token from Estimote Cloud.
    // You can find your App ID and App Token in the
    // Apps section of the Estimote Cloud (http://cloud.estimote.com).
    EstimoteSDK.initialize(this, "estimotedemosapp-4ir", "9790370bd8181b4009dc6c9f4f477c30");

    // Configure verbose debug logging.
    EstimoteSDK.enableDebugLogging(true);
  }
}
