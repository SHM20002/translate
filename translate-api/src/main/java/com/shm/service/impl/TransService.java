package com.shm.service.impl;


import com.alibaba.fastjson.JSON;
import com.shm.baidu.TransApi;
import com.shm.pojo.Trans;
import com.shm.pojo.TransResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TransService {

    @Autowired
    TransApi transApi;

    public TransResult result(Trans trans) {
        TransResult transResult = null;
        try {
            String str = transApi.getTransResult(trans.getQuery(), trans.getFrom(), trans.getTo());
            System.out.println(str);
            transResult = JSON.parseObject(str, TransResult.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
          return transResult;
    }

}
