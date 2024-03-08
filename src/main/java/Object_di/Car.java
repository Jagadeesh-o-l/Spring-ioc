package Object_di;

public class Car {
   private Wheel w;

@Override
public String toString() {
	return "Car [w=" + w + ", getW()=" + getW() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

public Wheel getW() {
	return w;
}

public void setW(Wheel w) { // setter injection 
	this.w = w;
}
}

///>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 //>>>>>>>>> DEPENDENCY INJECTION-- Giving a parameters to POJO classes through the xml files is called  as a dependency injection
