package com.aedproject;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.inprogress.reactnativeyoutube.ReactNativeYouTube;
import com.zxcpoiu.incallmanager.InCallManagerPackage;
import org.reactnative.camera.RNCameraPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.reactnative.ivpusic.imagepicker.PickerPackage;
// import org.reactnative.camera.RNCameraPackage;
import io.invertase.firebase.RNFirebasePackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.oney.WebRTCModule.WebRTCModulePackage;

import java.util.Arrays;
import java.util.List;

import com.airbnb.android.react.maps.MapsPackage;

import io.invertase.firebase.database.RNFirebaseDatabasePackage;
import io.invertase.firebase.storage.RNFirebaseStoragePackage;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new ReactNativeYouTube(),
            new InCallManagerPackage(),
          new RNCameraPackage(),
          new VectorIconsPackage(),
          new RNFetchBlobPackage(),
          new PickerPackage(),
          // new RNCameraPackage(),
          new RNFirebasePackage(),
          new MapsPackage(),
          new RNFirebaseDatabasePackage(),
          new RNFirebaseStoragePackage(),
          new WebRTCModulePackage() 
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }

}
