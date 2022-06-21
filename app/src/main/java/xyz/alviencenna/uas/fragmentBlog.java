package xyz.alviencenna.uas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import xyz.alviencenna.uas.Adapter.GridAdapterBlog;

public class fragmentBlog extends Fragment {

    private static final String TAG = "fragmentBlog";
    protected MainActivity mainActivity;

    private GridView gridViewBlog;

    public fragmentBlog() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blog, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String[] titleblog = {
                getActivity().getString(R.string.title_artikel1),
                getActivity().getString(R.string.title_artikel2),
                getActivity().getString(R.string.title_artikel3),
                getActivity().getString(R.string.title_artikel4),
                getActivity().getString(R.string.title_artikel5),
                getActivity().getString(R.string.title_artikel6),
                getActivity().getString(R.string.title_artikel7),
                getActivity().getString(R.string.title_artikel8)
        };
        String[] contentblog = {
                getActivity().getString(R.string.content_artikel1),
                getActivity().getString(R.string.content_artikel2),
                getActivity().getString(R.string.content_artikel3),
                getActivity().getString(R.string.content_artikel4),
                getActivity().getString(R.string.content_artikel5),
                getActivity().getString(R.string.content_artikel6),
                getActivity().getString(R.string.content_artikel7),
                getActivity().getString(R.string.content_artikel8)
        };
        Integer[] thumbnailblog = {
                R.drawable.thumbnail_artikel1,
                R.drawable.thumbnail_artikel2,
                R.drawable.thumbnail_artikel3,
                R.drawable.thumbnail_artikel4,
                R.drawable.thumbnail_artikel5,
                R.drawable.thumbnail_artikel6,
                R.drawable.thumbnail_artikel7,
                R.drawable.thumbnail_artikel8
        };
        gridViewBlog = getView().findViewById(R.id.gridViewBlog);
        gridViewBlog.setAdapter(new GridAdapterBlog(this.getActivity(), thumbnailblog, titleblog, contentblog));
        gridViewBlog.setOnItemClickListener((parent, v, position, id) -> {
            Intent intent = null;
            switch (position) {
                    case 0:
                        intent = new Intent(this.getActivity(), ArtikelSatu.class);
                    break;

                    case 1:
                        intent = new Intent(this.getActivity(), ArtikelDua.class);
                    break;

                    case 2:
                        intent = new Intent(this.getActivity(), ArtikelTiga.class);
                    break;

                    case 3:
                        intent = new Intent(this.getActivity(), ArtikelEmpat.class);
                    break;

                    case 4:
                        intent = new Intent(this.getActivity(), ArtikelLima.class);
                    break;

                    case 5:
                        intent = new Intent(this.getActivity(), ArtikelEnam.class);
                    break;

                    case 6:
                        intent = new Intent(this.getActivity(), ArtikelTujuh.class);
                    break;

                    case 7:
                        intent = new Intent(this.getActivity(), ArtikelDelapan.class);
                    break;
            }
                    startActivity(intent);
        });
    }
}