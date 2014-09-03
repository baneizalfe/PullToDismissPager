PullToDismissPager
==================
PullToDismissPager is an Adroid Open Source Libray for showing ViewPager in similar way Facebook app does in its Friend Request Section. This library is based on awesome [AndroidSlidingUpPanel](https://github.com/umano/AndroidSlidingUpPanel) library by [Umano](https://github.com/umano). 

![Screenshot](/screenshot.jpg)

### Usage
* Include `com.mrbug.pulltodismisspager.PullToDismissPager` as the root element in your activity layout.
* The layout must have `gravity` set to either `top` or `bottom`.
* Make sure that it has only on child, your main layout.
* The main layout should have the width and the height set to `match_parent`.
For more information, checkout sample code.
```xml
<com.mrbug.pulltodismisspager.PullToDismissPager xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/pull_to_dismiss_pager"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="bottom">

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:paddingBottom="@dimen/activity_vertical_margin"
        android:paddingLeft="@dimen/activity_horizontal_margin"
        android:paddingRight="@dimen/activity_horizontal_margin"
        android:paddingTop="@dimen/activity_vertical_margin">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/hello_world" />
    </FrameLayout>
</com.mrbug.pulltodismisspager.PullToDismissPager>
```
* In your activity set your custom `PagerAdapter` to `PullToDismissPager`
```
pull_to_dismiss_pager = (PullToDismissPager) findViewById(R.id.pull_to_dismiss_pager);
pagerAdapter = new SlidingPagerAdapter(this);
pull_to_dismiss_pager.setPagerAdapter(pagerAdapter);
```
