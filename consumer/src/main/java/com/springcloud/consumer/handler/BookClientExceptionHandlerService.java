package com.springcloud.consumer.handler;

import com.springcloud.consumer.client.BookClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookClientExceptionHandlerService implements BookClient {
    @Override
    public List getAllBookInfo() {
        String res = "消息消失，请小虹心查询";
        ArrayList<String> objects = new ArrayList<>();
        objects.add("消息消失，请小虹心查询");
        return objects;
    }
}
