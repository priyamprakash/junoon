package com.mitm.junoon.Extra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.mitm.junoon.R;

public class MyAdapterFlipper extends BaseAdapter {

    Context context;
    int[] image;
	 LayoutInflater inflater;

	 public MyAdapterFlipper(Context context, int[] image) {
	 this.context = context;
	 this.image = image;

     inflater = (LayoutInflater.from(context));
	 }

	 @Override
	 public int getCount() {
	 	return 3;
	 }

	 @Override
	 public Object getItem(int position) {
	 return null;
	 }

	 @Override
	public long getItemId(int position) {

	 	return 0;
	 }

	 @Override
	 public View getView(int position, View view, ViewGroup parent) {
	 	view= inflater.inflate(R.layout.flipper_items,null);
	 ImageView imageView = view.findViewById(R.id.images);
	 imageView.setImageResource(image[position]);
	 return view;
	 }

}