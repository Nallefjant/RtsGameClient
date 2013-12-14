package rts.game.activities.Adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import rts.game.R;
import rts.game.activities.ViewHolders.SquareHolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Vendetta on 2013-12-11.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private WindowManager windowManager;
    private HashMap<Integer, Integer> imageMap;
    private SquareHolder squareHolder;
    private LayoutInflater inflater;

    private void init(){
        setImageIds();
        squareHolder = new SquareHolder();
    }
    // Constructor
    public ImageAdapter(Context c, WindowManager windowManager){
        mContext = c;
        this.windowManager = windowManager;
        inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        init();
    }

    private void setImageIds() {

        imageMap = new HashMap<Integer, Integer>(128);
        for(int i = 0; i < 128; i++){
            imageMap.put(i, R.drawable.green);
        }

    }

    @Override
    public int getCount() {
        return imageMap.size();
    }

    @Override
    public Object getItem(int position) {
        return imageMap.get(position);
    }

    @Override
    public long getItemId(int position) {
        return imageMap.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;
        //imageView

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.square, null);
            //imageView = new ImageView(mContext);
            imageView = (ImageView)convertView.findViewById(R.id.image);
                    DisplayMetrics displaymetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displaymetrics);

            int width = displaymetrics.widthPixels/8;
            //ImageView imageView = new ImageView(mContext);

            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(width, width));
        /*Those Guys get null*/
            //squareHolder.setBorder((RelativeLayout)convertView.findViewById(R.id.squareBorder));
            squareHolder.setImageView(imageView);

            convertView.setTag(squareHolder);

        } else {
            //squareHolder = (SquareHolder) convertView.getTag();
            imageView = (ImageView) convertView;
        }
        imageView.setBackgroundResource(R.drawable.green);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img = (ImageView)view;
                img.setImageResource(R.drawable.protoss_stalker);
                imageMap.put((Integer)img.getTag(), R.drawable.protoss_stalker);
                //RelativeLayout border = squareHolder.getBorder();
                //border.setBackgroundColor(255);

            }

        });



        imageView.setImageResource(imageMap.get(position));
        imageView.setTag(position);

        return imageView;
    }
}
