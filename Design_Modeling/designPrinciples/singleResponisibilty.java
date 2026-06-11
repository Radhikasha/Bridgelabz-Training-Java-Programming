class student{
    public void studentData(){
        System.out.println("Students record");

    }

}
class teacher{
    public void teacherData(){
        System.out.println("Teacher record");

    }

}
class helper{
    public void helperData(){
        System.out.println("Helpers record");

    }

}




class singleResponisibilty{
    public static void main(String[] args) {
        student s = new student();
        teacher t = new teacher();
        helper h = new helper();

        s.studentData();
        t.teacherData();
        h.helperData();
    }
    
}