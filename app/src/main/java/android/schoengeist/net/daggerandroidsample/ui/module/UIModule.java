package android.schoengeist.net.daggerandroidsample.ui.module;

import android.schoengeist.net.daggerandroidsample.ui.fragment.DaggerFragment;

import dagger.Module;

/**
 * Created by onur.guengoeren <guengoeren@schoengeist.net>
 * <p/>
 * schoengeist UG (haftungsbeschraenkt)
 */
@Module(
        injects = DaggerFragment.class,
        complete = false
)
public class UIModule {
}
