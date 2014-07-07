package android.schoengeist.net.daggerandroidsample.ui.fragment;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.schoengeist.net.daggerandroidsample.DaggerApplication;
import android.schoengeist.net.daggerandroidsample.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import javax.inject.Inject;

/**
 * A placeholder fragment containing a simple view.
 */
public class DaggerFragment extends ListFragment {

    @Inject
    ArrayAdapter<String> adapter;

    public DaggerFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerApplication.inject(getActivity(), this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dagger, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setListAdapter(adapter);
    }
}
