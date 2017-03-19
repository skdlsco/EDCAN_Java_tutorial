/**
 * Created by eka on 2017. 3. 19..
 */
public class Activity {
    private int contentView;
    public void setContentView(int resId){
        this.contentView = resId;
    }
    public View findViewById(int resId){
        return new TextView();
    }
    protected void onCreate(){

    }
    protected void onStep(){

    }
    protected void onStart(){

    }
    protected void onReStart(){

    }
    protected void onDestroy(){

    }
    protected void onResume(){

    }
    protected void onPause(){

    }
}
