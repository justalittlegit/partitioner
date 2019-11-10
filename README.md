# Partitioner
Solution's source code for the partitionning exercise.
## Prerequisites
Java 8 >, Git, Maven, Eclipse IDE or other.
## Getting started
Using powershell, clone repository from Github:
```
git clone https://github.com/justalittlegit/partitioner.git
```
Import project into IDE as a Maven project.
## Testing
The partitionning method is implemented in a static method, which can be accessed as the following:
```
Partitioner.partitionIt(list, maxPartitionSize);
```
The project is provided with some JUnit4 tests
## Using as a library
The project can be used as maven dependency using JitPack. A release 1.0.0 has been made on Github.
- In pom.xml, add the following repository:
```
	<repositories>
		<repository>
			<id>jitpack.io</id>
			<url>https://jitpack.io</url>
		</repository>
	</repositories>
```
- In pom.xml, add the following dependency:
```
		<dependency>
			<groupId>com.github.justalittlegit</groupId>
			<artifactId>partitioner</artifactId>
			<version>c2b86b1</version>
		</dependency>
```
The version here "c2b86b1" is part of the commit id. It can be retrieved in Github repository releases. 

