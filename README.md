conditional-validation
======================

## Travis CI 
[![Build Status](https://travis-ci.org/bmaggi/conditional-validation.svg?branch=master)](https://travis-ci.org/bmaggi/conditional-validation)

## Project Description
A simple example of a Maven Mojo providing conditional validation. The conditions are statically defined in the configuration pom.xml

## Usage :
 Operators : And, Not, Or, Xor
 Condition : FileCondition 
 
 ## Examples
  * File condition
```xml
<condition>
	<exist>README.md</exist>
</condition>
```  							
  * And Operator
```xml
<condition>
	<and>
		<exist>README.md</exist>
		<exist>LICENSE</exist>						
	</and>
</condition>
```  