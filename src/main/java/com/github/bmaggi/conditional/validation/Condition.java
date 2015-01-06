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

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;

public class Condition extends AbstractEvaluable implements IEvaluable {

	public enum LEVEL {
		WARNING, ERROR
	}

	@Parameter(property = "message", defaultValue = "Condition failed")
	private String message;

	@Parameter(defaultValue = "WARNING")
	private LEVEL level;

	public boolean evaluate() throws MojoExecutionException {
		boolean res = true;
		for (IEvaluable iEvaluable : evaluableList) {
			res = res && iEvaluable.evaluate();
		}
		return res;
	}

	public String getMessage() {
		return message;
	}

	public LEVEL getLevel() {
		return level;
	}

}
