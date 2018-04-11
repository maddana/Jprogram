### Destructor

````````java
We can have only one constructor for each class.

It works as a before garbage collector.

if an object in a program is created then object is allocated some memory with new.(Class object =new Class())  

Since the object is allocated memory if we are not using that object the memory will be wasted 

So destructor is used to remove the memory allocated for the object.

There is no default destructor.
``````

### Access Specifiers

* Public

* private

* protected

```````````
## public 

 public is accessed by any class in the program.
 
 Both from inside and outside of the class and package.
 
 ## private
 
 It can be accesed only with in the class.    
 The following table give us the view of access specifiers
 
| 					|public 		|	protected		|	default		|	private|
| ---				|---			|---				|---			|---		|
| Class				|	yes			|	no				|	yes			|	no		|
| Inner class		|	yes			|	yes				|	yes			|	yes		|
| Method			|		yes		|		yes			|		yes		|		yes	|
| Instance variable	|	yes			|	yes				|	yes			|	yes		|
| Class variable	|		yes		|		yes			|		yes		|		yes	|
| local variables	|	no			|	no				|	no			|	no		|
| Inteface			|	yes			|	no				|	yes			|	no		|
| Abstract class	|		yes		|		no			|		yes		|		no	|
| Constructor		|	yes			|					|	yes			|	yes		|
| Destructor		|		yes		|		no			|		no		|		no	|
 
 
 |											|public		|	protected		|	default		|	private|
 |`````										|`````		|```````			|`````			|`````		|
 | Within class								|	yes		|		yes			|		yes		|		yes|
 | Outside class within package				|	yes		|		yes			|		yes		|		no|
 | Outside the package						|	yes		|		no			|		no		|		no|
 | Outside the package after inheritance	|	yes		|		yes			|		no		|		no|
 
 * What is the Access Specifier for default constructor?
 
 * what is pojo,java bean,transfer object,value object,entity?
 
 ````````
 
 		
 