package in.jaggu.beans;

import org.springframework.stereotype.Component;

@Component
public class Robot {

	private Chip chip;

	public Robot() {
		System.out.println("robot::Constructor");
	}

//	public void work() {
//		String s = chip.chipType();
//		if (s.equals("32-Bit")) {
//			System.out.println("Performance is slow...");
//		} else {
//			System.out.println("Performance is ok...");
//		}
//	}
}
