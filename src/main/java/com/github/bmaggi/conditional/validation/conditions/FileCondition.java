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

import java.io.File;

import org.apache.maven.plugin.MojoExecutionException;

import com.github.bmaggi.conditional.validation.AbstractEvaluable;
import com.github.bmaggi.conditional.validation.IEvaluable;

/**
 * 
 * @author Benoit Maggi
 */
public class FileCondition extends AbstractEvaluable implements IEvaluable{

	private File file;

	/**
	 * A file condition to evaluate if the file exist
	 * @param file
	 */
	public FileCondition(File file) {
		super();
		this.file = file;
	}

	/* (non-Javadoc)
	 * @see com.github.bmaggi.simple.validation.IEvaluable#evaluate()
	 */
	public boolean evaluate() throws MojoExecutionException{
		return file != null && file.exists();
	}

}
