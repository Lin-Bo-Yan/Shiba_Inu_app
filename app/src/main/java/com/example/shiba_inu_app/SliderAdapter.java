package com.example.shiba_inu_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.Hoder> {
    int[] images;
    public SliderAdapter(int[]images){this.images=images;}

    @Override
    public Hoder onCreateViewHolder(ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item,parent,false);

        return new Hoder(view);
    }

    @Override
    public void onBindViewHolder(Hoder viewHolder, int position) {
        viewHolder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class Hoder extends SliderViewAdapter.ViewHolder{
        ImageView imageView;
        public Hoder(View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image_view);
        }
    }
}
