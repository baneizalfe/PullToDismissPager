PullToDismissPager
==================
PullToDismissPager is an Adroid Open Source Libray for showing ViewPager in similar way Facebook app does in its Friend Request Section. This library is based on awesome [AndroidSlidingUpPanel](https://github.com/umano/AndroidSlidingUpPanel) library by [Umano](https://github.com/umano). 

![Screenshot](/screenshot.jpg)

Download the source to use it as a library project or use it directly from Maven Central in your dependencies.  For example:

	dependencies {
		compile 'com.github.baneizalfe.pulltodismisspager:library:1.0.1'
	}


### Usage
* Include `com.mrbug.pulltodismisspager.PullToDismissPager` as the root element in your activity layout.
* No need for gravity attribite anymore. Default is BOTTOM
* Make sure that it has only one child, your main layout.
* The main layout should have the width and the height set to `match_parent`.
For more information, checkout sample code.
```xml
<com.mrbug.pulltodismisspager.PullToDismissPager xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/pull_to_dismiss_pager"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

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
###ToDo
Add some easing to animations
### Licence

> Licensed under the Apache License, Version 2.0 (the "License");
> you may not use this work except in compliance with the License.
> You may obtain a copy of the License in the LICENSE file, or at:
>
>  [http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)
>
> Unless required by applicable law or agreed to in writing, software
> distributed under the License is distributed on an "AS IS" BASIS,
> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
> See the License for the specific language governing permissions and
> limitations under the License.
