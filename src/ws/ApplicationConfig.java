package ws;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class ApplicationConfig extends Application{

	public Set<Class<?>> getClasses(){
		Set<Class<?>>  resources = new HashSet<>();
		addRestResourceClasses(resources);
		return resources;
	}

	private void addRestResourceClasses(Set<Class<?>> resources) {
		// TODO Auto-generated method stub
		resources.add(ws.Demo.class);
	}
}
