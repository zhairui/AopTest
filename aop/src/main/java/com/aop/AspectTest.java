package com.aop;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by zhairui on 2017/1/23.
 */
@Aspect
public class AspectTest {
    private static final String TAG="MainActivity";
    @Before("execution(* android.app.Activity.on**(..))")
    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable{
        String key=joinPoint.getSignature().toString();
        Log.d(TAG,"onActivityMethodBefore:"+key);
        
    }
}

