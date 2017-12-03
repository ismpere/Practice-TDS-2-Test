*** Práctica realizada por Mario Torbado de la Rosa e Ismael Pérez Martín ***
	
	Tiempo total empleado en la realización de la práctica: 19h 19m
	
	- Ismael Pérez (ismpere): 12h 40m
	- Mario Torbado (martorb): 7h 39m 
	
	Clases que forman parte de la solución del proyecto:

		GD ---------------------------------------- SLOC:18   LLOC:61
		Linea-------------------------------------- SLOC:53   LLOC:167 
		Parada------------------------------------- SLOC:21   LLOC:72
		RedAutobuses------------------------------- SLOC:27   LLOC:100
		

	(test)
		AllTest------------------------------------ SLOC:12    LLOC:17 
		GDAllTest---------------------------------- SLOC:11    LLOC:16 
		GDBlackBoxText----------------------------- SLOC:62    LLOC:67 
		GDSecuenceTest----------------------------- SLOC:37    LLOC:42 
		GDTDDTest---------------------------------- SLOC:32    LLOC:37 
		LineaAllTest------------------------------- SLOC:12    LLOC:17 
		LineaBlackBoxTest-------------------------- SLOC:255   LLOC:260 	
		LineaGetParadasCercanasTest---------------- SLOC:73    LLOC:78 	
		LineaGetParadasConCorrespondenciaTest------ SLOC:103   LLOC:108 
		LineaGetParadasConTransbordoDirectTest----- SLOC:103   LLOC:108 
		LineaGetParadasTest------------------------ SLOC:11    LLOC:16 
		LineaSecuenceTest-------------------------- SLOC:117   LLOC:122 
		LineaTDDTest------------------------------- SLOC:212   LLOC:217 
		ParadaAllTest------------------------------ SLOC:11    LLOC:16 
		ParadaBlackBoxTest------------------------- SLOC:120   LLOC:125 
		ParadaSecuenceTest------------------------- SLOC:45    LLOC:50
		ParadaTDDTest------------------------------ SLOC:64    LLOC:69 
		RedAutobusesAllTest------------------------ SLOC:12    LLOC:17 
		RedAutobusesBlackBoxTest------------------- SLOC:100   LLOC:106 
		RedAutobusesGetLineasConParadasCercanasTest SLOC:112   LLOC:117 
		RedAutobusesTDDTest------------------------ SLOC:111   LLOC:116 
		
	(test de cada clase)
		GD----------------------------------------- SLOC:122   LLOC:142
		Parada------------------------------------- SLOC:240   LLOC:260
		Linea-------------------------------------- SLOC:886   LLOC:926
		RedAutobuses------------------------------- SLOC:335   LLOC:356
		



Aclaración sobre los test en las fixture:

Al tener las clases sin la implementación final y usar direcciones gps aleatorias, en las fixture puede parecer que uno de los test está repetido con respecto a los test TDD o los test de BlackBox.
Esto lo hemos hecho, porque consideramos que si llevamos el objeto a un estado concreto, queremos realizar todas las pruebas sobre el, a pesar de que ya hallamos comprobado que dichos métodos ya funcionan en las clases de test anteriores.

Por esto, esos test en las fixture no tienen solo el sentido de comprobar que funcionan correctamente, sino que a mayores nos sirven para coprobar el estado al cual hemos llevado a dicho objeto, aunque hallamos creado un test muy parecido por la necesidad de hacer el desarrollo TDD, y así poder generar algún método que usamos en esos test.

