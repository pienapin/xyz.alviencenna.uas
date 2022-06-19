package xyz.alviencenna.uas.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import xyz.alviencenna.uas.R;

public class GridAdapterPort extends BaseAdapter {

    private static final String TAG = "GridAdapterPort";
    private Context mContext;

    public GridAdapterPort(Context mContext) {
        this.mContext = mContext;
    }

    public Integer[] port = {
            R.drawable.nft_square_like_imperfect_circle,
            R.drawable.nft_infinite_imperfect_circle,
            R.drawable.nft_potato_like_imperfect_circle,
            R.drawable.nft_pointy_imperfect_circle,
            R.drawable.nft_tall_imperfect_circle,
            R.drawable.nft_unconnected_imperfect_circle
    };

    @Override
    public int getCount() {
        return port.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(500, 500));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(port[i]);
        return imageView;
    }
}
