package DTO;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class PersonDTO {
	private String Name;
	private List<Integer> History;
	private int NeedHelp;
	private LocalTime LastStrInChar;
	private PersonDTO Teacher;
	private int AlreadyDone;
	private PersonDTO practicer;

	public PersonDTO(){
		History=new ArrayList<>();
		LastStrInChar=LocalTime.of(0, 0);
		AlreadyDone=0;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Integer> getHistory() {
		return History;
	}

	public void setHistory(List<Integer> history) {
		History = history;
	}

	public int getNeedHelp() {
		return NeedHelp;
	}

	public void setNeedHelp(int needHelp) {
		NeedHelp = needHelp;
	}


	public LocalTime getLastStrInChar() {
		return LastStrInChar;
	}

	public void setLastStrInChar(LocalTime lastStrInChar) {
		LastStrInChar = lastStrInChar;
	}


	public PersonDTO getTeacher() {
		return Teacher;
	}

	public void setTeacher(PersonDTO teacher) {
		Teacher = teacher;
	}

	public int getAlreadyDone() {
		return AlreadyDone;
	}

	public void setAlreadyDone() {
		AlreadyDone++;
	}

	public PersonDTO getPracticer() {
		return practicer;
	}

	public void setPracticer(PersonDTO practicer) {
		this.practicer = practicer;
	}





}
