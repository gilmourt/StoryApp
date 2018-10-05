package com.example.gilmourt.storyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/* Code modeled after implementation found at:
    https://stackoverflow.com/questions/36824060/android-studio-making-an-interactive-story
        -Original Author: Niyamat Ullah

     This implementation by Timothy Gilmour, October 2018
 */
public class MainActivity extends AppCompatActivity {
    private Story1 RepeatDay = new Story1();
    Button c1;
    Button c2;
    private Page cpage;
    private TextView stext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stext = (TextView)findViewById(R.id.StoryText);
        c1 = (Button)findViewById(R.id.choice1);
        c2 = (Button)findViewById(R.id.choice2);

        showPage(0);

    }
    private void showPage(int c)
    {
        cpage = RepeatDay.getPage(c);
        String storytext = cpage.getStorytext();
        stext.setText(storytext);
        c1.setText(cpage.getC1().getCtext());
        c2.setText(cpage.getC2().getCtext());

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = cpage.getC1().getNextstep();//getting which next story
                showPage(nextPage);// and replace with old story
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = cpage.getC2().getNextstep();
                showPage(nextPage);
            }
        });
    }
}
