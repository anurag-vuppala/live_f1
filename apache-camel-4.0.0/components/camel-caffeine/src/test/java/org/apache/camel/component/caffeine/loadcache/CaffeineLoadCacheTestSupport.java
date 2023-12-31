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
package org.apache.camel.component.caffeine.loadcache;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.CacheLoader;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.apache.camel.BindToRegistry;
import org.apache.camel.test.junit5.CamelTestSupport;

public class CaffeineLoadCacheTestSupport extends CamelTestSupport {

    private Cache cache;

    @BindToRegistry("cache")
    public Cache createCache() {
        CacheLoader cl = new CacheLoader<String, Integer>() {

            @Override
            public Integer load(String key) {
                return Integer.parseInt(key) + 1;
            }
        };
        return cache = Caffeine.newBuilder().build(cl);
    }

    protected Cache getTestCache() {
        return cache;
    }
}
