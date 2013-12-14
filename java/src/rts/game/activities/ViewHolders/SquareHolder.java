package rts.game.activities.ViewHolders;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by Vendetta on 2013-12-14.
 */
public class SquareHolder {
    private ImageView imageView;
    private RelativeLayout border;

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public RelativeLayout getBorder() {
        return border;
    }

    public void setBorder(RelativeLayout border) {
        this.border = border;
    }
}
