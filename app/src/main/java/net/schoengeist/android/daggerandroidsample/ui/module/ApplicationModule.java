package net.schoengeist.android.daggerandroidsample.ui.module;

import android.content.Context;
import net.schoengeist.android.daggerandroidsample.DaggerApplication;

import android.widget.ArrayAdapter;

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
        adapter.addAll("STS-1 Launch @ Kennedy Space Center – April 12, 1981",
                " Apollo 11 Launch @ Kennedy Space Center – July 16, 1969",
                "STS-66 Launch @ Kennedy Space Center – November 3, 1994");
        return adapter;
    }

}
