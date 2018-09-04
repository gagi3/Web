/**
 * 
 */
package beans;

/**
 * @author laptop
 *
 */
public enum Urgency {
	CRVENO,
	NARANDZASTO,
	PLAVO;
	
	private String urgency;

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
}
