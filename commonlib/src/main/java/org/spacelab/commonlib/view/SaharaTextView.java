package org.spacelab.commonlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;

import org.spacelab.commonlib.R;

public class SaharaTextView extends android.support.v7.widget.AppCompatTextView {

    private static final String TAG = "Sahara-" + SaharaTextView.class.getSimpleName();

    private String text;
    private int number;

    public SaharaTextView(Context context) {
        super(context);

        init(context, null);
    }

    public SaharaTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context, attrs);
    }

    public SaharaTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context, attrs);
    }

    private void init(Context context, @Nullable AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.test);

        text = typedArray.getString(R.styleable.test_text);
        number = typedArray.getInteger(R.styleable.test_number, -1);

        typedArray.recycle();

        Log.d(TAG, "text: " + text + ", number: " + number);
    }


}
