/************************************************************************
 * Copyright (c) 2014 IoT-Solutions e.U.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ************************************************************************/

package iot.jcypher.query.ast.predicate;

import iot.jcypher.query.ast.pattern.PatternExpression;

public class ExistsPattern extends Predicate {

	private PatternExpression patternExpression;

	public PatternExpression getPatternExpression() {
		return patternExpression;
	}

	public void setPatternExpression(PatternExpression patternExpression) {
		this.patternExpression = patternExpression;
	}
}