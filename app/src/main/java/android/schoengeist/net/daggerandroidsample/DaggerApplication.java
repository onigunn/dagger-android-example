package android.schoengeist.net.daggerandroidsample;

import android.app.Application;
import android.content.Context;
import android.schoengeist.net.daggerandroidsample.Modules;

import dagger.ObjectGraph;

/**
 * Created by onur.guengoeren <guengoeren@schoengeist.net>
 * <p/>
 * schoengeist UG (haftungsbeschraenkt)
 */
public class DaggerApplication extends Application {

    private ObjectGraph objectGraph;

    private static DaggerApplication get(Context context) {
        return (DaggerApplication) context.getApplicationContext();
    }

    public ObjectGraph getObjectGraph() {
        return objectGraph;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(Modules.list(this));
    }

    public static void inject(Context context, Object object) {
        get(context).inject(object);
    }

    public void inject(Object object) {
        objectGraph.inject(object);
    }
}
