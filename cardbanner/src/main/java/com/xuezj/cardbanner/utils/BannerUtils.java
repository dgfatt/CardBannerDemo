package com.xuezj.cardbanner.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by xuezj on 2017/7/29.
 */

public class BannerUtils {
    public static int dp2px(Context context,int dpVal)
    {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpVal, context.getResources().getDisplayMetrics());
    }
//    public static int px2sp(Context context, float spVal) {
//        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
//                spVal, context.getResources().getDisplayMetrics());
//    }
    public static int px2sp(Context context ,float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }

    /**
     * 将sp值转换为px值，保证文字大小不变
     *
     * @param spValue
     * @return
     */
    public static int sp2px(Context context,float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }
}