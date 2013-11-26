package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

import org.apache.commons.lang3.builder.CompareToBuilder;

@Entity
public class Task extends Model implements Comparable {

  @Id
  public Long id;
  
  @Required
  public String name;
  
  private String description;
  private int priority;
  private boolean checked;
 
  
  public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getPriority() {
	return priority;
}

public void setPriority(int priority) {
	this.priority = priority;
}

public boolean isChecked() {
	return checked;
}

public void setChecked(boolean checked) {
	this.checked = checked;
}

public static Finder<Long,Task> find = new Finder(
    Long.class, Task.class
  );

  public static List<Task> all() {
	  List<Task> lista = find.all();
	  Collections.sort(lista);
	  return lista;
	}

	public static void create(Task task) {
	  task.save();
	}

	public static void delete(Long id) {
	  find.ref(id).delete();
	}
	
	public static void updateAction(Long id){
		Task m = find.ref(id);
		m.setChecked(true);
		m.update();
	}
	

	@Override
	public int compareTo(Object arg0) {
		return priority -  ((Task) arg0).getPriority();

	}
}