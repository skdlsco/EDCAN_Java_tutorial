/**
 * Created by eka on 2017. 3. 19..
 */
public class MainActivity extends Activity {
    TextView textView;
    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.main_activity);

        textView = (TextView) findViewById(R.id.main_text);
        textView.setText("Hello world");
        textView.setOnClickListener(new View.OnClickListener() {
            int i=0;
            @Override
            public void onClick(View v) {
                i++;
                System.out.println(textView.getText());
                textView.setText(i+"");
            }
        });
        textView.setOnClick(true);
        textView.setOnClick(true);
        textView.setOnClick(true);
        textView.setOnClick(true);
    }
}
