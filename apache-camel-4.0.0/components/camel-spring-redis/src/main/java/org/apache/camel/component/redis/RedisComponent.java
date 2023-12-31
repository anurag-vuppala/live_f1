/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.redis;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.annotations.Component;
import org.apache.camel.support.DefaultComponent;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Represents the component that manages {@link RedisEndpoint}.
 */
@Component("spring-redis")
public class RedisComponent extends DefaultComponent {

    @Metadata(autowired = true)
    private RedisTemplate<?, ?> redisTemplate;

    public RedisComponent() {
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        RedisConfiguration configuration = new RedisConfiguration();
        configuration.setRedisTemplate(redisTemplate);
        setHostAndPort(configuration, remaining);

        RedisEndpoint endpoint = new RedisEndpoint(uri, this, configuration);
        setProperties(endpoint, parameters);
        return endpoint;
    }

    private void setHostAndPort(RedisConfiguration configuration, String remaining) {
        String[] hostAndPort = remaining.split(":");
        if (hostAndPort.length > 0 && hostAndPort[0].length() > 0) {
            configuration.setHost(hostAndPort[0]);
        }
        if (hostAndPort.length > 1 && hostAndPort[1].length() > 0) {
            configuration.setPort(Integer.parseInt(hostAndPort[1]));
        }
    }

    public RedisTemplate<?, ?> getRedisTemplate() {
        return redisTemplate;
    }

    /**
     * Reference to a pre-configured RedisTemplate instance to use.
     */
    public void setRedisTemplate(RedisTemplate<?, ?> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
