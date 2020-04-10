package by.neronskaya.Part4.simplestClassesAndObjects.Unit3;

public class StudentLogic {
    public boolean isAStudent(Student st) {
        int[] marks;

        marks = st.getMark();

        for (int mark : marks) {
            if (mark < 4) {
                System.out.println("Студент " + st.getName() + " " + st.getLastName() + "  группы № " + st.getGroupNumber() + " не отличник" + "\t");
                return false;
            }
        }
        System.out.println("Студент " + st.getName() + " " + st.getLastName() + "  группы № " + st.getGroupNumber() + " отличник" + "\t");
        return true;
    }
}