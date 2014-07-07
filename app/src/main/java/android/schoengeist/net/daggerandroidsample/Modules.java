package android.schoengeist.net.daggerandroidsample;

import android.app.Application;
import android.content.Context;
import android.schoengeist.net.daggerandroidsample.ui.module.ApplicationModule;

/**
 * Created by onur.guengoeren <guengoeren@schoengeist.net>
 * <p/>
 * schoengeist UG (haftungsbeschraenkt)
 */
public final class Modules {
    public static Object[] list(DaggerApplication application) {
        return new Object[] {
                new ApplicationModule(application)
        };
    }

}
