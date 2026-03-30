package Attendance;

public class AttendanceManager {
	private static AttendanceManager attendanceManager = new AttendanceManager();
	private int count;
	
	private AttendanceManager() {count = 0;}
	
	public static AttendanceManager getInstace() {return attendanceManager;}
	
	public void addAttendance() {
		count++;
	}
	
	public int getAttendance() {
		return count;
	}
}
