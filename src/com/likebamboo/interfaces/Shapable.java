package com.likebamboo.interfaces;

import android.graphics.Path;

import com.likebamboo.painttools.FirstCurrentPosition;

public interface Shapable {
	public Path getPath();

	public FirstCurrentPosition getFirstLastPoint();

	void setShap(ShapesInterface shape);
}
