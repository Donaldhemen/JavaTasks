// collect number of students = students.length
// collect scores in array students using for loop
// create function to check best score
// use if condition to grade scores
// display results

import java.util.Arrays;
import java.util.Scanner;
public class AssignGrades{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of Students: ");
        int numberOfStudents = input.nextInt();
        double[] studentsScore = new double[numberOfStudents];
        
        
        System.out.println("Enter "+ numberOfStudents +" scores: ");
        for(int index = 0; index < numberOfStudents; index++){
            studentsScore[index] = input.nextDouble();
            
        }
        
        double bestScore = getBestScore(studentsScore);
        
        for(int index = 0; index < studentsScore.length; index++){
            char grade;
            
            if(studentsScore[index] >= (bestScore-10)){
                grade = 'A';
            }
            else if(studentsScore[index] >= (bestScore-20)){
                grade = 'B';
            }
            else if(studentsScore[index] >= (bestScore-30)){
                grade = 'C';
            }
            else if(studentsScore[index] >= (bestScore-40)){
                grade = 'D';
            }
            else {
                grade = 'F';
            }
        
            System.out.printf("Student %d is %f and grade is %s%n", index, studentsScore[index], grade);
        }
        
    }
    
    public static double getBestScore(double[] score){
        double bestScore = score[0];
        
        for(int index = 0; index < score.length; index++){
            if(score[index] > bestScore){
                bestScore = score[index];
            }
        }
        return bestScore;
    }
}
