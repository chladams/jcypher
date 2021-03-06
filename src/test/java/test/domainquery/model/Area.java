/************************************************************************
 * Copyright (c) 2014-2015 IoT-Solutions e.U.
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

package test.domainquery.model;

public class Area extends AbstractArea {

	private String areaCode;
	private String name;
	
	public Area() {
		super();
	}

	public Area(String areaCode, String name, AreaType areaType) {
		super(areaType);
		this.areaCode = areaCode;
		this.name = name;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getName() {
		return name;
	}

		@Override
	public String toString() {
		return "Area [name=" + name + "]";
	}
	
}
