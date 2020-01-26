package com.company;

import java.util.ArrayList;

public class StudentList {


    private ArrayList<Student> A1;
    public StudentList(){ //สร้างArr
        A1 = new ArrayList<Student>();
    }

    public void addStudent(Student student){

        A1.add(student);  //เพิ่มนักเรียนในArr
    }

    public void showAllStudentInfo(){
        System.out.println(A1 ); //แสดงข้อมูลของนักเรียนทั้งหมดทุกคน
    }

   public int getNumberOfStudent(){
       System.out.println("Number Of Student: "+A1.size());
        return  A1.size(); //หาจำนวนนักเรียนทั้งหมด
   }

   public int searchStudentBystCode(String stcode){ //หาว่านักเรียนอยู่ index ไหนตามรหัสนักศึกษา

       for (int i=0; i<A1.size(); i++) {
           if (A1.get(i).GetCode().equals(stcode)){
               System.out.println("Index of Student: "+ i +" Number: " + stcode);
               return i;
           }
       }
       return -11111;
   }

   public void removeStudentBystCode(String stcode){
        for(int i=0; i<A1.size(); i++){
            if(A1.get(i).GetCode().equals(stcode)){
                A1.remove(i);
            }
        }
   }
    

}
