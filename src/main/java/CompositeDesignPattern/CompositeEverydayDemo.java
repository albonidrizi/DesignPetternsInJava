package CompositeDesignPattern;

import java.util.HashMap;
import java.util.Map;

// CompositeEverydayDemo është një shembull i thjeshtë i përdorimit të Composite Pattern në jetën e përditshme.
// Në këtë rast, ne kemi një Map<String, String> që përmban atributet e një personi dhe një grupi.
// Nëse ne duam të përfaqësojmë të dhënat e sigurisë për një person dhe një grup, ne mund të përdorim një Map<String, String> për të përfaqësuar atributet e secilit.
// Në fund, ne mund të përdorim metoden putAll() për të shtuar të gjitha atributet e një personi dhe një grupi në një Map<String, String> të vetëm.
// Kjo është një shembull i thjeshtë i përdorimit të Composite Pattern në jetën e përditshme.
public class CompositeEverydayDemo {

	public static void main(String[] args) {
		Map<String, String> personAttributes = new HashMap<>();
		personAttributes.put("site_role", "person");
		personAttributes.put("access_role", "limited");
		
		Map<String, String> groupAttributes = new HashMap<>();
		groupAttributes.put("group_role", "claims");
		
		Map<String, String> secAttributes = new HashMap<>();
		secAttributes.putAll(personAttributes);
		secAttributes.putAll(groupAttributes);
		
		System.out.println(secAttributes);
	}
}
