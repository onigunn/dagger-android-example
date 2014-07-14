package net.schoengeist.android.daggerandroidsample.ui.module;

import android.content.Context;
import android.widget.ArrayAdapter;

import net.schoengeist.android.daggerandroidsample.DaggerApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by onur.guengoeren <guengoeren@schoengeist.net>
 * <p/>
 * schoengeist UG (haftungsbeschraenkt)
 */
@Module( includes = UIModule.class )
public class ApplicationModule {

    private DaggerApplication application;

    public ApplicationModule(DaggerApplication application) {
        this.application = application;
    }

    @Provides
    public Context providesContext() {
        return application;
    }

    @Provides
    public ArrayAdapter<String> providesArrayAdapter(Context context) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1);
        adapter.addAll("Android 4.4 (API 19)", "Android 4.3 (API 18)", "Android 4.2, 4.2.2 (API 17)");
        return adapter;
    }

}
