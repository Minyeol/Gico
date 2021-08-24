package org.techtown.gico;

import android.view.View;

public interface OnSmallUnitItemClickListener {
    // 뷰홀더 객체와 뷰 객체, 뷰의 position 정보 전달
    public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position);
}
