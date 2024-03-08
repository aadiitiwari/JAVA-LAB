public class InstanceMethodExample {
    int s;  // declaring an instance variable
    
    // user-defined method because we have not used static keyword
    public int add(int a, int b) {
        s = a + b;  // calculating the sum and storing it in the instance variable 's'
        // returning the sum
        return s;   // returning the sum
    }
    
    public static void main(String[] args) {
        InstanceMethodExample obj = new InstanceMethodExample();  // creating an object of InstanceMethodExample class
        System.out.println("The sum is: " + obj.add(12, 13));  // calling the add method using the object
    }
}
