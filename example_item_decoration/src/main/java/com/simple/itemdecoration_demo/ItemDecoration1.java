package com.simple.itemdecoration_demo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ItemDecoration1 extends RecyclerView.ItemDecoration {

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view,
                               @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {

        outRect.set(0, 0, 0, 10);
    }

    @Override
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        int childCount = parent.getLayoutManager().getChildCount();
        mPaint.setColor(Color.BLUE);

        for (int i = 0; i < childCount; i++) {
            View child = parent.getChildAt(i);
            ViewGroup.LayoutParams params = child.getLayoutParams();
//            c.drawText("A", child.getLeft(), child.getTop(), mPaint);
            c.drawLine(child.getLeft(), child.getBottom(),
                    child.getRight(), child.getBottom(),
                    mPaint);
        }
    }
}
