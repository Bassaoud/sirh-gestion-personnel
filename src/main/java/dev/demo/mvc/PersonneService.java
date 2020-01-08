package dev.demo.mvc;

import java.util.Arrays;
import java.util.List;

public class PersonneService {
	
	public List<Personne> listerPersonnes() {
		return Arrays.asList(
				new Personne("Jules", "Formation"),
				new Personne("Paul", "Formation"));
	}

}
