package com.example.test.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName:TestWhile
 * Package:com.bjpowernode.test.thread
 * Description:
 * Date:2019/11/30 11:15
 * Author:mj@bjpowernode.com
 **/
@Service
public class TestWhile {
    public ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    public void whileTrue() {
        while (true) {
            for (int i = 0; i < 1000; i++) {
                concurrentHashMap.put(Thread.currentThread().getName() + i, i);
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }

    public void startMultiThread(int num) {
        for (int i = 0; i < num; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    whileTrue();
                }
            }).start();
        }
    }

}
