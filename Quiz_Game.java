package day3;

import javax.swing.JOptionPane;

public class Quiz_Game {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Welcome to the Quiz on random facts");
		int score = 0;

		String a = JOptionPane.showInputDialog("Who won the 2017 French Open? First and last name please.");
		if (a.equalsIgnoreCase("Rafael Nadal")) {
			JOptionPane.showMessageDialog(null, "Good Job, Nadal is the best player at the French Open ever!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. Get better! The correct answer was Rafael Nadal.");
		}

		a = JOptionPane.showInputDialog("What is the most popular board game of all time?");
		if (a.equalsIgnoreCase("chess")) {
			JOptionPane.showMessageDialog(null, "Correct! That was a tought question to get right.");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. Get better! The correct answer was chess.");
		}

		a = JOptionPane
				.showInputDialog("Who was the only athelete ever to play in a world series and the super bowl?");
		if (a.equalsIgnoreCase("Deion Sanders")) {
			JOptionPane.showMessageDialog(null, "Good Job, You know sports facts!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. Get better! The correct answer was Deion Sanders!");
		}
		 a = JOptionPane.showInputDialog("Which animal has the highest gestation period?");
			if (a.equalsIgnoreCase("The African Elephant")) {
				JOptionPane.showMessageDialog(null, "Good Job, you are smart! The African Elephant has a gestation period of around 600 days.");
				score = score + 1;
			} else {
				JOptionPane.showMessageDialog(null, "You are wrong. Get better! The correct answer was the African Elephant which has a gestation period of about 600 days.");
			}
			 a = JOptionPane.showInputDialog("Who was the first president of the United States to live in the White House?");
				if (a.equalsIgnoreCase("John Adams")) {
					JOptionPane.showMessageDialog(null, "Good Job, John Adams was the second president!");
					score = score + 1;
				} else {
					JOptionPane.showMessageDialog(null, "You are wrong. Get better! The correct answer was John Adams who was the second president.");
				}
				JOptionPane.showMessageDialog(null, "You scored "+score+" out of 5 ");
			}
		}
	
