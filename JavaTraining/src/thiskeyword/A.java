package thiskeyword;

//passing this as parameter 

class A{  
	  int data=10;  
	  A(){  
	   B b=new B(this);  
	   b.display();  
	  }  
	  public static void main(String args[]){  
	   A a=new A();  
	  }  
	}  


class B{  
	  A obj;  
	  B(A obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);//using data member of A class  
	  }  
	}  