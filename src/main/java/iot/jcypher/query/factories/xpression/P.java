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

package iot.jcypher.query.factories.xpression;

import iot.jcypher.query.api.collection.IPredicateFunction;
import iot.jcypher.query.api.pattern.IElement;
import iot.jcypher.query.api.predicate.BooleanOperation;
import iot.jcypher.query.api.predicate.Concat;
import iot.jcypher.query.api.predicate.Concatenator;
import iot.jcypher.query.api.predicate.IBeforePredicate;
import iot.jcypher.query.api.predicate.PFactory;
import iot.jcypher.query.values.IHas;
import iot.jcypher.query.values.ValueElement;

/**
 * <div color='red' style="font-size:24px;color:red"><b><i>JCYPHER FACTORY FOR PREDICATE EXPRESSIONS</i></b></div>
 */
public class P {

	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>takes an expression like '<b>n.property("age")</b>', yielding a property,</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>or '<b>x.length()</b>', calculating some value</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>e.g. ...<b>valueOf(n.property("age"))</b>...</i></div>
	 * <br/>
	 */
	public static BooleanOperation valueOf(ValueElement val) {
		return PFactory.valueOf(val);
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>tests for existence of node labels or node/relation properties,</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>accepts expressions like '<b>n.property("age")</b>',</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>or '<b>n.label("Swedish")</b>'</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>e.g. ...<b>has(n.property("age"))</b></i></div>
	 * <br/>
	 */
	public static Concatenator has(IHas val) {
		return PFactory.has(val);
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>negate a boolean</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>e.g. ...<b>NOT()</b>.has(n.property("age"))</i></div>
	 * <br/>
	 */
	public static IBeforePredicate NOT() {
		return PFactory.NOT();
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>open a bracket; allows to nest expressions, must have a matching BR_CLOSE()</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>e.g. ...<b>BR_OPEN()</b>
	 * <br/>.valueOf(charlie.property("lastName")).EQUALS("Sheen")<br/>.<b>BR_CLOSE()</b></i></div>
	 * <br/>
	 */
	public static Concat BR_OPEN() {
		return PFactory.BR_OPEN();
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>matches a pattern expression against the graph. If the result is empty, returns false, else returns true</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>Use Factory Class <b>X</b> to create Expressions</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>e.g. ...<b>existsPattern(X</b>.node(n)...)</i></div>
	 * <br/>
	 */
	public static Concatenator existsPattern(IElement X) {
		return PFactory.existsPattern(X);
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>iterates over a collection allowing to test each element of the collection against a predicate expression</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>Use Factory Class <b>I</b> to create Expressions</i></div>
	 * <div color='red' style="font-size:18px;color:red"><i>e.g. ...<b>holdsTrue(I</b>.forAll(n)...)</i></div>
	 * <br/>
	 */
	public static Concatenator holdsTrue(IPredicateFunction I) {
		Concatenator ret = PFactory.holdsTrue(I);
		return ret;
	}
}
