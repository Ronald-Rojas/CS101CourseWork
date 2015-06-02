package HW2;

import javax.swing.JOptionPane;

public class Problem311 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String monthStr = JOptionPane.showInputDialog("What is the month?");
		String yearStr = JOptionPane.showInputDialog("What is the year?");
		int month = Integer.parseInt(monthStr);
		int year = Integer.parseInt(yearStr);
		String currentMonth = "";
		int days = 0;
		switch(month){
		case 1: 
			currentMonth = "January";
			days = 31;
			break;
		
		case 2: 
			currentMonth = "Febuary";
			days = 28;
			break;
		case 3:
			currentMonth = "March";
			days = 31;
			break;
		case 4:
			currentMonth = "April";
			days = 30;
			break;
		case 5:
			currentMonth = "May";
			days = 31;
			break;
		case 6:
			currentMonth = "June";
			days = 30;
			break;
		case 7:
			currentMonth = "July";
			days = 31;
			break;
		case 8:
			currentMonth = "August";
			days = 31;
			break;
		case 9:
			currentMonth = "September";
			days = 30;
			break;
		case 10:
			currentMonth = "October";
			days = 31;
			break;
		case 11:
			currentMonth = "November";
			days = 30;
			break;
		case 12:
			currentMonth = "December";
			days = 31;
			break;
		}
		if(year % 4 == 0 && month == 2){
			days ++;
		}
		JOptionPane.showMessageDialog(null, currentMonth + " " + year + " had " + days + " days");
	}

}
