/**
 * 
 */
package beans;

/**
 * @author laptop
 *
 */
public enum Role {
	ADMIN, 
	VOLUNTEER;

	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
