/*
 * Copyright (c) 2018 Frank Hossfeld
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 */

package com.github.nalukit.nalu.processor.composites.logger;

import com.github.nalukit.nalu.client.component.annotation.Composite;
import com.github.nalukit.nalu.client.component.annotation.Composites;
import com.github.nalukit.nalu.client.handler.AbstractHandler;
import com.github.nalukit.nalu.client.application.AbstractLogger;
import com.github.nalukit.nalu.processor.common.MockContext;

import java.util.List;

@Composites(@Composite(name = "composite", compositeController = MockComposite.class, selector = "composite"))
public class MockLogger extends AbstractLogger<MockContext> {

  @Override
  public void log(List<String> messages, boolean sdmOnly) {
    LoggingRequest request = new LoggingRequest();
    request.setMessages(messages);
    LoggingServiceFactory.INSTANCE
        .log(request)
        .onSuccess(response -> {})
        .onFailed(failed -> {})
        .send();
  }
}