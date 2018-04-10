
### Types of array
* 1 dimensional array
* 2 dimensional array -fixed column in all rows
* ##  jagged array variable column in all rows

```java

##Different ways to declare an array

int []a=new int[];//wrong

int []a=new int[5];//correct

int [5]a=new int[];// error size in java should always be in right side(RHS)

int a1[]={10,20,30};//correct

int a1[]=new int[]{10,20,30};//another way to declare array

int a2[];

a2={10,20,30}


int a3[];
a3=new int[]{10,20,30};//valid

int [][]b=new int [3][3];

int b[][]=new int [3][3];

int []b[]=new int[][3];//error

int [][]b=new int [3][];//valid in java row are mandatory but it is incomplete to make it complete

b[0]=new int[3];
b[1]=new int[5];
b[2]=new int[4];//ex of jagged array

int [][] b={{1,2},{3,4}};//is it valid? Yes

int [][] b=new int [][]{{1,2},{3,4}};

int [][]b;
b={{1,2,3},{3,4}};//error declaration fragmented

int [][]b;
b=new int [][]{{1,2},{3,4}};
```
