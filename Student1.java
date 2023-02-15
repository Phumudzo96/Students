public class Student1 {
    String name;
    String studentNum;
    String programm;
    String level;

   public Student1(String name, String studentNum, String programm, String level){
       this.name = name;
       this.studentNum = studentNum;
       this.programm = programm;
       this.level = level;
   }

   public String getName(){
       return name;
   }
   

   public String getStudentNum(){
       return studentNum;
   }
    
   public String getProgramm(){
       return programm;
   }

   public String getLevel(){
       return level;
   }
   
   public String DisplayStudent1() {
       String output = "Name: " + name;
       output += "\nStudent number: " + studentNum;
       output += "\nProgramm: " + programm;
       output += "\nLevel: " + level;

       return output;
   }
}
