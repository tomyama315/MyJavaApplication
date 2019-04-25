package other;

import java.util.ArrayList;

import Action.MakeFlameAction;
import DTO.PersonDTO;

public class Test {

	public static void main(String[] args) {
		ArrayList<PersonDTO> personList=new ArrayList<>();
		for(int i=1;i<19;i++){
			PersonDTO person=new PersonDTO();
			person.setName("sample"+i+"番");
			personList.add(person);
			if(i%5==0){
				person.setNeedHelp(1);
				person.setTeacher(personList.get(i-2));
				personList.get(i-2).setPracticer(person);
			}
			}
		MakeFlameAction Act=new MakeFlameAction(personList);
		try{
		Act.makeflame();
		}catch(IndexOutOfBoundsException e){
			System.out.println("Error is occured.Please do again.");
		}

	}

}
