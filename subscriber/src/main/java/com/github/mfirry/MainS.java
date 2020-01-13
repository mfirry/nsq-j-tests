package com.github.mfirry;

import com.sproutsocial.nsq.Subscriber;

public class MainS {
    public static void handleData(byte[] data) {
        System.out.println("Received:" + new String(data));
    }

    public static void main(String[] args) {

        Subscriber subscriber = new Subscriber("127.0.0.1");
        subscriber.subscribe("example_topic", "test_channel", MainS::handleData);
    }
}
