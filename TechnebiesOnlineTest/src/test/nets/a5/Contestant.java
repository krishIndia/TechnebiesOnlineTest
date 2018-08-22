package test.nets.a5;

/**
 * PROVIDE IMPLEMENTATION OF THIS CLASS
 */
public class Contestant {
	private String name;
	private Double weightInKg;
	
	public Contestant(String name, Double weightInKg) {
		this.name = name;
		this.weightInKg = weightInKg;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getweightInKg() {
		return weightInKg;
	}
	
	/**
	 * This contestant drinks 10% of one alcohol unit, the alcohol parts in the blood is updated accordingly.
	 */
	public void drink(){
		// IMPLEMENT YOUR CODE
	}
	
	/**
	 * @return whether this contestant is drunk, i.e. whether the number of alcohol parts per thousand
	 * in the blood exceeds 1.0
	 */
	public boolean isDrunk(){
		// IMPLEMENT YOUR CODE
		return false;
	}
	
	/**
	 * Resets the internal values of this contestant, making him/her instantly sober! (wouldn't that 
	 * be great in RL?
	 */
	public void reset(){
		// IMPLEMENT YOUR CODE
	}
	
	public boolean equals(Object o){
		
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Contestant that = (Contestant) o;
		
		if(Double.compare(this.weightInKg, weightInKg) != 0) return false;
		if(name != null ? !name.equals(that.name) : that.name != null) return false;
		
		return true;
		
	}
	
	public int hashCode(){
		int result;
		long temp;
		result = name != null ? name.hashCode() : 0;
		temp = weightInKg != +0.0d ? Double.doubleToLongBits(weightInKg) : 0L;
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	public String toString(){
		return "Contestatn{name='" + name + '\'' + ", weightInKg=" + weightInKg + '}';
	}
	
}
