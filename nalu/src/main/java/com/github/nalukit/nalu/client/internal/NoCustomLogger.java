/*
 * Copyright (c) 2018 - 2019 - Frank Hossfeld
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

package com.github.nalukit.nalu.client.internal;

import com.github.nalukit.nalu.client.application.AbstractLogger;
import com.github.nalukit.nalu.client.context.IsContext;
import com.github.nalukit.nalu.client.internal.annotation.NaluInternalUse;

import java.util.List;

@NaluInternalUse
public final class NoCustomLogger
    extends AbstractLogger<IsContext> {

  @Override
  public void log(List<String> messages,
                  boolean sdmOnly) {
    // Do nothind ...
  }

}
