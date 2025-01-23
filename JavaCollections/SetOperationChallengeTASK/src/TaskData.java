/*
The task data class will be used to set up and return some test data.
This class should have a getTask method, that returns a Set of Task. This method should take a String, either the name of one
of the employees to get a specific Set, or all to get the full task Set

 */


public class TaskData {

    private static String allTasks = """
            Infrastructure	 Logging	 High
            Infrastructure	 DB Access	 Medium
            Infrastructure	 Security	 High
            Infrastructure	 Password Policy	 Medium
            Data Design	 Task Table	 Medium
            Data Design	 Employee Table	 Medium
            Data Design	 Cross Reference Tables	 High
            Data Design	 Encryption Policy	 High
            Data Access	 Write Views	 Low
            Data Access	 Set Up Users	 Low
            Data Access	 Set Up Access Policy	 Low
            """;

    private static String annsTasks = """
            Infrastructure	 Security	 High	 In Progress
            Infrastructure	 Password Policy	Medium	 In Progress
            Research	 Cloud solutions	 Medium	 In Progress
            Data Design	 Encryption Policy	 High	
            Data Design	 Project Table	 Medium	
            Data Access	 Write Views	Low	 In Progress
            """;

    private static String bobsTasks = """
            Infrastructure	 Security	 High	 In Progress
            Infrastructure	 Password Policy	 Medium	
            Data Design	Encryption Policy	High	
            Data Access	Write Views	 Low	 In Progress
            """;

    private static String carolsTasks = """
            Infrastructure	 Logging	 High	 In Progress
            Infrastructure	 DB Access	 Medium	
            Infrastructure	 Password Policy	 Medium	
            Data Design	 Task Table	 High	
            Data Access	 Write Views	 Low
            """;




}
