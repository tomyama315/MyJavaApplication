package other;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Action.MakeFlameAction;
import DTO.InchargeScheduleDTO;
import DTO.PersonDTO;

public class ResultExp extends JFrame implements ActionListener {
	static ArrayList<PersonDTO> personList = new ArrayList<>();

	public ResultExp(String title) {

		setTitle(title);
		setBounds(0, 0, 1450, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();

		p1.setLayout(new FlowLayout());


		JLabel titleLabel1 = new JLabel("8:00-9:00/8:30-9:30"+"\n");
		JPanel t1 = new JPanel();
		t1.add(titleLabel1);
		t1.setLayout(new BoxLayout(t1, BoxLayout.PAGE_AXIS));
		for (InchargeScheduleDTO seat : MakeFlameAction.seatList) {
			JTextField text= new JTextField("担当席番号:" + seat.getIdentifyNum() + "  担当者:" + seat.getPerson1().getName()
					+ "  開始時刻:" + (seat.getIdentifyNum() % 2 == 0 ? "8:00" : "8:30") + "  終了時刻"
					+ (seat.getIdentifyNum() % 2 == 0 ? "9:00" : "9:30")+"\n");
			text.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
			text.setEnabled(false);
			text.setDisabledTextColor(Color.BLACK);
			t1.add(text);
		}

		JLabel titleLabel2 = new JLabel("9:00-10:00/9:30-10:30"+"\r\n");
		t1.add(titleLabel2);
		for (InchargeScheduleDTO seat : MakeFlameAction.seatList) {
			JTextField text1= new JTextField("担当席番号:" + seat.getIdentifyNum() + "  担当者:" + seat.getPerson2().getName()
					+ "  開始時刻:" + (seat.getIdentifyNum() % 2 == 0 ? "9:00" : "9:30") + "  終了時刻"
					+ (seat.getIdentifyNum() % 2 == 0 ? "10:00" : "10:30"));
			text1.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
			text1.setEnabled(false);
			text1.setDisabledTextColor(Color.BLACK);
			t1.add(text1);
		}

		JLabel titleLabel3 = new JLabel("10:00-11:00/10:30-11:30");
		t1.add(titleLabel3);
		for (InchargeScheduleDTO seat : MakeFlameAction.seatList) {
			JTextField text2= new JTextField("担当席番号:" + seat.getIdentifyNum() + "  担当者:" + seat.getPerson3().getName()
					+ "  開始時刻:" + (seat.getIdentifyNum() % 2 == 0 ? "10:00" : "10:30") + "  終了時刻"
					+ (seat.getIdentifyNum() % 2 == 0 ? "11:00" : "11:30"));
			text2.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
			text2.setEnabled(false);
			text2.setDisabledTextColor(Color.BLACK);
			t1.add(text2);
		}
		p1.add(t1);


		JLabel titleLabel4 = new JLabel("11:00-12:00/11:30-12:30");
		t1.add(titleLabel4);
		t1.setLayout(new BoxLayout(t1, BoxLayout.PAGE_AXIS));
		for (InchargeScheduleDTO seat : MakeFlameAction.seatList) {
			JTextField text3= new JTextField("担当席番号:" + seat.getIdentifyNum() + "  担当者:" + seat.getPerson4().getName()
					+ "  開始時刻:" + (seat.getIdentifyNum() % 2 == 0 ? "11:00" : "11:30") + "  終了時刻"
					+ (seat.getIdentifyNum() % 2 == 0 ? "12:00" : "12:30"));
			text3.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
			text3.setEnabled(false);
			text3.setDisabledTextColor(Color.BLACK);
			t1.add(text3);
		}

		JPanel t2 = new JPanel();

		JLabel titleLabel5 = new JLabel("12:00-13:00/12:30-13:30");
		t2.add(titleLabel5);
		for (InchargeScheduleDTO seat : MakeFlameAction.seatList) {
			JTextField text4= new JTextField("担当席番号:" + seat.getIdentifyNum() + "  担当者:" + seat.getPerson5().getName()
					+ "  開始時刻:" + (seat.getIdentifyNum() % 2 == 0 ? "12:00" : "12:30") + "  終了時刻"
					+ (seat.getIdentifyNum() % 2 == 0 ? "13:00" : "13:30"));
			text4.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
			text4.setEnabled(false);
			text4.setDisabledTextColor(Color.BLACK);
			t2.add(text4);
		}

		JLabel titleLabel6 = new JLabel("13:00-14:00/13:30-14:30");
		t2.add(titleLabel6);
		for (InchargeScheduleDTO seat : MakeFlameAction.seatList) {
			JTextField text5= new JTextField("担当席番号:" + seat.getIdentifyNum() + "  担当者:" + seat.getPerson6().getName()
					+ "  開始時刻:" + (seat.getIdentifyNum() % 2 == 0 ? "13:00" : "13:30") + "  終了時刻"
					+ (seat.getIdentifyNum() % 2 == 0 ? "14:00" : "14:30"));
			text5.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
			text5.setEnabled(false);
			text5.setDisabledTextColor(Color.BLACK);

			t2.add(text5);
		}

		t2.setLayout(new BoxLayout(t2, BoxLayout.PAGE_AXIS));
		JLabel titleLabel7 = new JLabel("14:00-15:00/14:30-15:30");
		t2.add(titleLabel7);
		for (InchargeScheduleDTO seat : MakeFlameAction.seatList) {
			JTextField text6= new JTextField("担当席番号:" + seat.getIdentifyNum() + "  担当者:" + seat.getPerson7().getName()
					+ "  開始時刻:" + (seat.getIdentifyNum() % 2 == 0 ? "14:00" : "14:30") + "  終了時刻"
					+ (seat.getIdentifyNum() % 2 == 0 ? "15:00" : "15:30"));
			text6.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
			text6.setEnabled(false);
			text6.setDisabledTextColor(Color.BLACK);

			t2.add(text6);
		}

		JLabel titleLabel8 = new JLabel("15:00-16:00/15:30-16:30");
		t2.add(titleLabel8);
		for (InchargeScheduleDTO seat : MakeFlameAction.seatList) {
			JTextField text7= new JTextField("担当席番号:" + seat.getIdentifyNum() + "  担当者:" + seat.getPerson8().getName()
					+ "  開始時刻:" + (seat.getIdentifyNum() % 2 == 0 ? "15:00" : "15:30") + "  終了時刻"
					+ (seat.getIdentifyNum() % 2 == 0 ? "16:00" : "16:30"));
			text7.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
			text7.setEnabled(false);
			text7.setDisabledTextColor(Color.BLACK);
			t2.add(text7);
		}

		p1.add(t2);

		JPanel t3 = new JPanel();
		t3.setLayout(new BoxLayout(t3, BoxLayout.PAGE_AXIS));
		int width = t3.getMaximumSize().width;
		t3.setMaximumSize(new Dimension(width,Short.MAX_VALUE));

		JLabel titleLabel9 = new JLabel("Final History");
		t3.add(titleLabel9);

		for (PersonDTO person :MakeFlameAction.personList) {
				JTextField text7= new JTextField("名前:" + person.getName() + "  最終シフト:" + person.getLastStrInChar()
						+ "  一時間休憩を何回したか:" + person.getAlreadyDone() + "  入ったシフト:"
						+person.getHistory()+"教務担当者:" + (person.getNeedHelp() == 1 ? person.getTeacher().getName() : "No Need"));
				text7.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 10));
				text7.setEnabled(false);
				text7.setDisabledTextColor(Color.GRAY);
				t3.add(Box.createRigidArea(new Dimension(23,23)));
				t3.add(text7);
			}
			p1.add(t3);








		getContentPane().add(p1, BorderLayout.LINE_START);

	}

	public static void ShowResult(List<InchargeScheduleDTO> setInformation) {
		ResultExp frame = new ResultExp("Show");
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
