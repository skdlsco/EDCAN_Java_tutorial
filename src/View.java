/**
 * Created by eka on 2017. 3. 19..
 */
public class View {
    private OnClickListener onClickListener;
    public void setOnClickListener(OnClickListener listener){
        this.onClickListener = listener;

    }
    public void setOnClick(boolean is) {
        if (onClickListener != null && is) onClickListener.onClick(this);
    }
    public interface OnClickListener{
        void onClick(View v);
    }
}
