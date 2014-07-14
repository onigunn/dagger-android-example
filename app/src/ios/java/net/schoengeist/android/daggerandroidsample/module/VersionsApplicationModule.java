package net.schoengeist.android.daggerandroidsample.module;

import android.content.Context;
import android.widget.ArrayAdapter;

import net.schoengeist.android.daggerandroidsample.ui.module.ApplicationModule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by onur.guengoeren <guengoeren@schoengeist.net>
 * <p/>
 * schoengeist UG (haftungsbeschraenkt)
 */
@Module(
        overrides = true,
        includes = ApplicationModule.class
)
public class VersionsApplicationModule {
    @Provides
    public ArrayAdapter<String> providesArrayAdapter(Context context) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1);
        adapter.addAll("iPhone OS", "iOS 3", "iOS 4", "iOS 5", "iOS 6", "iOS 7", "iOS 8");
        return adapter;
    }
}
