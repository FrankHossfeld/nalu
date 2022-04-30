/*
 * Copyright (c) 2028 - 2020 - Frank Hossfeld
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

package com.github.nalukit.nalu.processor.compositeCreator.eventhandler.eventHandlerOnACompositeOk03.content.composite;

import com.github.nalukit.nalu.client.component.AbstractCompositeController;
import com.github.nalukit.nalu.client.component.annotation.CompositeController;
import com.github.nalukit.nalu.client.event.annotation.EventHandler;
import com.github.nalukit.nalu.processor.common.MockContext;
import elemental2.dom.HTMLElement;

@CompositeController(componentInterface = ICompositeComponent02.class,
                     component = CompositeComponent02.class)
public class Composite02
    extends AbstractCompositeController<MockContext, ICompositeComponent02, HTMLElement>
    implements ICompositeComponent02.Controller {

  public Composite02() {
  }

}
