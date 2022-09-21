import java.util.*;
class Event{
    String name;
    String detail;
    String type;
    String organiser;
    int attendeesCount;
    double projectedExpenses;
    
     public Event() {
    }
    
    public Event(String name, String detail, String type, String organiser, int attendeesCount, double projectedExpenses) {
        //System.out.println(projectedExpenses);
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiser = organiser;
        this.attendeesCount = attendeesCount;
        this.projectedExpenses = projectedExpenses;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getDetail() {
        return this.detail;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
    
    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }
    public String getOrganiser() {
        return this.organiser;
    }
    
    public void setAttendeesCount(int attendeesCount) {
        this.attendeesCount = attendeesCount;
    }
    public int getAttendeesCount() {
        return this.attendeesCount;
    }
    
    public void setProjectedExpenses(double projectedExpenses) {
        this.projectedExpenses = projectedExpenses;
    }
    public double getProjectedExpenses() {
        return this.projectedExpenses;
    }
    
    public String toString(){
        return "Name:"+name+"\nDetail:"+detail+"\nType:"+type+"\nOrganiser:"+organiser+"\nAttendees Count:"
        +attendeesCount+"\nProjected Expense:"+projectedExpenses;
    }
}
class Main{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String nam=sc.nextLine();
        String det=sc.nextLine();
        String ty=sc.nextLine();
        String or=sc.nextLine();
        int att=sc.nextInt();
        double pro=sc.nextDouble();
        //System.out.println(pro);
        Event e=new Event(nam,det,ty,or,att,pro);
        
        System.out.println(e);
        
        
    }
}