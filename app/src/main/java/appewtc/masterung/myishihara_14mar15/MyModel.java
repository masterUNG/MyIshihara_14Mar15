package appewtc.masterung.myishihara_14mar15;

/**
 * Created by masterUNG on 3/15/15 AD.
 */
public class MyModel {

    private int intButton;

    public interface OnMyModelChangeListener {
        void onMyModelChangeListener(MyModel myModel);
    }   // interface

    private OnMyModelChangeListener onMyModelChangeListener;

    public void setOnMyModelChangeListener(OnMyModelChangeListener onMyModelChangeListener) {
        this.onMyModelChangeListener = onMyModelChangeListener;
    }

    public int getIntButton() {
        return intButton;
    }   //Getter

    public void setIntButton(int intButton) {
        this.intButton = intButton;

        if (this.onMyModelChangeListener != null) {
            this.onMyModelChangeListener.onMyModelChangeListener(this);
        }

    }   //Setter

}   // Main Class
