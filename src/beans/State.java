/**
 * 
 */
package beans;

/**
 * @author laptop
 *
 */
public enum State {
	ACTIVE,
	ARCHIVED;

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
