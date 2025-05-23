package Basic;
// In this we use to demonstarte a program with multiple classes and their execuation and calling.
//  For Example we create a Class Room in which we added two variable and one function
class Room{
    float length;
    float width;
    void getData(float a, float b){
        length = a;
        width = b;
    }
}

public class Question3 {
    public static void main(String args[]){
        float area; // Create a new variable 
        // Calling a class and assign it into new value room1 and use the properties of Class Room.
        Room room1 = new Room();
        room1.getData(12, 12);
        area = room1.length * room1.width;
        System.out.println("Area : "+ area);
    }
}
