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
    Integer[] portfolio;
    int width, height;

    public GridAdapterPort(Context mContext, Integer[] port, int width, int height) {
        this.mContext = mContext;
        this.portfolio = port;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getCount() {
        return portfolio.length;
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
        imageView.setLayoutParams(new ViewGroup.LayoutParams(width, height));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(portfolio[i]);
        return imageView;
    }
}
