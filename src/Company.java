public class Company {
    private String name;
    private int size;

    public Company(String name, int size){
        this.name = name;
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString(){
        return "Company: " + name + " Size: " + size;
    }


}
