package com.roat.test;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by XiLei on 2020/4/8
 */
public class SPUtils {
    /**
     * 保存当前Fragment位置
     *
     * @param mContext
     * @param position
     */
    public static void saveMainCurrentPosition(Context mContext, int position) {
        SharedPreferences mSP = mContext.getSharedPreferences("MainCurrentPosition", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = mSP.edit();
        edit.putInt("MainCurrentPosition", position);
        edit.commit();
    }

    public static int getMainCurrentPosition(Context mContext) {
        SharedPreferences mSP = mContext.getSharedPreferences("MainCurrentPosition", Context.MODE_PRIVATE);
        return mSP.getInt("MainCurrentPosition", 0);
    }

    /**
     * 保存将要去的Fragment位置
     *
     * @param mContext
     * @param position
     */
    public static void saveMainClickPosition(Context mContext, int position) {
        SharedPreferences mSP = mContext.getSharedPreferences("MainClickPosition", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = mSP.edit();
        edit.putInt("MainClickPosition", position);
        edit.commit();
    }

    public static int getMainClickPosition(Context mContext) {
        SharedPreferences mSP = mContext.getSharedPreferences("MainClickPosition", Context.MODE_PRIVATE);
        return mSP.getInt("MainClickPosition", 0);
    }
}
