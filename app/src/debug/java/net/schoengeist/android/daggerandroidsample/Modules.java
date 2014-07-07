package net.schoengeist.android.daggerandroidsample;

import net.schoengeist.android.daggerandroidsample.ui.module.ApplicationModule;

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
