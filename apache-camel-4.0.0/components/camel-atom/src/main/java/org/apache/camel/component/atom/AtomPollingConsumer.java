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
package org.apache.camel.component.atom;

import java.io.IOException;

import com.apptasticsoftware.rssreader.Item;
import com.apptasticsoftware.rssreader.RssReader;
import org.apache.camel.Processor;
import org.apache.camel.component.feed.FeedPollingConsumer;

/**
 * Consumer to poll atom feeds and return the full feed.
 */
public class AtomPollingConsumer extends FeedPollingConsumer {

    private RssReader rssReader;

    public AtomPollingConsumer(AtomEndpoint endpoint, Processor processor) {
        super(endpoint, processor);
    }

    @Override
    protected void doStart() throws Exception {
        this.rssReader = new RssReader();
        this.rssReader.addItemExtension("name", Item::setAuthor);
        super.doStart();
    }

    @Override
    protected Object createFeed() throws IOException {
        return AtomUtils.readItems(endpoint.getCamelContext(), endpoint.getFeedUri(), rssReader, endpoint.isSortEntries());
    }

}
