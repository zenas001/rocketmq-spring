package org.apache.rocketmq.spring.support;

import org.apache.rocketmq.client.RocketMQHeartBeatListener;

/**
 * producer heartbeat handler
 */
public interface RocketMQProducerHeartBeatListener extends RocketMQHeartBeatListener {
    /**
     * flag
     */
    String NAME = "Producer";

}
