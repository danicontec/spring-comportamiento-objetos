**Spring y objetos**

------------
Esta práctica sencilla es para ver el comportamiento de Spring con instancias de objetos y evitar errores a la hora de usarlo modificando datos. Podrian ser guardados o interpretados de manera incorrecta.

- Se han usado tres instancias distintas de clase para observar el comportamiento del Framework.
- El programa tiene un archivo XML que comunica con Spring para variar un poco del archivo Graddle y sobretodo ver que pasa sin que haga todo automático.
- Se pueden importar las librerias añadiendo Graddle, Maven o lo que consideres oportuno pero hay que añadirlas. 
- Segun el compilador que uses te puede pedir adicionalmente que importes la libreria de apache commons o saltara error de compilacion.

Se ha solucionado en este commit el problema de instanciacion gracias a la anotacion **@Scope**, que le permite al Framework crear mas de una instancia de clase.
Si quieres ver el problema que surge con las instanciaciones de una unica clase vuelve al commit anterior.

**Este programa solo ha sido creado para un testing de problema que puede surgir con el Framework Spring, tenerlo en cuenta en el desarrollo** 

De momento eso es todo, a **testear.**.