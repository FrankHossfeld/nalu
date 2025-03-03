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

package com.github.nalukit.nalu.processor.parameterConstraintRule.pattern;

import com.github.nalukit.nalu.client.constraint.annotation.NotEmpty;
import com.github.nalukit.nalu.client.constraint.annotation.ParameterConstraintRule;
import com.github.nalukit.nalu.client.constraint.IsParameterConstraintRule;
import com.github.nalukit.nalu.client.constraint.annotation.Pattern;

@ParameterConstraintRule
@Pattern("^[0-9]{0,8}?$")
public interface ParameterConstraintPattern
    extends IsParameterConstraintRule {
}
