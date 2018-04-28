conditional-validation
======================
A simple example of a Maven Mojo providing conditional validation. The conditions are statically defined in the configuration pom.xml

## Status 

[![Build Status](https://travis-ci.org/bmaggi/conditional-validation.svg?branch=master)](https://travis-ci.org/bmaggi/conditional-validation)
[![License](http://img.shields.io/badge/license-APACHE2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.bmaggi/conditional-validation/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/com.github.bmaggi/conditional-validation)

## Maven Generated [site](http://bmaggi.github.io/conditional-validation/)

## Usage:
 Operators : And, Not, Or, Xor 
 
 Condition : FileCondition 
 
 ## Examples:
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

## To release on maven central:
```  
mvn release:clean release:prepare 
```  
followed by
```  
mvn release:perform
```  
