package com.ataulm.somuchdeps.cart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class CartView extends FrameLayout {

    public CartView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        View.inflate(getContext(), R.layout.merge_cart, this);
        setBackgroundColor(getResources().getColor(R.color.smd__brand));
        setContentDescription(getResources().getText(R.string.smd__name));
    }

}
