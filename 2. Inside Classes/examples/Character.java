package examples;

public class Character {

	private String name;
	private String species;

	public Character(String name, String species) {
		this.name = name;
		this.species = species;
	}

	Character bilbo = new Character("Bilbo is mad", "Hobbit");
	Character legolas = new Character("Legolas is happy", "Elf");

}
