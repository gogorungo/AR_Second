package com.example.ex_02_opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLSurfaceView extends GLSurfaceView {

    public MyGLSurfaceView(Context context) {
        super(context);

        setEGLContextClientVersion(2);
        
        setRenderer(new MyGLRenderer(context));
        
        // 화면이 바뀔때
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }


}
