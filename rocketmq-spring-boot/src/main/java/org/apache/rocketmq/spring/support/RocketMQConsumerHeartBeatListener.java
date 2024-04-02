package org.apache.rocketmq.spring.support;


import org.apache.rocketmq.client.RocketMQHeartBeatListener;

/**
 * consumer heartbeat handler
 */
public interface RocketMQConsumerHeartBeatListener extends RocketMQHeartBeatListener {
    /**
     * flag
     */
    String NAME = "Consumer";
}
