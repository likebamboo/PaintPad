
package com.likebamboo.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

import com.likebamboo.interfaces.Shapable;

/**
 * @desc 五角星
 * @author <a href="mailto:liwt@273.cn" target="_blank">liwt@273.cn</a>
 * @create 2013-9-4
 * @Copyright 2013 <a href="http://www.273.cn" target="_blank">www.273.cn</a>
 *            Inc. All rights reserved.
 */
public class Star extends ShapeAbstract {

    public Star(Shapable paintTool) {
        super(paintTool);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        // TODO Auto-generated method stub
        super.draw(canvas, paint);

        float cx = x2 - x1;
        float cy = y2 - y1;

        Path paths = new Path();
        // 第零个点 (起点)(上边角的顶点)
        paths.moveTo(x1 + cx / 2, y1);
        // 第一个点
        paths.lineTo(x1 + cx * 0.61803F, y1 + cy * 0.363F);
        // 第二个点(右边的角的顶点)
        paths.lineTo(x2, y1 + cy * 0.363F);
        // 第三个点
        paths.lineTo(x1 + cx * 0.691F, y1 + cy * 0.58778F);
        // 第四个点(右下角的角的顶点)
        paths.lineTo(x1 + cx * 0.86327F, y2);
        // 第五个点
        paths.lineTo(x1 + cx / 2, y1 + cy * 0.736F);
        // 第六个点(左下角的角的顶点)
        paths.lineTo(x1 + cx * 0.1367F, y2);
        // 第七个点
        paths.lineTo(x1 + cx * 0.309F, y1 + cy * 0.58778F);
        // 第八个点(左边的角的顶点)
        paths.lineTo(x1, y1 + cy * 0.363F);
        // 第九个点
        paths.lineTo(x1 + cx * 0.38197F, y1 + cy * 0.363F);
        // 第十个点(回到原点)
        paths.lineTo(x1 + cx / 2, y1);

        paths.close();
        canvas.drawPath(paths, paint);
    }
}
