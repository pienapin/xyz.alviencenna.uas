package xyz.alviencenna.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import xyz.alviencenna.uas.Adapter.GridAdapterPort;

public class fragmentHome extends Fragment {

    private GridView gridView;
    Integer[] port = {
            R.drawable.nft_square_like_imperfect_circle,
            R.drawable.nft_infinite_imperfect_circle,
            R.drawable.nft_potato_like_imperfect_circle,
            R.drawable.nft_pointy_imperfect_circle,
            R.drawable.nft_tall_imperfect_circle,
            R.drawable.nft_unconnected_imperfect_circle
    };

    public fragmentHome() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        // Portfolio stuff
        gridView = getView().findViewById(R.id.gridView);
        gridView.setAdapter(new GridAdapterPort(this.getActivity(), port, 300, 300));
        gridView.setOnItemClickListener((parent, v, position, id) -> {
            Uri uri = null;
            switch (position) {
                case 0:
                    uri = Uri.parse("https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/1605587066176380051664436660365339613703104674642348270650677325718548905985/");
                    break;

                case 1:
                    uri = Uri.parse("https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/1605587066176380051664436660365339613703104674642348270650677323519525650433/");
                    break;

                case 2:
                    uri = Uri.parse("https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/1605587066176380051664436660365339613703104674642348270650677322420014022657/");
                    break;

                case 3:
                    uri = Uri.parse("https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/1605587066176380051664436660365339613703104674642348270650677319121479139329/");
                    break;

                case 4:
                    uri = Uri.parse("https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/1605587066176380051664436660365339613703104674642348270650677321320502394881/");
                    break;

                case 5:
                    uri = Uri.parse("https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/1605587066176380051664436660365339613703104674642348270650677320220990767105/");
                    break;
            }
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }
}