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
package com.github.bmaggi.conditional.validation.operators;

import org.apache.maven.plugin.MojoExecutionException;

import com.github.bmaggi.conditional.validation.AbstractEvaluable;
import com.github.bmaggi.conditional.validation.IEvaluable;

/**
 * And operator can
 * 
 * @author Benoit Maggi
 */
public class And extends AbstractEvaluable implements IEvaluable {

	public And() {
		super();
	}

	public boolean evaluate() throws MojoExecutionException {
		// check that there is a least one sub evaluable
		if (evaluableList.size() == 0) {
			throw new MojoExecutionException(
					"And requires at least one evaluable element");
		}

		boolean res = true;
		for (IEvaluable iEvaluable : evaluableList) {
			res = res && iEvaluable.evaluate();
		}
		return res;
	}

}
