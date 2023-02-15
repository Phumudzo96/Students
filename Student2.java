public class Student2 {
        String name;
        String studentNum;
        String programm1;
        String level1;
        String level2;
        String level3;
        String programm2;
     
        public Student2(String name, String studentNum, String programm1, String level1, String level2, String level3, String programm2){
            this.name = name;
            this.studentNum = studentNum;
            this.programm1 = programm1;
            this.level1 = level1;
            this.level2 = level2;
            this.level3 = level3;
            this.programm2 = programm2;
        }
     
        public String getName(){
            return name;
        }
     
        public String getStudentNum(){
            return studentNum;
        }
         
        public String getProgramm1(){
            return programm1;
        }
     
        public String getLevel1(){
            return level1;
        }

        public String getLevel2(){
            return level2;
        }

        public String getLevel3(){
            return level3;
        }

        public String getProgramm2(){
            return programm2;
        }
     
        public String DisplayStudent2() {
            String output = "Name: " + name;
            output += "\nStudent number: " + studentNum;
            output += "\nProgramm: " + programm1;
            output += "\nLevel: " + level1;
            output += "\nLevel: " + level2;
            output += "\nLevel: " + level3;
            output += "\nProgramm: " + programm2;

            return output;
        }
}