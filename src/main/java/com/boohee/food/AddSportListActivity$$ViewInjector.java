package com.boohee.food;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;

import com.boohee.one.R;
import com.boohee.widgets.PagerSlidingTabStrip;

public class AddSportListActivity$$ViewInjector<T extends AddSportListActivity> implements
        Injector<T> {
    public void inject(Finder finder, final T target, Object source) {
        target.mSlidingTab = (PagerSlidingTabStrip) finder.castView((View) finder
                .findRequiredView(source, R.id.sliding_tabs, "field 'mSlidingTab'"), R.id
                .sliding_tabs, "field 'mSlidingTab'");
        target.mViewPager = (ViewPager) finder.castView((View) finder.findRequiredView(source, R
                .id.viewpager, "field 'mViewPager'"), R.id.viewpager, "field 'mViewPager'");
        target.iv_sport_cart = (ImageView) finder.castView((View) finder.findRequiredView(source,
                R.id.iv_sport_cart, "field 'iv_sport_cart'"), R.id.iv_sport_cart, "field " +
                "'iv_sport_cart'");
        ((View) finder.findRequiredView(source, R.id.ll_add_custom_sport, "method 'onClick'"))
                .setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View p0) {
                target.onClick(p0);
            }
        });
        ((View) finder.findRequiredView(source, R.id.rl_sport_search, "method 'onClick'"))
                .setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View p0) {
                target.onClick(p0);
            }
        });
    }

    public void reset(T target) {
        target.mSlidingTab = null;
        target.mViewPager = null;
        target.iv_sport_cart = null;
    }
}
