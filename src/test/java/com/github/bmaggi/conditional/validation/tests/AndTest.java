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
package com.github.bmaggi.conditional.validation.tests;

import org.apache.maven.plugin.MojoExecutionException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.bmaggi.conditional.validation.conditions.BooleanCondition;
import com.github.bmaggi.conditional.validation.conditions.ConditionFactory;
import com.github.bmaggi.conditional.validation.operators.And;

/**
 * 
 * 
 */
public class AndTest {


	 @DataProvider(name="andResolutionTable")
	     public Object [][] messageProvider() {
	         return new Object[][] {
	                 {true, false, false},
	                 {true, false, false},
	                 {false, false, false},
	                 {true, true, true}
	         } ;
	     }

	@Test(dataProvider = "andResolutionTable")
	public void simpleTestCase(boolean condition1, boolean condition2, boolean expectedresult) throws MojoExecutionException
	{
		BooleanCondition booleanCondition1 = ConditionFactory.createBooleanCondition(condition1);
		BooleanCondition booleanCondition2 = ConditionFactory.createBooleanCondition(condition2);
		And andEvaluation = ConditionFactory.createAndCondition(booleanCondition1, booleanCondition2);	
		Assert.assertEquals(expectedresult, andEvaluation.evaluate(), "Should be : "+condition1+"+"+condition2+" => "+expectedresult);	
	}	

	
	@Test
	public void noSubEvaluate()
	{
		And and = new And();
		boolean res = false;
		try {
			and.evaluate();
		} catch (MojoExecutionException e) {
			res = true;
		} finally {
			Assert.assertTrue(res, "An empty AND is expected to failed");	
		}
	}		
	
}
