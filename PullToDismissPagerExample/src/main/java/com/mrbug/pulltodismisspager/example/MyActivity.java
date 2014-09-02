package com.mrbug.pulltodismisspager.example;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.mrbug.pulltodismisspager.PullToDismissPager;


public class MyActivity extends ActionBarActivity {

    private PullToDismissPager pull_to_dismiss_pager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        pull_to_dismiss_pager = (PullToDismissPager) findViewById(R.id.pull_to_dismiss_pager);
        pagerAdapter = new SlidingPagerAdapter(this);
        pull_to_dismiss_pager.setPagerAdapter(pagerAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_show) {
            pull_to_dismiss_pager.expandPanel();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if(pull_to_dismiss_pager.isPanelExpanded())
            pull_to_dismiss_pager.collapsePanel();
        else
            super.onBackPressed();
    }

    private class SlidingPagerAdapter extends PagerAdapter{

        private LayoutInflater mInflater;

        public SlidingPagerAdapter(Context context){
            mInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            View view = mInflater.inflate(R.layout.pager_item, null, false);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((FrameLayout)object);
        }
    }
}
