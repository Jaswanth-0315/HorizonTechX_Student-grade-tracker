import java.util.Scanner;

class Marks
{
    public static void main(String args[])
        {   
        
           
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter number of students:");
            int totalStudents = sc.nextInt();
            System.out.println("Enter number of subjects:");
            int totalSubjects = sc.nextInt();

            int array[][] = new int[totalStudents][totalSubjects];



            for(int i=0;i<totalStudents;i++)
            {
                System.out.println("Enter marks of student "+(i+1)+":");
                for(int j = 0;j<totalSubjects;j++)
                    {
                        System.out.print("Subject "+(j+1)+"marks:");
                        array[i][j] = sc.nextInt();
                          
                    }
                    
                    
            }
            double highestAvg=-1;
            double lowestAvg=101;
            int highestStudentId=1;
            int lowestStudentId=1;

            System.out.println("Final marks");
            for(int i=0;i<totalStudents;i++)
                {
                    System.out.println("Student "+(i+1)+"'s Row:");
                    int totalMarks =0;
                    for(int j = 0;j<totalSubjects;j++)
                        {
                            System.out.print(array[i][j]+"\t");
                            totalMarks += array[i][j];
                        }
                        double avg = (double)totalMarks/totalSubjects;
                  
                        char grade;
                        if(avg >=90)
                            {
                                grade ='A';
                            }
                        else if(avg <=90 && avg >=80)
                            {
                                    grade ='B';
                            }
                            else if(avg <=80 && avg >=70)
                                {
                                    grade= 'C';
                                }
                            else if(avg <=60 && avg >=70)
                                {
                                    grade= 'D';                                
                                }
                            else if(avg <=50 && avg >=60)
                                {
                                    grade= 'E';                                
                                }
                            else
                                {
                                    grade= 'F';                               
                                 }  

                                System.out.printf("Avg :%.2f|Grade :%c%n", avg,grade);
                    if(avg>highestAvg)
                    {
                        highestAvg=avg;
                        highestStudentId=i+1;
                    }
                    if(avg>lowestAvg)
                        {
                            lowestAvg=avg;
                            lowestStudentId=i+1;
                        }

                }     
                System.out.println("Class Performance Summary");
                System.out.printf("Highest Performance Student : student %d with an avg%.2f \n",highestStudentId,highestAvg);
                System.out.println();
                System.out.printf("lowest Performance Student : student %d with an avg%.2f \n",lowestStudentId,lowestAvg);

                sc.close(); 
                
                

        }

    
}