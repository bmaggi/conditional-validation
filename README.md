conditional-validation
======================

## Build status 
Travis [![Build Status](https://travis-ci.org/bmaggi/conditional-validation.svg?branch=master)](https://travis-ci.org/bmaggi/conditional-validation)

Codeship [![Codeship Status for bmaggi/conditional-validation](https://codeship.com/projects/02a41910-05e3-0133-e21e-3ae97f362442/status?branch=master)](https://codeship.com/projects/89551)

License [![License](http://img.shields.io/badge/license-APACHE2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)


## Maven Generated web [site] (http://bmaggi.github.io/conditional-validation/)

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
