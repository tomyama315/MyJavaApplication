package other;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Action.MakeFlameAction;
import DTO.InchargeScheduleDTO;
import DTO.PersonDTO;

public class Test extends JFrame implements ActionListener {
	static List<JTextField> textList = new ArrayList<>();
	static ArrayList<PersonDTO> personList = new ArrayList<>();
	GridLayout flayout = new GridLayout();

	public Test(String title) {

		setTitle(title);
		setBounds(0, 0, 300, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();

		flayout.setRows(20);
		flayout.setColumns(1);
		p1.setLayout(flayout);

		for (int i = 0; i < 18; i++) {
			textList.add(new JTextField("Name" + (i + 1), 10));
		}
		for (JTextField f : textList) {
			p1.add(f);
		}

		JButton btn = new JButton("Caliculate");
		btn.addActionListener(this);
		btn.setActionCommand("Next");
		p1.add(btn);

		getContentPane().add(p1, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		Test frame = new Test("Assign Menbers TASK");
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		List<InchargeScheduleDTO> seatInformation=new ArrayList<>();
		personList.removeIf(s -> true);
		for (int i = 0; i < 18; i++) {
			textList.get(i).getText();
			PersonDTO person = new PersonDTO();
			person.setName(textList.get(i).getText());
			personList.add(person);

		}

		MakeFlameAction Act = new MakeFlameAction(personList);
		try {
			seatInformation=Act.makeflame();
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Error is occured.Please do again.");
		}
		ResultExp.ShowResult(seatInformation);;
	}

}
