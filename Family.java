import java.util.ArrayList;

public class Family {
	ArrayList<Person> aldults= new ArrayList<Person>();
	ArrayList<Person> children= new ArrayList<Person>();
	public void add(Person person)
	{
		if(person.getage()>=18)
			aldults.add(person);
		else
			children.add(person);
	}
	public boolean InFamily(Person person)
	{
		for(int i=0;i<aldults.size();i++)
			if(aldults.get(i).matches(person))
				return true;
		for(int i=0;i<children.size();i++)
			if(children.get(i).matches(person))
				return true;
		return false;
		
	}

}
