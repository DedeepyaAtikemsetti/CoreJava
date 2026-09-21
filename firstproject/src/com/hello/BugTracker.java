package com.hello;

public class BugTracker {
    int bugId;
    String applicationName;
    String bugTitle;
    String severity;
    String priority;
    String status;
    String assignedDeveloper;
    int getBugID(){
    	return bugId;
    }
    String getApplicationName() {
    	return applicationName;
    }
    String getBugTitle()
    {
    	return "["+(bugTitle)+"] Appointment time zones mismatch between doctor dashboard and patient receipt";
    }
    String getSeverity()
    {
    	return severity;
    }
    String getPriority()
    {
    	return priority;
    }
    String getStatus()
    {
    	return status;
    }
    String getAssignedDeveloper() {
    	return assignedDeveloper;
    }
    void assignToDeveloper(int bugid ,String developerName) {
    	if(bugid==bugId) {
    	assignedDeveloper=developerName;
    	}
    	updateStatus("On Process");
    }
    void updateStatus(String newstatus)
    {
    	status=newstatus;
    }
    void displayBugSummary() {
    	System.out.println("The BugID is: "+getBugID());
    	System.out.println("The Application Name is: "+getApplicationName());
    	System.out.println("The BugTitle is: "+getBugTitle());
    	System.out.println("The Severity of the Bug is: "+getSeverity());
    	System.out.println("The Priority is: "+getPriority());
    	System.out.println("The Status is: "+getStatus());
    	System.out.println("The Assigned Developer to this Bug is: "+getAssignedDeveloper());
    	
    }
	public static void main(String[] args) {
		BugTracker bg=new BugTracker();
		bg.bugId=200;
		bg.applicationName="CarePulse";
		bg.bugTitle="Scheduling";
		bg.severity="Moderate";
		bg.priority="High";
		bg.status="Pending";
		System.out.println("Before the Develper is assigned");
		bg.displayBugSummary();
		bg.assignToDeveloper(200,"Dedeepya");
		System.out.println("\n"+"After the Develper is assigned");
		bg.displayBugSummary();
		
	}

}
