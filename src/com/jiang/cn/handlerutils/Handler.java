package com.jiang.cn.handlerutils;
public class Handler {

    private Looper mLooper ;

    private MessageQueue mQueue ;

    public Handler() {
        mLooper = Looper.myLooper();
        mQueue = mLooper.mQueue;
    }

    public void sendMessage(Message message){
        message.target = this;
        mQueue.enqueueMessage(message);
    }

    public void handleMessage(Message message){

    }

    public void dispatchMessage(Message message){
        handleMessage(message);
    }

}
