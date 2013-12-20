
package com.likebamboo.painttools;

import android.graphics.BlurMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;

/**
 * 模糊画笔
 * 
 * @author Administrator
 */
public class BlurPen extends PenAbstract {

    private MaskFilter mBlur;

    public BlurPen(int penSize, int penColor) {
        this(penSize, penColor, Paint.Style.STROKE);
    }

    /**
     * @param size
     * @param penColor
     * @param style
     */
    public BlurPen(int size, int penColor, Paint.Style style) {
        super(size, penColor, style);
        // BlurMaskFilter 指定了一个模糊的样式和半径来处理Paint的边缘。
        mBlur = new BlurMaskFilter(8, BlurMaskFilter.Blur.NORMAL);
        mPenPaint.setMaskFilter(mBlur);
    }

    @Override
    public String toString() {
        return "type:blurPen: " + "\tshap: " + currentShape + "\thasDraw: " + hasDraw()
                + "\tsize: " + penSize + "\tstyle:" + style;
    }
}
