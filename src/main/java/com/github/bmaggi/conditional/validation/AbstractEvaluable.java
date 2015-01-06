/************************************************************
*  Licensed to the Apache Software Foundation (ASF) under one
*  or more contributor license agreements.  See the NOTICE file
*  distributed with this work for additional information
*  regarding copyright ownership.  The ASF licenses this file
*  to you under the Apache License, Version 2.0 (the
*  "License"); you may not use this file except in compliance
*  with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
**************************************************************/
package com.github.bmaggi.conditional.validation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.github.bmaggi.conditional.validation.conditions.FileCondition;
import com.github.bmaggi.conditional.validation.operators.And;
import com.github.bmaggi.conditional.validation.operators.Not;

/**
 * FIXME : correct javadoc example
 * @author benoit.maggi 
 *
 */
public abstract class AbstractEvaluable implements IEvaluable{

	protected List<IEvaluable> evaluableList ;
	
	public AbstractEvaluable() {
		this(new ArrayList<IEvaluable>());
	}
	
	public AbstractEvaluable(List<IEvaluable> evaluableList) {
		this.evaluableList = evaluableList;
	}
	
	public List<IEvaluable> getEvaluableList() {
		return evaluableList;
	}

	public void addAnd(And and){
		evaluableList.add(and);
	}
	
	public void addNot(Not not){
		evaluableList.add(not);
	}	
	
	public void addExist(File file){
		evaluableList.add(new FileCondition (file));
	}	
	
}
