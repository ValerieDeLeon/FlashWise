package com.example.puzzlewise;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class PuzzleAdapter extends BaseAdapter {

    private final Context mContext;
    private final String[] words;

    // 1
    public PuzzleAdapter(Context context, String[] words)
    {
        this.mContext = context;
        this.words = words;
    }

    // 2
    @Override
    public int getCount()
    {
        return words.length;
    }

    // 3
    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position)
    {
        return null;
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText(String.valueOf(position));
        return dummyTextView;
    }

}
