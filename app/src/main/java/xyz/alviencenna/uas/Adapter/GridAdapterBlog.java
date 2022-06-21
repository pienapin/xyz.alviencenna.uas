package xyz.alviencenna.uas.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import xyz.alviencenna.uas.R;

public class GridAdapterBlog extends BaseAdapter {


    private static final String TAG = "GridAdapterPort";
    private Context mContext;
    Integer[] thumbnail;
    String[] title;
    String[] content;
    LayoutInflater inflater;
    int width, height;

    public GridAdapterBlog(Context mContext, Integer[] thumbnail, String[] title, String[] content) {
        this.mContext = mContext;
        this.thumbnail = thumbnail;
        this.title = title;
        this.content = content;
        inflater = (LayoutInflater.from(mContext));
    }

    @Override
    public int getCount() {
        return thumbnail.length;
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
        if (view == null) {
            view = inflater.inflate(R.layout.gridblog, null);
        }
        ImageView thumbnailblog = view.findViewById(R.id.thumbnailblog);
        TextView titleblog = view.findViewById(R.id.titleblog);
        TextView contentblog = view.findViewById(R.id.contentblog);

        thumbnailblog.setImageResource(thumbnail[i]);
        titleblog.setText(title[i]);
        String contentthumbnail = content[i]+" (Continue reading...)";
        contentblog.setText(contentthumbnail);
        return view;
    }
}
