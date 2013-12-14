package rts.game.activities.domain;

/**
 * Created by Vendetta on 2013-12-14.
 */
public class Square {
    private Integer imageId;
    private boolean isSelected;

    public Square(Integer imageId) {
        this.imageId = imageId;
        this.isSelected = false;

    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
}
