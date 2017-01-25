package uk.ac.uea.framework;

import android.content.Context;
import android.util.Log;
import android.widget.HorizontalScrollView;

/**
 * Created by mradl on 18/01/2017.
 */

public class HorizView extends HorizontalScrollView {

        public HorizView(Context context) {
            super(context);
        }


        @Override
        protected void onScrollChanged(int l, int t, int oldl, int oldt) {
            // TODO Auto-generated method stub
            System.out.println("Testing Worked: Marc Adlington.");
            Log.i("Scrolling", "X from ["+oldl+"] to ["+l+"]");
            super.onScrollChanged(l, t, oldl, oldt);
        }

    }

