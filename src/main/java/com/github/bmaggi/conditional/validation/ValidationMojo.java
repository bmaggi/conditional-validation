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
import java.util.List;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import com.github.bmaggi.conditional.validation.Condition.LEVEL;

@Mojo(name = "validateMe",
      defaultPhase = LifecyclePhase.VALIDATE,
      requiresProject = false)
public class ValidationMojo extends AbstractMojo {
	
	@Parameter(property = "conditions")
	private List<Condition> conditions;	
	
	@Parameter(property = "basedir")
	private File baseDirectory;

	/* (non-Javadoc)
	 * @see org.apache.maven.plugin.AbstractMojo#execute()
	 */
	public void execute() throws MojoExecutionException, MojoFailureException {
		Log log = getLog();
		log.info("TODO-4 Validation");
		log.info(""+conditions.size());
		for (Condition condition : conditions) {
			log.info(""+condition.toString()+" class :"+condition.getClass());
			if (!(condition).evaluate()){
				String message = condition.getMessage();
				if (LEVEL.ERROR == condition.getLevel()){
					log.error(" Condition failed"+ message);
					throw new MojoExecutionException( "A condition with a level ERROR failed" );
				} else {
					log.warn("Condition failed"+message);
				}
			}			
		}
	}
}