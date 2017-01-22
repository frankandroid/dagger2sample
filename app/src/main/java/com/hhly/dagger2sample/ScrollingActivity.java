package com.hhly.dagger2sample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.hhly.dagger2sample.bean.FirstStudent;
import com.hhly.dagger2sample.bean.GsonTestStudent;
import com.hhly.dagger2sample.di.component.DaggerThirdLibComponent;
import com.hhly.dagger2sample.di.component.FirstComponent;
import com.hhly.dagger2sample.di.component.ThirdLibComponent;
import com.hhly.dagger2sample.di.module.ThirdLibModule;

import javax.inject.Inject;

public class ScrollingActivity extends AppCompatActivity implements View.OnClickListener {


    private String mStudentJson = "{\n" +
            "    \"name\": \"Jack\",\n" +
            "    \"age\": 18,\n" +
            "    \"isBoy\": true\n" +
            "}";

    @Inject
    FirstStudent mFirstStudent;
    @Inject
    Gson mGson;

    private FirstComponent mFirstComponent;
    private ThirdLibComponent mThirdLibComponent;
    private TextView mShowContent;
    private GsonTestStudent mGsonTestStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //使用component直接建立联系
        /*mFirstComponent = DaggerFirstComponent.builder().build();
        mFirstComponent.injectScrollingActivity(this);*/

        //使用module方式提供实例
        mThirdLibComponent = DaggerThirdLibComponent.builder()
                .thirdLibModule(new ThirdLibModule())
                .build();

        mThirdLibComponent.injectScrollingActivity(this);

         mGsonTestStudent = mGson.fromJson(mStudentJson, GsonTestStudent.class);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);

        Button injectFirst = (Button) findViewById(R.id.inject_first_student);
        injectFirst.setOnClickListener(this);

        Button injectModule = (Button) findViewById(R.id.inject_with_module);
        injectModule.setOnClickListener(this);

        mShowContent = (TextView) findViewById(R.id.show_content);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                Snackbar.make(v, "dagger2", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
            case R.id.inject_first_student:
                mShowContent.setText("");
                break;
            case R.id.inject_with_module:
                mShowContent.setText(mGsonTestStudent.toString()+"///"+mFirstStudent.toString());
                break;
        }
    }
}
