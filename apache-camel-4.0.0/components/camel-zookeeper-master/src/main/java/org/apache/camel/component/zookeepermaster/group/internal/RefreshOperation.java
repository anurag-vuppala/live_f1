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
package org.apache.camel.component.zookeepermaster.group.internal;

import org.apache.camel.component.zookeepermaster.group.NodeState;

class RefreshOperation<T extends NodeState> implements Operation {
    private final ZooKeeperGroup<T> cache;
    private final ZooKeeperGroup.RefreshMode mode;

    RefreshOperation(ZooKeeperGroup<T> cache, ZooKeeperGroup.RefreshMode mode) {
        this.cache = cache;
        this.mode = mode;
    }

    @Override
    public void invoke() throws Exception {
        cache.refresh(mode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RefreshOperation<T> that = (RefreshOperation<T>) o;

        //noinspection RedundantIfStatement
        if (mode != that.mode) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return mode.hashCode();
    }

    @Override
    public String toString() {
        return "RefreshOperation(" + mode + "){}";
    }
}
