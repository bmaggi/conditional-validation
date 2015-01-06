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
package com.github.bmaggi.conditional.validation.conditions;

import com.github.bmaggi.conditional.validation.IEvaluable;
import com.github.bmaggi.conditional.validation.operators.And;

public class ConditionFactory {

	public final static BooleanCondition createBooleanCondition(boolean evaluation){
		return new BooleanCondition(evaluation);
	}

	public final static BooleanCondition createTrueCondition(){
		return new BooleanCondition(Boolean.TRUE);
	}	
	
	public final static BooleanCondition createFalseCondition(){
		return new BooleanCondition(Boolean.FALSE);
	}	
	
	public final static And createAndCondition(IEvaluable iEvaluable1, IEvaluable iEvaluable2){
		And and = new And();
		and.getEvaluableList().add(iEvaluable1);
		and.getEvaluableList().add(iEvaluable2);
		return and;
	}	
	
}
