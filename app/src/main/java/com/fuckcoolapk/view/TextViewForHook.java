package com.fuckcoolapk.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.fuckcoolapk.InitHook;
import com.fuckcoolapk.utils.AppUtil;

public class TextViewForHook extends TextView {
    public static float titleSize = AppUtil.dp2px(InitHook.context,10f);
    public static float title2Size = AppUtil.dp2px(InitHook.context,8f);
    public static String coolapkColor = "#ff109d58";

    public TextViewForHook(Context context) {
        super(context);
    }

    public TextViewForHook(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TextViewForHook(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TextViewForHook(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public TextViewForHook(Context context, String text, @Nullable Float size, @Nullable String color) {
        super(context);
        init(text, size, color);
    }

    private void init(String text, @Nullable Float size, @Nullable String color) {
        this.setText(text);
        if (size!=null){
            this.setTextSize(size);
        }
        if (color != null) {
            this.setTextColor(Color.parseColor(color));
        } else {
            if (AppUtil.isNightMode(super.getContext())) {
                this.setTextColor(Color.WHITE);
            } else {
                this.setTextColor(Color.BLACK);
            }
        }
    }

    {
        this.setPadding(AppUtil.dp2px(super.getContext(), 10), AppUtil.dp2px(super.getContext(), 10), AppUtil.dp2px(super.getContext(), 10), AppUtil.dp2px(super.getContext(), 10));
    }
}