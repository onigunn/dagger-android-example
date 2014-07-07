package net.schoengeist.android.daggerandroidsample.ui.module;

import net.schoengeist.android.daggerandroidsample.ui.fragment.DaggerFragment;

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
