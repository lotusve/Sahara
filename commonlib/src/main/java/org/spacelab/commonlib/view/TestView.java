package org.spacelab.commonlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import org.spacelab.commonlib.R;

public class TestView extends View {

    private static final String TAG = "Sahara-" + TestView.class.getSimpleName();

    private String text;
    private int number;

    public TestView(Context context) {
        super(context);
    }

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.test);

        text = typedArray.getString(R.styleable.test_text);
        number = typedArray.getInteger(R.styleable.test_number, -1);

        typedArray.recycle();

        Log.d(TAG, "text: " + text + ", number: " + number);
    }

}
