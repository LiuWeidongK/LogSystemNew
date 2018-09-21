package com.wangdian.manage.service;

import org.springframework.stereotype.Service;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * @author : LiuWeidong
 * @date : 2018/9/21.
 */
@Service
public class ConsumerService implements MessageListener {

    @Override
    public void onMessage(Message message) {

    }
}
