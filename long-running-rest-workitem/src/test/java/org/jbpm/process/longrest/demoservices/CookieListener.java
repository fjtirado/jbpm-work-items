/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.process.longrest.demoservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import javax.ws.rs.core.Cookie;

public class CookieListener {

    private List<Consumer<Map<String, Cookie>>> consumers = new ArrayList<>();

    public void accept(Map<String, Cookie> cookies) {
        consumers.forEach(c -> c.accept(cookies));
    }

    public void addConsumer(Consumer<Map<String, Cookie>> cookieConsumer) {
        consumers.add(cookieConsumer);
    }

    public void removeAllConsumers() {
        consumers.clear();
    }
}
