package com.android.framework.wifis.listener;

import android.view.View;

public interface OnItemClickListener {
    void onItemClick(View view, int position);

    void onItemLongClick(View view, int position);
}
