package com.github.mfirry;

import com.sproutsocial.nsq.Publisher;

public class MainP {
    public static void main(String[] args) {

        Publisher publisher = new Publisher("127.0.0.1");

        byte[] data = "Hello nsq".getBytes();
        publisher.publishBuffered("example_topic", data);
    }
}
